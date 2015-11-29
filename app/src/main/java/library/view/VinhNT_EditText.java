package library.view;

import android.content.Context;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.EditText;

/**
 * Created by Picachu on 11/11/2015.
 */
public class VinhNT_EditText extends EditText {

    public String getHintToShow(){
        return "nhập gì vào đây";
    }

    public int getMaxLength(){
        return 16; // max length in text field
    }

    public void init(){
        setHint(getHintToShow());
        setFilters (new InputFilter[]{
                new InputFilter.LengthFilter(getMaxLength())}
            //..
        );
    }

    public VinhNT_EditText(Context context) {
        super(context);
        init();
    }

    public VinhNT_EditText(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public VinhNT_EditText(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }
}
