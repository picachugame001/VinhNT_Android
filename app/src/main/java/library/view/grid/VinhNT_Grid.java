package library.view.grid;

import android.content.Context;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

import library.connect.VinhNT_Parameter;
import library.view.Error_Input;
import library.viewgroup.VinhNT_LinearLayout;

/**
 * Created by Picachu on 4/14/2016.
 */
public class VinhNT_Grid<E extends VinhNT_Grid_Row> extends VinhNT_LinearLayout implements VinhNT_Parameter {
    private ArrayList<E> array_Row;
    private Class<E> myClass;
    public VinhNT_Grid(Context context,Class<E> cls) {
        super(context);
        myClass = cls;
        array_Row = new ArrayList<E>();
    }
    public void add_Row(E row){
        array_Row.add(row);
        addView(row);

    }
    public void clear_All_Row(){
        removeAllViews();
        array_Row.clear();
    }



    @Override
    public void addParam(JSONObject input) {
        int length = array_Row.size();
        JSONArray JSON_Array = new JSONArray();
        for(int i=0;i<length;i++){
            JSONObject JSON_Element = new JSONObject();
            array_Row.get(i).addParam(JSON_Element);
            JSON_Array.put(JSON_Element);
        }
        try {
            input.put(get_field_name(),JSON_Array);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String get_field_name() {
        return "vinhnt_grid";
    }

    @Override
    public void getParam(JSONObject input) {
        clear_All_Row();
        JSONArray JSON_Array;
        try {
            JSON_Array = input.getJSONArray(get_field_name());
            int length = JSON_Array.length();
            for(int i=0;i<length;i++){
                JSONObject element = JSON_Array.getJSONObject(i);
                E newRow = myClass.getDeclaredConstructor(Context.class).newInstance(getContext());
                newRow.getParam(element);
                add_Row(newRow);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    @Override
    public boolean isRequired() {
        return false;
    }

    @Override
    public ArrayList<Error_Input> checkInput() {
        ArrayList<Error_Input> error_array = new ArrayList<Error_Input>();
        return error_array;
    }
}
