package bongda.dangkycauthu;

import com.android.volley.VolleyError;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import bongda.field.Email;
import bongda.field.gioi_tinh.Gioi_Tinh;
import bongda.field.Dia_Chi;
import bongda.field.Ho_Va_Ten_Dem;
import bongda.field.Ngay_Sinh;
import bongda.field.Password;
import bongda.field.So_CMND;
import bongda.field.So_Dien_Thoai;
import bongda.field.Ten;
import bongda.field.User;
import library.activity.VinhNT_Activity;
import library.connect.VinhNT_HTTP;
import library.view.VinhNT_Dialog;

/**
 * Created by Picachu on 4/3/2016.
 */
public class DangKyCauThu_HTTP extends VinhNT_HTTP {


    public DangKyCauThu_HTTP(VinhNT_Activity nguCanh) {
        super(nguCanh);
    }
    DangKyCauThu_Form form;
    public void setNguCanh(DangKyCauThu_Form a){
        form = a;
    }
    public void setInfo(User a, Password b, Ho_Va_Ten_Dem c, Ten d,Gioi_Tinh e,Ngay_Sinh f,Dia_Chi g,So_CMND h,So_Dien_Thoai i,Email j){
        add_Parameter(a);
        add_Parameter(b);
        add_Parameter(c);
        add_Parameter(d);
        add_Parameter(e);
        add_Parameter(f);
        add_Parameter(g);
        add_Parameter(h);
        add_Parameter(i);
        add_Parameter(j);
    }
    @Override
    public void onResponse(JSONObject response) {
        super.onResponse(response);
        if(!is_Error_Common()) {
            int lenngError = get_Error_Count();
            if (lenngError == 0) {
                //Dang ky thanh cong
                DangKy_ThanhCong thongBao = new DangKy_ThanhCong(getContext());
                thongBao.setNguCanh(form);
                thongBao.show();
            }
            for(int i = 0;i<lenngError;i++){
                int error_Code = get_Error_Code(i);
                switch (error_Code) {
                    case 1:
                        VinhNT_Dialog loi = new VinhNT_Dialog(getContext(),"Lỗi đăng ký","Id đăng kí đã tồn tại.");
                        loi.show();
                        break;
                    case 2:
                        VinhNT_Dialog loi2 = new VinhNT_Dialog(getContext(),"Lỗi đăng ký","số chứng minh thư đã có người đăng ký.");
                        loi2.show();
                        break;
                    case 3:
                        VinhNT_Dialog loi3 = new VinhNT_Dialog(getContext(),"Lỗi đăng ký","số điện thoại đã có người đăng ký.");
                        loi3.show();
                        break;
                    case 4:
                        VinhNT_Dialog loi4 = new VinhNT_Dialog(getContext(),"Lỗi đăng ký","email đã có người đăng ký.");
                        loi4.show();
                        break;
                }
            }
        }
    }
    @Override
    public void onErrorResponse(VolleyError error) {
        super.onErrorResponse(error);
    }
    @Override
    public String get_Function_Name(){
        return "dang_ky_cau_thu";
    }
    public String get_Tab(){
        if (tab == null){
            tab = "dangkyCauThu";
        }
        return tab;
    }
}
