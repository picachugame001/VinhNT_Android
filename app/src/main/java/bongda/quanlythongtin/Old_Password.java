package bongda.quanlythongtin;

import android.content.Context;

import bongda.field.Password;

/**
 * Created by Picachu on 4/11/2016.
 */
public class Old_Password extends Password {
    public Old_Password(Context context) {
        super(context);
    }
    @Override
    public String getHintToShow(){
        return "Mật khẩu cũ";
    }
    @Override
    public int getMaxLength(){
        return 9;
    }
    @Override
    public String get_field_name(){
        return "old_password";
    }

    @Override
    public boolean isRequired(){
        return true;
    }
}
