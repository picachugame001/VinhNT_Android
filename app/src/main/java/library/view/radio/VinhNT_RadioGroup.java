package library.view.radio;

import android.content.Context;
import android.widget.RadioGroup;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import library.activity.VinhNT_Common;
import library.connect.VinhNT_Parameter;
import library.view.Error_Input;

/**
 * Created by Picachu on 4/7/2016.
 */
public class VinhNT_RadioGroup extends RadioGroup implements VinhNT_Parameter {
    private int index;
    public HashMap<Integer,VinhNT_RadioButton> mang_RadioButton;
    public VinhNT_RadioGroup(Context context) {
        super(context);
        index = 0;
        mang_RadioButton = new HashMap<Integer,VinhNT_RadioButton>();
    }
    public void add_VinhNT_RadioButton(VinhNT_RadioButton in){
        addView(in,index++,VinhNT_Common.size_VERTICAL);
        mang_RadioButton.put(in.getId(), in);
    }
    public void set_Default(VinhNT_RadioButton in){
        check(in.getId());
    }

    @Override
    public void addParam(JSONObject input)  {
        try{
            int vai = getCheckedRadioButtonId();
            input.put(get_field_name(),mang_RadioButton.get(getCheckedRadioButtonId ()).getValue());

        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String get_field_name() {
        return "";//TODO
    }

    @Override
    public void getParam(JSONObject input) {
        try {
            //check(input.getInt(get_field_name()));
            int value_compare = input.getInt(get_field_name());
            /*for(int i=0;i<length;i++){
                if(mang_RadioButton.get(i).getValue()==value_compare){
                    check(i);
                    break;
                }
            }*/
            Iterator it = mang_RadioButton.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry pair = (Map.Entry)it.next();
                VinhNT_RadioButton comp= (VinhNT_RadioButton)pair.getValue();
                if(comp.getValue() == value_compare) {
                    check(comp.getId());
                    break;
                }
            }
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
        ArrayList<Error_Input> reuturn_Error = new ArrayList<Error_Input>();
        if(isRequired()==true && getCheckedRadioButtonId() == -1){
            String errorMessage = "trường "+get_field_name()+" là bắt buộc nhập";
            reuturn_Error.add(new Error_Input("1","Lỗi bắt buộc nhập",errorMessage));
        }
        return reuturn_Error;
    }
}
