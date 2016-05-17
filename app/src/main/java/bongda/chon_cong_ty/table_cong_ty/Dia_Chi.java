package bongda.chon_cong_ty.table_cong_ty;

import android.content.Context;

import library.view.VinhNT_TextView_Param;

/**
 * Created by Picachu on 5/18/2016.
 */
public class Dia_Chi extends VinhNT_TextView_Param {
    public Dia_Chi(Context context) {
        super(context);
    }
    @Override
    public String get_field_name() {
        return "dia_chi";
    }
}
