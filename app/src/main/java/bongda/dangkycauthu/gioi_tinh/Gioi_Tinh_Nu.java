package bongda.dangkycauthu.gioi_tinh;

import android.content.Context;

import library.view.radio.VinhNT_RadioButton;

/**
 * Created by Picachu on 4/7/2016.
 */
public class Gioi_Tinh_Nu extends VinhNT_RadioButton {
    public Gioi_Tinh_Nu(Context context) {
        super(context);
        setValue(1);
        setLabel("Nữ");
    }
}
