package bongda.timkiemdoibong;

import android.content.Context;
import android.view.View;

import library.view.VinhNT_Button;

/**
 * Created by Picachu on 4/17/2016.
 */
public class Button_Tim_Kiem_Doi_Bong extends VinhNT_Button {
    private Tim_Doi_Bong_HTTP http;
    public Button_Tim_Kiem_Doi_Bong(Context context,Tim_Doi_Bong_HTTP in_http) {
        super(context);
        http = in_http;
    }
    @Override
    public String getNameButton(){
        return "Tìm kiếm";
    }
    @Override
    public void onClick(View v) {
        http.sendRequest();
    }
}
