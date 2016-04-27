package library.view.date_time;

import org.json.JSONException;
import org.json.JSONObject;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

/**
 * Created by Picachu on 4/27/2016.
 */
public class VinhNT_Time {

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    private int hour;
    private int minute;
    private int second;
    //
    public VinhNT_Time(int h,int m,int s){
        hour = h;
        minute = m;
        second = s;
    }
    //
    //
    public JSONObject get_JSONObject(){
        JSONObject return_obj = new JSONObject();
        try{
            return_obj.put("hour",hour);
            return_obj.put("minute",minute);
            return_obj.put("second",second);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return return_obj;
    }
    public void getParam_From_JSONObject(JSONObject input){
        try {
            hour = input.getInt("hour");
            minute= input.getInt("minute");
            second = input.getInt("second");
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
    public void  getParam_From_String(String stringDate){
        DateFormat format = new SimpleDateFormat("k:m:s", Locale.ENGLISH);
        try {
            Calendar date_temp = Calendar.getInstance();
            date_temp.setTime(format.parse(stringDate));
            hour = date_temp.get(Calendar.HOUR);
            minute= date_temp.get(Calendar.MINUTE);
            second = date_temp.get(Calendar.SECOND);
        } catch (ParseException e) {
            e.printStackTrace();
            hour = 24;
            minute = 0;
            second = 0;
        }
    }
}
