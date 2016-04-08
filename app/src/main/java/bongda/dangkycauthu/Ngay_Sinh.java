package bongda.dangkycauthu;

import android.content.Context;

import library.view.date_time.VinhNT_EditDate;

/**
 * Created by Picachu on 4/8/2016.
 */
public class Ngay_Sinh extends VinhNT_EditDate{
    public Ngay_Sinh(Context context) {
        super(context);
    }
    @Override
    public String get_field_name() {
        return "ngay_sinh";
    }
}
