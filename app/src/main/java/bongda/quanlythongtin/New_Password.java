package bongda.quanlythongtin;

import android.content.Context;

import bongda.field.Password;

/**
 * Created by Picachu on 4/11/2016.
 */
public class New_Password extends Password {
    public New_Password(Context context) {
        super(context);
    }
    @Override
    public String getHintToShow(){
        return "Nhập Password mới";
    }
    @Override
    public String get_field_name(){
        return "new_password";
    }

    @Override
    public boolean isRequired(){
        return false;
    }
}
