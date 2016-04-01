package bongda.login;

import android.content.Context;
import android.os.StrictMode;
import android.util.Log;
import android.view.View;

import java.io.IOException;

import library.activity.Dialog_LoiKetNoi;
import library.activity.VinhNT_Common;
import library.connect.VinhNT_HTTP;
import library.view.VinhNT_Button;
import library.view.VinhNT_Dialog;

/**
 * Created by Picachu on 3/19/2016.
 */
public class Button_Login extends VinhNT_Button  {
    private VinhNT_HTTP request;
    public void setHTTP(VinhNT_HTTP a){
        request = a;
    }
    public Button_Login(Context context) {
        super(context);
    }
    @Override
    public String getNameButton(){
        return "Login";
    }
    @Override
    public void onClick(View v) {
        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder()
                .permitAll().build();
        StrictMode.setThreadPolicy(policy);
        if(VinhNT_Common.isNetworkAvailable(getContext())){
            Log.d("ket noi","co");
            //String json = request.bowlingJson("Jesse", "Jake");
            request.sendRequest();
        }
        else{
            Dialog_LoiKetNoi error = new Dialog_LoiKetNoi(getContext());
            error.show();
        }
    }
}
