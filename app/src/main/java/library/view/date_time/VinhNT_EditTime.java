package library.view.date_time;

import android.content.Context;
import android.widget.LinearLayout;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

import library.activity.VinhNT_Common;
import library.connect.VinhNT_Parameter;
import library.view.Error_Input;

/**
 * Created by Picachu on 4/27/2016.
 */
public class VinhNT_EditTime  extends LinearLayout implements VinhNT_Parameter {
    private VinhNT_Time data;
    protected VinhNT_Time time_default;
    //
    private VinhNT_EditTime_EditText chuoiGio;
    private VinhNT_EditTime_Button button_Chon;
    public VinhNT_EditTime(Context context) {
        super(context);
        init();
    }
    public void init(){
        //
        setOrientation(LinearLayout.HORIZONTAL);//phần tử con nằm ngang
        //
        chuoiGio = new VinhNT_EditTime_EditText(getContext());
        button_Chon = new VinhNT_EditTime_Button(getContext(),this);
        //
        addView(chuoiGio, VinhNT_Common.size_90_per);
        addView(button_Chon, VinhNT_Common.size_10_per);
        //
        set_VinhNT_Time(getTime_default());
    }
    public VinhNT_Time getTime_default(){
        if(time_default == null){
            time_default = VinhNT_Common.current_Time;
        }
        return time_default;
    }
    public void show_VinhNTTime_To_EditText(){
        int hour = data.getHour();
        String display;
        if(hour == 24){
            display = "";
        }
        else{
            int minute = data.getMinute();
            int second = data.getSecond();
            display = hour + ":" + minute + ":" + second;
        }
        chuoiGio.setText(display);
    }
    public void set_VinhNT_Time(VinhNT_Time time_input){
        data = time_input;
        show_VinhNTTime_To_EditText();
    }
    public VinhNT_Time get_Time_Current_Chose(){
        if(data==null){
            return VinhNT_Common.current_Time;
        }
        if(data.getHour() == 24){
            return VinhNT_Common.current_Time;
        }
        return data;
    }

    @Override
    public void addParam(JSONObject input) {
        try{
            input.put(get_field_name(),data.get_JSONObject());
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String get_field_name() {
        return "a";
    }

    @Override
    public void getParam(JSONObject input) {
        try {
            Object test_Type = input.get(get_field_name()) ;
            if (test_Type instanceof JSONObject){
                data.getParam_From_JSONObject(input.getJSONObject(get_field_name()));

            }
            if(test_Type instanceof String){
                data.getParam_From_String(input.getString(get_field_name()));

            }
            show_VinhNTTime_To_EditText();
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    @Override
    public boolean isRequired() {
        return false;
    }

    @Override
    public ArrayList<Error_Input> checkInput() {
        ArrayList<Error_Input> reuturn_Error = new ArrayList<Error_Input>();
        if(isRequired()==true && data.getHour() == 24){
            String errorMessage = "trường "+get_field_name()+" là bắt buộc nhập";
            reuturn_Error.add(new Error_Input("1", "Lỗi bắt buộc nhập", errorMessage));
        }
        return reuturn_Error;
    }
    public String getTextValue(){
        return chuoiGio.getText().toString();
    }
}
