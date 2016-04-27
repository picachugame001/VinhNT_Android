package bongda.duyetdongianhap;

import android.content.Context;
import android.view.View;

import library.view.VinhNT_Button;

/**
 * Created by Picachu on 4/27/2016.
 */
public class Button_Duyet_Don extends VinhNT_Button {
    private Duyet_Don_Gia_Nhap_HTTP http;
    public Button_Duyet_Don(Context context
        ,   Duyet_Don_Gia_Nhap_HTTP in_http
    ) {
        super(context);
        http = in_http;
    }
    @Override
    public String getNameButton(){
        return "Duyệt";
    }
    @Override
    public void onClick(View v) {
        http.sendRequest();
    }
}
