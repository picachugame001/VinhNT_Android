package bongda.field;

import android.content.Context;


import library.view.VinhNT_EditEmail;

/**
 * Created by Picachu on 4/8/2016.
 */
public class Email extends VinhNT_EditEmail {
    public Email(Context context) {
        super(context);
    }
    public String getHintToShow(){
        return "nhập email";
    }
    public int getMaxLength(){
        return 50; // max length in text field
    }
    @Override
    public String get_field_name() {
        return "email";
    }
}
