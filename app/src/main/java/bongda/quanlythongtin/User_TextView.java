package bongda.quanlythongtin;

import android.content.Context;
import android.graphics.Color;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

import library.connect.VinhNT_Parameter;
import library.view.Error_Input;
import library.view.VinhNT_TextView;

/**
 * Created by Picachu on 4/12/2016.
 */
public class User_TextView extends VinhNT_TextView implements VinhNT_Parameter {
    public User_TextView(Context context, String text_Display) {
        super(context, text_Display);
        setTextSize(25f);
        setTextColor(Color.BLUE);
    }

    @Override
    public void addParam(JSONObject input) {
        try{
            input.put(get_field_name(),getText().toString());
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String get_field_name() {
        return "user";
    }

    @Override
    public void getParam(JSONObject input) {

    }

    @Override
    public boolean isRequired() {
        return false;
    }

    @Override
    public ArrayList<Error_Input> checkInput() {
        return null;
    }
}
