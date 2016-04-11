package bongda.field;

import android.content.Context;

import library.view.VinhNT_EditInteger;

/**
 * Created by Picachu on 4/8/2016.
 */
public class So_Dien_Thoai extends VinhNT_EditInteger {
    public So_Dien_Thoai(Context context) {
        super(context);
    }
    @Override
    public String getHintToShow(){
        return "nhập số điện thoại";
    }
    @Override
    public int getMaxLength(){
        return 15;
    }
    @Override
    public String get_field_name() {
        return "so_dien_thoai";
    }
}
