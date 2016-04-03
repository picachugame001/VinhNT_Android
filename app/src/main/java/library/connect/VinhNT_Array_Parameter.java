package library.connect;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

/**
 * Created by Picachu on 4/2/2016.
 */
public class VinhNT_Array_Parameter {
    private ArrayList<VinhNT_Parameter> mang_Parameter;
    public VinhNT_Array_Parameter(){
        mang_Parameter = new ArrayList<VinhNT_Parameter>();
    }
    public void add_Parameter(VinhNT_Parameter node){
        if(node != null){
            mang_Parameter.add(node);
        }
    }
    public void set_Parameter(JSONObject json){
        int size = mang_Parameter.size();
        for(int i=0;i<size;i++){
            try{
                mang_Parameter.get(i).addParam(json);
            } catch (JSONException e) {
                e.printStackTrace();
            }

        }
    }
    public void set_Function_Name(JSONObject json,String function){
        try {
            json.put("function", function);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
