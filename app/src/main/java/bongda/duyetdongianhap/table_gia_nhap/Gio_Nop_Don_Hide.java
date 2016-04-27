package bongda.duyetdongianhap.table_gia_nhap;

import android.content.Context;

import org.json.JSONObject;

import library.view.date_time.VinhNT_EditTime;

/**
 * Created by Picachu on 4/27/2016.
 */
public class Gio_Nop_Don_Hide extends VinhNT_EditTime {
    private Ngay_Gio_Nop_Don text;
    public Gio_Nop_Don_Hide(Context context,Ngay_Gio_Nop_Don in_ngay_gio) {
        super(context);
        setVisibility(GONE);
        text = in_ngay_gio;
        text.set_gio_nop_don_hide(this);
    }
    @Override
    public void getParam(JSONObject input) {
        super.getParam(input);
        text.hien_ngay_gio();
    }
    public String get_field_name() {
        return "gio_nop_don";
    }
}
