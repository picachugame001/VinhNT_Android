package library.view;

import android.content.Context;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

import library.connect.VinhNT_Parameter;

/**
 * Created by Picachu on 4/15/2016.
 */
public class VinhNT_TextView_Param extends VinhNT_TextView implements VinhNT_Parameter {
    private String field_name;
    public VinhNT_TextView_Param(Context context,String in_field_name,String text_display) {
        this(context, in_field_name);
        setText(text_display);
    }
    public VinhNT_TextView_Param(Context context,String in_field_name){
        super(context);
        field_name = in_field_name;
    }
    public VinhNT_TextView_Param(Context context){
        super(context);
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
        return field_name;
    }

    @Override
    public void getParam(JSONObject input) {
        try {
            setText(input.getString(get_field_name()));
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
        return null;
    }
    @Override
    public String getTextToShow(){
        return "";
    }
}
