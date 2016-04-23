package bongda.timkiemdoibong;

import android.content.Context;

import bongda.field.Ten_Doi_Bong;

/**
 * Created by Picachu on 4/23/2016.
 */
public class TimKiem_TenDoiBong_TextView extends Ten_Doi_Bong {
    public TimKiem_TenDoiBong_TextView(Context context) {
        super(context);
    }
    @Override
    public boolean isRequired(){
        return false;
    }
}
