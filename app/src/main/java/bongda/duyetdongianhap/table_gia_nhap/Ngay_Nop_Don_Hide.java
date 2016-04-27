package bongda.duyetdongianhap.table_gia_nhap;

import android.content.Context;

import library.view.date_time.VinhNT_EditDate;

/**
 * Created by Picachu on 4/27/2016.
 */
public class Ngay_Nop_Don_Hide extends VinhNT_EditDate {
    private Ngay_Gio_Nop_Don text;
    public Ngay_Nop_Don_Hide(Context context,Ngay_Gio_Nop_Don in_ngay_gio) {
        super(context);
        setVisibility(GONE);
        text = in_ngay_gio;
        text.set_ngay_nop_don_hide(this);
    }
    @Override
    public String get_field_name() {
        return "ngay_nop_don";
    }
}
