package library.view;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;

/**
 * Created by Picachu on 11/11/2015.
 * Update test
 */
public class VinhNT_TextView extends android.widget.TextView {

    public String getTextToShow(){
        return "Text của VinhNT";
    }
    public void init(){
        setText(getTextToShow());
    }

    public VinhNT_TextView(Context context) {
        super(context);
        init();
    }

    public VinhNT_TextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public VinhNT_TextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public VinhNT_TextView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init();
    }
}
