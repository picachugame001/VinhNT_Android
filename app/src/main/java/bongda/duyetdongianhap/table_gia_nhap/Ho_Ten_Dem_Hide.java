package bongda.duyetdongianhap.table_gia_nhap;

import android.content.Context;

import bongda.field.Ho_Va_Ten_Dem;

/**
 * Created by Picachu on 4/27/2016.
 */
public class Ho_Ten_Dem_Hide extends Ho_Va_Ten_Dem {
    private Checkbox_Chon_Cau_Thu checkbox;
    public Ho_Ten_Dem_Hide(Context context,Checkbox_Chon_Cau_Thu in_checkbox) {
        super(context);
        checkbox = in_checkbox;
        in_checkbox.set_Ho_Ten(this);
        init();
    }
    @Override
    public void init(){
        setVisibility(GONE);
    }
}
