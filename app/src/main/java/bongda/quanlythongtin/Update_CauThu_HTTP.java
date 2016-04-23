package bongda.quanlythongtin;

import com.android.volley.VolleyError;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import bongda.field.Dia_Chi;
import bongda.field.Email;
import bongda.field.Ho_Va_Ten_Dem;
import bongda.field.Ngay_Sinh;
import bongda.field.So_CMND;
import bongda.field.So_Dien_Thoai;
import bongda.field.Ten;
import bongda.field.User;
import bongda.field.gioi_tinh.Gioi_Tinh;
import library.activity.VinhNT_Activity;
import library.connect.VinhNT_HTTP;
import library.view.VinhNT_Dialog;

/**
 * Created by Picachu on 4/13/2016.
 */
public class Update_CauThu_HTTP extends VinhNT_HTTP {
    private New_Password new_password;
    private Old_Password old_password;
    private Ho_Va_Ten_Dem ho_va_ten_dem;
    private Ten ten;
    private Gioi_Tinh gioi_tinh;
    private Ngay_Sinh ngay_sinh;
    private Dia_Chi dia_chi;
    private So_CMND so_cmnd;
    private So_Dien_Thoai so_dien_thoai;
    private Email email;
    public Update_CauThu_HTTP(
                VinhNT_Activity nguCanh
            ,   New_Password a
            ,   Old_Password b
            ,   Ho_Va_Ten_Dem c
            ,   Ten d
            ,   Gioi_Tinh e
            ,   Ngay_Sinh f
            ,   Dia_Chi g
            ,   So_CMND h
            ,   So_Dien_Thoai i
            ,   Email j
            ,   User_TextView k
    ) {
        super(nguCanh);
        add_Parameter(k);
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
    public String get_Function_Name(){
        return "cap_nhat_cau_thu";
    }
    @Override
    public void onResponse(JSONObject response) {
        super.onResponse(response);
        if(!is_Error_Common()) {
            int lenngError = get_Error_Count();
            if (lenngError == 0) {
                Update_ThanhCong_Dialog a = new Update_ThanhCong_Dialog(getContext());a.show();
            }
            for(int i = 0;i<lenngError;i++){
                int error_Code = get_Error_Code(i);
                switch (error_Code) {
                    case 2:
                        VinhNT_Dialog loi2 = new VinhNT_Dialog(getContext(),"Lỗi cập nhật","số chứng minh thư đã có người đăng ký.");
                        loi2.show();
                        break;
                    case 3:
                        VinhNT_Dialog loi3 = new VinhNT_Dialog(getContext(),"Lỗi cập nhật","số điện thoại đã có người đăng ký.");
                        loi3.show();
                        break;
                    case 4:
                        VinhNT_Dialog loi4 = new VinhNT_Dialog(getContext(),"Lỗi cập nhật","email đã có người đăng ký.");
                        loi4.show();
                        break;
                    case 5:
                        VinhNT_Dialog loi5 = new VinhNT_Dialog(getContext(),"Lỗi cập nhật","mật khẩu cũ chưa chính xác.");
                        loi5.show();
                        break;
                }
            }
        }
    }
    @Override
    public void onErrorResponse(VolleyError error) {
        super.onErrorResponse(error);
    }
}
