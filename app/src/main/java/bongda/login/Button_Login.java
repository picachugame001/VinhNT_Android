package bongda.login;

import android.content.Context;
import android.util.Log;
import android.view.View;

import library.activity.Dialog_LoiKetNoi;
import library.activity.VinhNT_Common;
import library.view.VinhNT_Button;
import library.view.VinhNT_Dialog;

/**
 * Created by Picachu on 3/19/2016.
 */
public class Button_Login extends VinhNT_Button  {
    public Button_Login(Context context) {
        super(context);
    }
    @Override
    public String getNameButton(){
        return "Login";
    }
    @Override
    public void onClick(View v) {
        if(VinhNT_Common.isNetworkAvailable(getContext())){
            Log.d("ket noi","co");
        }
        else{
            Dialog_LoiKetNoi error = new Dialog_LoiKetNoi(getContext());
            error.show();
        }
    }
}
