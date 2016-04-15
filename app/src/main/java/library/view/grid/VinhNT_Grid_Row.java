package library.view.grid;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

import library.connect.VinhNT_Parameter;
import library.view.Error_Input;
import library.viewgroup.VinhNT_LinearLayout;

/**
 * Created by Picachu on 4/14/2016.
 */
public class VinhNT_Grid_Row extends VinhNT_LinearLayout implements VinhNT_Parameter {
    private ArrayList<VinhNT_Parameter> set_Data;
    //
    protected void add_To_Set_Data(VinhNT_Parameter data){
        set_Data.add(data);
    }
    protected void get_JSONObject(JSONObject output){
        int length = set_Data.size();
        for(int i=0;i<length;i++){
            set_Data.get(i).addParam(output);
        }
    }
    protected void set_JSONObject(JSONObject input){
        int length = set_Data.size();
        for(int i=0;i<length;i++){
            set_Data.get(i).getParam(input);
        }
    }

    public VinhNT_Grid_Row(Context context) {
        super(context);
        set_Data = new ArrayList<VinhNT_Parameter>();
    }

    @Override
    public void addParam(JSONObject input) {
        get_JSONObject(input);
    }

    @Override
    // hàm này không cần quan tâm
    public String get_field_name() {
        return "Row";
    }

    @Override
    public void getParam(JSONObject input) {
        set_JSONObject(input);
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
