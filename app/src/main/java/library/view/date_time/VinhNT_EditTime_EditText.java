package library.view.date_time;

import android.content.Context;

import library.view.VinhNT_EditText;

/**
 * Created by Picachu on 4/27/2016.
 */
public class VinhNT_EditTime_EditText extends VinhNT_EditText {

    public VinhNT_EditTime_EditText(Context context) {
        super(context);
    }
    @Override
    public String getHintToShow(){
        return "nhập giờ";
    }
    @Override
    public void init() {
        super.init();
        //disable
        setInputType(0);
        setFocusable(false);
    }
}
