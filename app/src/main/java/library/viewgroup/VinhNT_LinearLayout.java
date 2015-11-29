package library.viewgroup;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

/**
 * Created by Picachu on 11/11/2015.
 */
public class VinhNT_LinearLayout extends LinearLayout {

    public void init(){
        setOrientation(super.VERTICAL);
    }

    public VinhNT_LinearLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    public VinhNT_LinearLayout(Context context) {
        super(context);
        init();
    }

    public VinhNT_LinearLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }
}
