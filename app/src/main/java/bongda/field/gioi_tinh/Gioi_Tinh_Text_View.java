package bongda.field.gioi_tinh;

import android.content.Context;

import org.json.JSONException;
import org.json.JSONObject;

import library.view.VinhNT_TextView_Param;

/**
 * Created by Picachu on 4/15/2016.
 */
public class Gioi_Tinh_Text_View extends VinhNT_TextView_Param {
    private boolean gioi;
    public Gioi_Tinh_Text_View(Context context) {
        super(context,"gioi_tinh");
        gioi = true;
    }
    @Override
    public void addParam(JSONObject input) {
        try{
            input.put(get_field_name(),gioi);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void getParam(JSONObject input) {
        try {
            set_Gioi_Tinh(input.getBoolean(get_field_name()));
            setText(input.getString(get_field_name()));
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
    private void set_Gioi_Tinh(boolean value){
        gioi = value;
        if(value){
            setText("Nam");
        }
        else{
            setText("Nữ");
        }
    }

}
