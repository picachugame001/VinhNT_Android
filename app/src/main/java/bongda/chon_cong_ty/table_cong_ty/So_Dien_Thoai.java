package bongda.chon_cong_ty.table_cong_ty;

import android.content.Context;

import library.view.VinhNT_TextView_Param;

/**
 * Created by Picachu on 5/18/2016.
 */
public class So_Dien_Thoai extends VinhNT_TextView_Param{
    public So_Dien_Thoai(Context context) {
        super(context);
    }
    @Override
    public String get_field_name() {
        return "so_dien_thoai";
    }
}
