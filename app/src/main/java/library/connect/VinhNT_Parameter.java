package library.connect;

import android.content.Context;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

import library.view.Error_Input;

/**
 * Created by Picachu on 4/2/2016.
 */
public interface VinhNT_Parameter {
    public void addParam(JSONObject input);
    public String get_field_name();
    public void getParam(JSONObject input);
    public boolean isRequired();
    public ArrayList<Error_Input> checkInput();
    public Context getContext();
}
