package bongda.dangkycauthu;

import com.android.volley.VolleyError;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import bongda.login.Password;
import bongda.login.User;
import library.activity.VinhNT_Activity;
import library.connect.VinhNT_HTTP;

/**
 * Created by Picachu on 4/3/2016.
 */
public class DangKyCauThu_HTTP extends VinhNT_HTTP {


    public DangKyCauThu_HTTP(VinhNT_Activity nguCanh) {
        super(nguCanh);
    }
    public void setInfo(User a,Password b){
        params.add_Parameter(a);
        params.add_Parameter(b);
    }
    @Override
    public void onResponse(JSONObject response) {
        super.onResponse(response);
        try {
            JSONArray mang_error = response.getJSONArray("errors");
            int length = mang_error.length();
            if(length == 0) {
                //Dang ky thanh cong
            }
            else{
                //ten id da ton tai
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
}
