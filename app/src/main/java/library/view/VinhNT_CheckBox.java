package library.view;

import android.content.Context;
import android.widget.CheckBox;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

import library.connect.VinhNT_Parameter;

/**
 * Created by Picachu on 4/15/2016.
 */
public class VinhNT_CheckBox extends CheckBox implements VinhNT_Parameter {
    public VinhNT_CheckBox(Context context) {
        super(context);
    }
    public VinhNT_CheckBox(Context context,String text) {
        super(context);
        setText(text);
    }

    @Override
    public void addParam(JSONObject input) {
        try {
            input.put(get_field_name(),isChecked());
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String get_field_name() {
        return "check";
    }

    @Override
    public void getParam(JSONObject input) {
        try {
            boolean data = input.getBoolean(get_field_name());
            setChecked(data);
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
}
