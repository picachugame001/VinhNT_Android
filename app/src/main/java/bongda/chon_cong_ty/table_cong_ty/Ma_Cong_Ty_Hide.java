package bongda.chon_cong_ty.table_cong_ty;

import android.content.Context;
import android.view.View;

import library.view.VinhNT_TextView_Param_Hide;

/**
 * Created by Picachu on 5/18/2016.
 */
public class Ma_Cong_Ty_Hide extends VinhNT_TextView_Param_Hide {
    public Ma_Cong_Ty_Hide(Context context) {
        super(context);

    }
    @Override
    public String get_field_name() {
        return "ma_cong_ty";
    }
}
