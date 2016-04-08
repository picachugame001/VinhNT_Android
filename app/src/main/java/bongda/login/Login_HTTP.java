package bongda.login;

import android.content.Intent;

import com.android.volley.VolleyError;

import org.json.JSONException;
import org.json.JSONObject;

import bongda.bangchinh.BangChinh_Form;
import library.activity.VinhNT_Activity;
import library.connect.VinhNT_HTTP;

/**
 * Created by Picachu on 4/2/2016.
 */
public class Login_HTTP extends VinhNT_HTTP {
    public Login_HTTP(VinhNT_Activity nguCanh) {
        super(nguCanh);
    }
    public void set_Param(User a, Password b){
        params.add_Parameter(a);
        params.add_Parameter(b);
    }
    @Override
    public void onResponse(JSONObject response) {
        super.onResponse(response);
        boolean ketQua = false;
        try {
            ketQua = response.getBoolean("result");
        }
        catch (JSONException e) {
            e.printStackTrace();
        }
        if(ketQua){
            //dang nhap thanh cong
            Intent intent = new Intent(context, BangChinh_Form.class);
            context.startActivity(intent);
        }
        else{
            //dang nhap that bai
            Login_Error em= new Login_Error(getContext());
            em.show();
        }

    }

    @Override
    public void onErrorResponse(VolleyError error) {
        super.onErrorResponse(error);
    }
    @Override
    public String get_Function_Name(){
        return "login";
    }
    public String get_Tab(){
        if (tab == null){
            tab = "login";
        }
        return tab;
    }
}
