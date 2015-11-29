package library.view;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.EditText;

/**
 * Created by Picachu on 11/15/2015.
 */
public class VinhNT_EditInteger extends EditText {

    public String getHintToShow(){
        return "nhập gì vào đây";
    }

    public int getMaxNumber(){
        return 9999; // max length in text field
    }
	//commit 01
	//commit 02
    public int getMinNumber(){
        return -9999; // max length in text field
    }

    public void init(){
        setHint(getHintToShow());
    }

    public VinhNT_EditInteger(Context context) {
        super(context);
    }

    public VinhNT_EditInteger(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public VinhNT_EditInteger(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public VinhNT_EditInteger(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }
}
