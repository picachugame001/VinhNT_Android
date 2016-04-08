package library.view.date_time;

import android.app.DatePickerDialog;
import android.content.Context;

/**
 * Created by Picachu on 4/8/2016.
 */
public class VinhNT_DatePickerDialog extends DatePickerDialog {
    public VinhNT_DatePickerDialog(Context context, OnDateSetListener callBack, int year, int monthOfYear, int dayOfMonth) {
        super(context, callBack, year, monthOfYear, dayOfMonth);
    }
}
