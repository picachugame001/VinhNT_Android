package bongda.dangkydoibong;

import android.content.Context;
import android.view.View;

import library.view.VinhNT_Button;

/**
 * Created by Picachu on 4/14/2016.
 */
public class Button_OK_Dang_Ky_Doi_Bong extends VinhNT_Button {
    private Dang_Ky_Doi_Bong_HTTP dang_ky_doi_bong_http;
    public Button_OK_Dang_Ky_Doi_Bong(Context context,Dang_Ky_Doi_Bong_HTTP http) {
        super(context);
        dang_ky_doi_bong_http = http;
    }
    @Override
    public void onClick(View v) {
        dang_ky_doi_bong_http.sendRequest();
    }
    @Override
    public String getNameButton(){
        return "Đăng ký";
    }

}
