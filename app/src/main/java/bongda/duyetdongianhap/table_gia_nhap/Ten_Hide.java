package bongda.duyetdongianhap.table_gia_nhap;

import android.content.Context;

import org.json.JSONObject;

import bongda.field.Ten;

/**
 * Created by Picachu on 4/27/2016.
 */
public class Ten_Hide extends Ten {
    private Checkbox_Chon_Cau_Thu checkbox;
    public Ten_Hide(Context context,Checkbox_Chon_Cau_Thu in_checkbox) {
        super(context);
        checkbox = in_checkbox;
        in_checkbox.set_Ten(this);
        setVisibility(GONE);
    }
    @Override
    public void getParam(JSONObject input) {
        super.getParam(input);
        checkbox.hien_Ten();
    }
}
