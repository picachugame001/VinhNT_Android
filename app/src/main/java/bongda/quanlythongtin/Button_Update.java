package bongda.quanlythongtin;

import android.content.Context;
import android.view.View;

import library.view.VinhNT_Button;

/**
 * Created by Picachu on 4/12/2016.
 */
public class Button_Update extends VinhNT_Button {
    private Quan_Ly_Thong_Tin_Form form;
    private Update_CauThu_HTTP http;
    public Button_Update(Context context,Update_CauThu_HTTP a1) {
        super(context);
        http = a1;
    }
    @Override
    public String getNameButton(){
        return "Update";
    }
    @Override
    public void onClick(View v) {
        http.sendRequest();
    }
}
