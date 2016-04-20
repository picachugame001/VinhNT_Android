package bongda.timkiemdoibong;

import android.content.Context;
import android.view.View;

import library.view.VinhNT_Button;

/**
 * Created by Picachu on 4/17/2016.
 */
public class Button_Xin_Gia_Nhap extends VinhNT_Button {
    private Gia_Nhap_HTTP http;
    public Button_Xin_Gia_Nhap(Context context
            ,Gia_Nhap_HTTP in_http) {
        super(context);
        http = in_http;
    }
    @Override
    public String getNameButton(){
        return "Xin gia nhập";
    }
    @Override
    public void onClick(View view){
        http.sendRequest();
    }
}
