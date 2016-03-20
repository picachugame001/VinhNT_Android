package bongda.login;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.text.InputType;
import android.text.method.PasswordTransformationMethod;
import android.view.View;

import library.view.VinhNT_EditInteger;
import library.view.VinhNT_EditText;

/**
 * Created by Picachu on 3/19/2016.
 */
public class Passworkd extends VinhNT_EditInteger {
    public Passworkd(Context context) {
        super(context);
    }
    @TargetApi(Build.VERSION_CODES.JELLY_BEAN_MR1)
    public void init(){
        super.init();
        //setInputType(InputType.TYPE_NUMBER_VARIATION_PASSWORD);
        setTransformationMethod(PasswordTransformationMethod.getInstance());
        setTextAlignment(View.TEXT_ALIGNMENT_TEXT_START);
    }
    @Override
    public String getHintToShow(){
        return "Nhập Password";
    }
}
