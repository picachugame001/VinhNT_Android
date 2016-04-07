package library.connect;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

import library.view.Error_Input;
import library.view.VinhNT_Dialog;

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
    public boolean checkInput(){
        boolean input_is_ok = true;
        int size = mang_Parameter.size();
        ArrayList<VinhNT_Dialog> mang_Error_Dialog = new ArrayList<VinhNT_Dialog>();
        for(int i=0;i<size;i++){
            ArrayList<Error_Input> a= mang_Parameter.get(i).checkInput();
            if(!a.isEmpty()){
                input_is_ok = false;
                int length_error =a.size();
                for(int j=0;j<length_error;j++){
                    VinhNT_Dialog thong_Bao_Loi = new VinhNT_Dialog(mang_Parameter.get(0).getContext());
                    thong_Bao_Loi.setTitle(a.get(j).get_Title_msg());
                    thong_Bao_Loi.setMessage(a.get(j).get_Description());
                    mang_Error_Dialog.add(thong_Bao_Loi);
                }
            }
        }
        int  size_Error = mang_Error_Dialog.size();
        for(int i=size_Error-1;i>-1;i--){
            mang_Error_Dialog.get(i).show();
        }
        return input_is_ok;
    }
}
