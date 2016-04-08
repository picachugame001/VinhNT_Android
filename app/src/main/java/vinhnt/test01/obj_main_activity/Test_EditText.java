package vinhnt.test01.obj_main_activity;

import android.content.Context;
import android.text.InputType;

import library.view.VinhNT_EditText;

/**
 * Created by Picachu on 4/8/2016.
 */
public class Test_EditText extends VinhNT_EditText {
    public Test_EditText(Context context) {
        super(context);
        setRawInputType(InputType.TYPE_DATETIME_VARIATION_DATE);
    }
}
