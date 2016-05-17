package library.view.grid.radio;

import android.content.Context;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;

import library.view.grid.VinhNT_Grid;
import library.view.grid.VinhNT_Grid_Row;
import library.view.radio.VinhNT_RadioButton;

/**
 * Created by Picachu on 5/15/2016.
 */
public class VinhNT_Grid_Radio<E extends VinhNT_Grid_Row_Radio> extends VinhNT_Grid<E> {
    @Override
    public void addParam(JSONObject input) {
        ArrayList<E> array_Row = super.getArray_Row();
        int length = array_Row.size();
        for(int i=0;i<length;i++){
            if(array_Row.get(i).is_Row_Get()){
                JSONObject JSON_Element = new JSONObject();
                array_Row.get(i).addParam(JSON_Element);
                try {
                    input.put(get_field_name(), JSON_Element);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                break;
            }
        }
    }
    private VinhNT_Grid_Row_Radio row_check ;
    public VinhNT_Grid_Radio(Context context, Class<E> cls) {
        super(context, cls);
        row_check = null;
    }
    public void unCheckAll(){
        row_check = null;
        int size = get_count_row();
        for(int i=0;i<size;i++){
            get_Row(i).unCheckRadio();
        }
    }
    @Override
    public void clear_All_Row(){
        super.clear_All_Row();
        row_check = null;
    }
    public void check_Row(VinhNT_Grid_Row_Radio in_row_Check){
        if(row_check!=null){
            row_check.unCheckRadio();
        }
        row_check = in_row_Check;
    }
    @Override
    protected E newRow(){
        E newRow = null;
        try {
            newRow = getMyClass().getDeclaredConstructor(Context.class, VinhNT_Grid_Radio.class).newInstance(getContext(),this);
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        return newRow;
    }

}
