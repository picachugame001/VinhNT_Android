package bongda.duyetdongianhap.table_gia_nhap;

import android.content.Context;

import library.view.VinhNT_TextView;

/**
 * Created by Picachu on 4/27/2016.
 */
public class Ngay_Gio_Nop_Don extends VinhNT_TextView {
    Ngay_Nop_Don_Hide ngay_nop_don_hide;
    Gio_Nop_Don_Hide gio_nop_don_hide;
    public Ngay_Gio_Nop_Don(Context context) {
        super(context);
    }
    public void set_ngay_nop_don_hide(Ngay_Nop_Don_Hide in_ngay_nop_don){
        ngay_nop_don_hide = in_ngay_nop_don;
    }
    public void set_gio_nop_don_hide(Gio_Nop_Don_Hide in_gio_nop_don){
        gio_nop_don_hide = in_gio_nop_don;
    }
    public void hien_ngay_gio(){
        String ngay = ngay_nop_don_hide.getTextValue();
        String gio = gio_nop_don_hide.getTextValue();
        setText(ngay.concat(" ").concat(gio));
    }
}
