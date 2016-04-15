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
    public VinhNT_TextView(Context context,String text_Display){
        this(context);
        setText(text_Display);
    }
}
