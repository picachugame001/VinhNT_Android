package library.view.date_time;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by Picachu on 4/8/2016.
 */
public class VinhNT_Date {
    private int year;
    private int month;
    private int date;
    //
    public VinhNT_Date(int y,int m,int d){
        year = y;
        month = m;
        date = d;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public JSONObject get_JSONObject(){
        JSONObject return_obj = new JSONObject();
        try{
            return_obj.put("year",year);
            return_obj.put("month",month);
            return_obj.put("date",date);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return return_obj;
    }
    public void getParam_From_JSONObject(JSONObject input){
        try {
            year = input.getInt("year");
            month= input.getInt("month");
            date = input.getInt("date");
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
