package bongda.timkiemdoibong;

import org.json.JSONObject;

import bongda.timkiemdoibong.danh_sach_doi_bong.Row_Doi_Bong;
import bongda.timkiemdoibong.danh_sach_doi_bong.Table_Doi_Bong;
import bongda.timkiemdoibong.danh_sach_doi_bong.Ten_Doi_Bong_TextView_Hide;
import library.activity.VinhNT_Activity;
import library.connect.VinhNT_HTTP;
import library.view.VinhNT_Dialog;
import library.view.VinhNT_TextView_Param_Hide;

/**
 * Created by Picachu on 4/17/2016.
 */
public class Gia_Nhap_HTTP extends VinhNT_HTTP {
    private Table_Doi_Bong<Row_Doi_Bong> table;
    public Gia_Nhap_HTTP(VinhNT_Activity nguCanh
            ,VinhNT_TextView_Param_Hide in_user
            ,Table_Doi_Bong in_table) {
        super(nguCanh);
        add_Parameter(in_user);
        add_Parameter(in_table);
        table = in_table;
    }
    @Override
    public String get_Function_Name(){
        return "gia_nhap_doi_bong";
    }
    public void onResponse(JSONObject response) {
        super.onResponse(response);
        if(!is_Error_Common()){
            int lenngError = get_Error_Count();
            if (lenngError == 0) {
                VinhNT_Dialog loi = new VinhNT_Dialog(getContext(),"Thông báo","Nộp đơn thành công");
                loi.show();
            }
            for(int i = 0;i<lenngError;i++) {
                int error_Code = get_Error_Code(i);
                int sub_code = get_Sub_Code(i);
                Ten_Doi_Bong_TextView_Hide ten_doi_bong_da_dang_ky = table.get_Row(sub_code).get_ten_doi_bong();
                String tên_doi_bong = ten_doi_bong_da_dang_ky.getText().toString();
                switch (error_Code) {
                    case 10:

                        VinhNT_Dialog loi = new VinhNT_Dialog(getContext(),"Lỗi đăng ký","Đội "+tên_doi_bong+" đã được nộp đơn.");
                        loi.show();
                        break;
                    case 11:
                        VinhNT_Dialog loi2 = new VinhNT_Dialog(getContext(),"Lỗi đăng ký","bạn đã là thành viên của đội đội "+tên_doi_bong+".");
                        loi2.show();
                        break;
                }
            }
        }
    }
}
