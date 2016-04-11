package bongda.field;

import android.content.Context;

import library.view.VinhNT_EditInteger;

/**
 * Created by Picachu on 4/8/2016.
 */
public class So_CMND extends VinhNT_EditInteger {
    public So_CMND(Context context) {
        super(context);
    }
    @Override
    public String getHintToShow(){
        return "số chứng minh thư";
    }
    @Override
    public int getMaxLength(){
        return 15;
    }
    @Override
    public String get_field_name() {
        return "so_cmnd";
    }
    @Override
    public boolean isRequired(){
        return true;
    }
}
