package bongda.dangkycauthu;

import android.content.Context;
import android.util.Log;
import android.view.View;

import bongda.login.Login_HTTP;
import library.activity.Dialog_LoiKetNoi;
import library.activity.VinhNT_Common;
import library.view.VinhNT_Button;

/**
 * Created by Picachu on 4/3/2016.
 */
public class Button_OK_DangKy extends VinhNT_Button {
    private DangKyCauThu_HTTP request;
    public void setHTTP(DangKyCauThu_HTTP a){
        request = a;
    }
    public Button_OK_DangKy(Context context) {
        super(context);
    }
    @Override
    public String getNameButton(){
        return "OK";
    }
    @Override
    public void onClick(View v) {
        if(VinhNT_Common.isNetworkAvailable(getContext())){
            Log.d("ket noi", "co");
            request.sendRequest();
        }
        else{
            Dialog_LoiKetNoi error = new Dialog_LoiKetNoi(getContext());
            error.show();
        }
    }
}
