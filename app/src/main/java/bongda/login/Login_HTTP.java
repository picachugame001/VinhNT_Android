package bongda.login;

import android.util.Log;

import com.android.volley.VolleyError;

import org.json.JSONException;
import org.json.JSONObject;

import library.activity.Dialog_LoiKetNoi;
import library.activity.VinhNT_Activity;
import library.connect.VinhNT_HTTP;

/**
 * Created by Picachu on 4/2/2016.
 */
public class Login_HTTP extends VinhNT_HTTP {
    public Login_HTTP(VinhNT_Activity nguCanh) {
        super(nguCanh);
    }
    public Login_HTTP(VinhNT_Activity nguCanh,User a,Passworkd b) {
        this(nguCanh);
        user = a;
        password = b;
    }
    private User user;
    private Passworkd password;
    @Override
    public void setData() throws JSONException {
        data = new JSONObject();
        data.put("function", "login");
        data.put("user", user.getText());
        data.put("password", password.getText());
    }
    @Override
    public void onResponse(JSONObject response) {
        boolean ketQua = false;
        try {
            ketQua = response.getBoolean("result");
        }
        catch (JSONException e) {
            e.printStackTrace();
        }
        if(ketQua){
            //dang nhap thanh cong
        }
        else{
            //dang nhap that bai
            Login_Error em= new Login_Error(getContext());
            em.show();
        }
    }

    @Override
    public void onErrorResponse(VolleyError error) {
        Log.d("Ket noi", "Loi roi");
        Dialog_LoiKetNoi error2 = new Dialog_LoiKetNoi(context);
        error2.show();
    }
}
