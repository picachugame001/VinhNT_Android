package bongda.chon_cong_ty.table_cong_ty;

import library.view.grid.radio.VinhNT_Grid_Radio;
import library.view.grid.radio.VinhNT_Grid_Row_Radio;

import android.content.Context;

/**
 * Created by Picachu on 5/15/2016.
 */
public class Bang_Cong_Ty<Dong_Cong_Ty extends VinhNT_Grid_Row_Radio> extends VinhNT_Grid_Radio<Dong_Cong_Ty>{
    public Bang_Cong_Ty(Context context, Class<Dong_Cong_Ty> cls) {
        super(context, cls);
    }
    @Override
    public String get_field_name() {
        return "bang_cong_ty";
    }
    @Override
    public boolean isRequired() {
        return true;
    }
}
