package library.view.date_time;

import android.content.Context;
import android.widget.LinearLayout;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

import library.activity.VinhNT_Common;
import library.connect.VinhNT_Parameter;
import library.view.Error_Input;
import library.view.VinhNT_EditText;

/**
 * Created by Picachu on 4/8/2016.
 */
public class VinhNT_EditDate extends LinearLayout implements VinhNT_Parameter {
    //
    private VinhNT_Date data;
    protected VinhNT_Date date_default;
    //
    private VinhNT_EditDate_EditText chuoiNgay;
    private VinhNT_EditDate_Button button_Chon;
    public VinhNT_EditDate(Context context) {
        super(context);
        init();
    }
    public void init(){
        //
        setOrientation(LinearLayout.HORIZONTAL);//phần tử con nằm ngang
        //
        chuoiNgay = new VinhNT_EditDate_EditText(getContext());
        button_Chon = new VinhNT_EditDate_Button(getContext(),this);
        //
        addView(chuoiNgay, VinhNT_Common.size_90_per);
        addView(button_Chon, VinhNT_Common.size_10_per);
        //
        set_VinhNT_Date(getDate_default());
    }
    public VinhNT_Date getDate_default(){
        if(date_default == null){
            date_default = VinhNT_Common.current_Date;
        }
        return date_default;
    }
    public void show_VinhNTDate_To_EditText(){
        int year = data.getYear();
        String display;
        if(year == 0){
            display = "";
        }
        else{
            int month = data.getMonth();
            int date = data.getDate();
            display = date + "/" + month + "/" + year;
        }
        chuoiNgay.setText(display);
    }
    public void set_VinhNT_Date(VinhNT_Date date_input){
        data = date_input;
        show_VinhNTDate_To_EditText();
    }
    public VinhNT_Date get_Date_Current_Chose(){
        if(data==null){
            return VinhNT_Common.current_Date;
        }
        if(data.getYear() == 0){
            return VinhNT_Common.current_Date;
        }
        return data;
    }

    @Override
    public void addParam(JSONObject input)  {
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
            show_VinhNTDate_To_EditText();
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    @Override
    public boolean isRequired() {
        return false;
    }

    @Override
    public ArrayList<Error_Input> checkInput(){
        ArrayList<Error_Input> reuturn_Error = new ArrayList<Error_Input>();
        if(isRequired()==true && data.getYear() == 0){
            String errorMessage = "trường "+get_field_name()+" là bắt buộc nhập";
            reuturn_Error.add(new Error_Input("1", "Lỗi bắt buộc nhập", errorMessage));
        }
        return reuturn_Error;
    }
}
