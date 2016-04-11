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
    public void onResponse(JSONObject response) {
        super.onResponse(response);
        try {
            JSONArray mang_error = response.getJSONArray("errors");
            int length = mang_error.length();
            if(length == 0) {
                //Dang ky thanh cong
                DangKy_ThanhCong thongBao = new DangKy_ThanhCong(getContext());
                thongBao.setNguCanh(form);
                thongBao.show();
            }
            else{
                //ten id da ton tai
                DangKy_TrungID_Msg thongBao = new DangKy_TrungID_Msg(getContext());
            }
        } catch (JSONException e) {
            e.printStackTrace();
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
