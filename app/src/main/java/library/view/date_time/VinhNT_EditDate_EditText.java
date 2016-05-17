package library.view.date_time;

import android.app.DatePickerDialog;
import android.content.Context;
import android.view.View;
import android.widget.DatePicker;

import library.view.VinhNT_EditText;

/**
 * Created by Picachu on 4/8/2016.
 */
public class VinhNT_EditDate_EditText extends VinhNT_EditText {
    public VinhNT_EditDate_EditText(Context context) {
        super(context);
    }
    @Override
    public String getHintToShow(){
        return "nhập ngày";
    }
    @Override
    public void init() {
        super.init();
        //disable
        setInputType(0);
        setFocusable(false);
    }

}
