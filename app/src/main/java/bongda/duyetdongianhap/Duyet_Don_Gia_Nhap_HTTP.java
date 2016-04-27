package bongda.duyetdongianhap;

import org.json.JSONObject;

import bongda.dangkydoibong.Dang_Ky_Doi_Bong_Hoan_Tat_Dialog;
import bongda.duyetdongianhap.table_gia_nhap.Grid_Don_Gia_Nhap;
import bongda.duyetdongianhap.table_gia_nhap.Row_Don_Gia_Nhap;
import library.activity.VinhNT_Activity;
import library.connect.VinhNT_HTTP;
import library.view.VinhNT_Dialog;
import library.view.VinhNT_TextView_Param_Hide;

/**
 * Created by Picachu on 4/27/2016.
 */
public class Duyet_Don_Gia_Nhap_HTTP extends VinhNT_HTTP {
    Grid_Don_Gia_Nhap<Row_Don_Gia_Nhap> table;
    public Duyet_Don_Gia_Nhap_HTTP(VinhNT_Activity nguCanh
            ,   VinhNT_TextView_Param_Hide ma_doi_bong
            ,   Grid_Don_Gia_Nhap<Row_Don_Gia_Nhap> in_table
    ) {
        super(nguCanh);
        add_Parameter(ma_doi_bong);
        add_Parameter(in_table);
        table = in_table;
    }
    @Override
    public String get_Function_Name(){
        return "duyet_don_gia_nhap";
    }
    @Override
    public void onResponse(JSONObject response) {
        super.onResponse(response);
        if(!is_Error_Common()) {
            int lenngError = get_Error_Count();
            if (lenngError == 0) {
                VinhNT_Dialog loi = new VinhNT_Dialog(getContext(),"Thông báo","Duyệt đơn thành công");
                loi.show();
            }
            for(int i = 0;i<lenngError;i++){
                int error_Code = get_Error_Code(i);
                int sub_code = get_Sub_Code(i);
                String ten_cau_thu = table.get_Row(sub_code).get_ten_cau_thu();
                switch (error_Code) {
                    /*case 6:
                        VinhNT_Dialog loi6 = new VinhNT_Dialog(getContext(),"Lỗi đăng ký","tên đội bóng đã có người đăng ký.");
                        loi6.show();
                        break;
                    case 14:
                        VinhNT_Dialog loi14 = new VinhNT_Dialog(getContext(),"Lỗi đăng ký","Bạn đã đăng ký một đội bóng.");
                        loi14.show();
                        break;*/
                    case 11:

                        VinhNT_Dialog loi11 = new VinhNT_Dialog(getContext(),"Lỗi duyệt","Cầu thủ "+ten_cau_thu+" đã đăng ký trước đó.");
                        loi11.show();
                        break;
                    case 12:

                        VinhNT_Dialog loi12 = new VinhNT_Dialog(getContext(),"Lỗi duyệt","Cầu thủ "+ten_cau_thu+" đã gia nhập 3 đội bóng và không thể gia nhập được nữa.");
                        loi12.show();
                }
            }
        }
    }
}
