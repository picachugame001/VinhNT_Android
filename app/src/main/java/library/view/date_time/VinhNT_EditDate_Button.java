package library.view.date_time;

import android.app.DatePickerDialog;
import android.content.Context;
import android.view.View;
import android.widget.DatePicker;

import library.view.VinhNT_Button;

/**
 * Created by Picachu on 4/8/2016.
 */
public class VinhNT_EditDate_Button extends VinhNT_Button implements DatePickerDialog.OnDateSetListener {
    private VinhNT_EditDate date_main;
    public VinhNT_EditDate_Button(Context context, VinhNT_EditDate vinhNT_editDate) {
        super(context);
        date_main = vinhNT_editDate;
    }
    public String getNameButton(){
        return "Chọn ngày";
    }
    //
    @Override
    public void onClick(View v) {
        VinhNT_DatePickerDialog chonNgay = new VinhNT_DatePickerDialog(getContext(),this,date_main.get_Date_Current_Chose());
        chonNgay.show();
    }

    @Override
    public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
        VinhNT_Date ngayChon = new VinhNT_Date(year,monthOfYear+1,dayOfMonth);
        date_main.set_VinhNT_Date(ngayChon);
    }
}
