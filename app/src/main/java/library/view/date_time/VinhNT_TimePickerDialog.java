package library.view.date_time;

import android.app.TimePickerDialog;
import android.content.Context;

/**
 * Created by Picachu on 4/27/2016.
 */
public class VinhNT_TimePickerDialog extends TimePickerDialog{
    public VinhNT_TimePickerDialog(Context context, OnTimeSetListener listener,VinhNT_Time default_time) {
        super(context, listener, default_time.getHour(), default_time.getMinute(), true);
    }
}
