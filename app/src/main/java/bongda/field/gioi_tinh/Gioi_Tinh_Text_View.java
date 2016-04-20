package bongda.field.gioi_tinh;

import android.content.Context;

import org.json.JSONException;
import org.json.JSONObject;

import library.view.VinhNT_TextView_Param;

/**
 * Created by Picachu on 4/15/2016.
 */
public class Gioi_Tinh_Text_View extends VinhNT_TextView_Param {
    private int gioi;
    public Gioi_Tinh_Text_View(Context context) {
        super(context,"gioi_tinh");
        gioi = 1;
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
            set_Gioi_Tinh(input.getInt(get_field_name()));
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
    private void set_Gioi_Tinh(int value){
        gioi = value;
        if(gioi == 1){
            setText("Nam");
        }
        else{
            setText("Nữ");
        }
    }

}
