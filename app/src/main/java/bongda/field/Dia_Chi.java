package bongda.field;

import android.content.Context;

import library.view.VinhNT_EditText;

/**
 * Created by Picachu on 4/8/2016.
 */
public class Dia_Chi extends VinhNT_EditText {
    public Dia_Chi(Context context) {
        super(context);
    }
    @Override
    public String getHintToShow(){
        return "nhập địa chỉ";
    }

    @Override
    public int getMaxLength(){
        return 50; // max length in text field
    }

    @Override
    public String get_field_name() {
        return "dia_chi";
    }
}
