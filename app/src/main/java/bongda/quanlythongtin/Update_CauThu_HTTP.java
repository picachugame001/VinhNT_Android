package bongda.quanlythongtin;

import com.android.volley.VolleyError;

import org.json.JSONArray;
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
        params.add_Parameter(k);
        params.add_Parameter(a);
        params.add_Parameter(b);
        params.add_Parameter(c);
        params.add_Parameter(d);
        params.add_Parameter(e);
        params.add_Parameter(f);
        params.add_Parameter(g);
        params.add_Parameter(h);
        params.add_Parameter(i);
        params.add_Parameter(j);

    }
    @Override
    public String get_Function_Name(){
        return "cap_nhat_cau_thu";
    }
    @Override
    public void onResponse(JSONObject response) {
        super.onResponse(response);
        try {
            JSONArray errors = response.getJSONArray("errors");
            int i=errors.length();
            if(i==0){
                Update_ThanhCong_Dialog a = new Update_ThanhCong_Dialog(getContext());a.show();
            }
            else{
                for(int j=0;j<i;j++){
                    JSONObject b = errors.getJSONObject(j);
                    int error_code = b.getInt("code");
                    switch (error_code){
                        case 1:
                            MatKhau_Sai_Dialog viewerror = new MatKhau_Sai_Dialog(getContext());
                            viewerror.show();
                        break;
                    }
                }
            }
        }
        catch (Exception e){

        }
    }
    @Override
    public void onErrorResponse(VolleyError error) {
        super.onErrorResponse(error);
    }
}
