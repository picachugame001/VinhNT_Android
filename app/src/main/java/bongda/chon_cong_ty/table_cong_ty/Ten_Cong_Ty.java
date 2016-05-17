package bongda.chon_cong_ty.table_cong_ty;

import android.content.Context;

import library.view.VinhNT_TextView_Param;

/**
 * Created by Picachu on 5/18/2016.
 */
public class Ten_Cong_Ty extends VinhNT_TextView_Param {
    public Ten_Cong_Ty(Context context) {
        super(context);
    }
    @Override
    public String get_field_name() {
        return "ten_cong_ty";
    }
}
