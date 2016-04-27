package library.view.date_time;

import android.app.TimePickerDialog;
import android.content.Context;
import android.view.View;
import android.widget.TimePicker;

import library.view.VinhNT_Button;

/**
 * Created by Picachu on 4/27/2016.
 */
public class VinhNT_EditTime_Button extends VinhNT_Button implements TimePickerDialog.OnTimeSetListener {
    private VinhNT_EditTime time_main;

    public VinhNT_EditTime_Button(Context context,VinhNT_EditTime time) {
        super(context);
        time_main = time;
    }
    @Override
    public void onClick(View v) {
        VinhNT_TimePickerDialog chonGio = new VinhNT_TimePickerDialog(getContext(),this,time_main.get_Time_Current_Chose());
        chonGio.show();
    }
    @Override
    public String getNameButton(){
        return "Chọn giờ";
    }
    @Override
    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
        VinhNT_Time gio_Chon = new VinhNT_Time(hourOfDay,minute,1);
        time_main.set_VinhNT_Time(gio_Chon);
    }
}
