package library.view;

import android.content.Context;
import android.text.Editable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.EditText;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

import library.connect.VinhNT_Parameter;

/**
 * Created by Picachu on 11/11/2015.
 */
public class VinhNT_EditText extends EditText implements VinhNT_Parameter {

    public String getHintToShow(){
        return "nhập gì vào đây";
    }

    public int getMaxLength(){
        return 16; // max length in text field
    }

    public void init(){
        setHint(getHintToShow());
        setFilters (new InputFilter[]{
                new InputFilter.LengthFilter(getMaxLength())}
            //..
        );
        setMaxLines (1);
        setSingleLine();
    }

    public VinhNT_EditText(Context context) {
        super(context);
        init();
    }

    public VinhNT_EditText(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public VinhNT_EditText(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }
    public void setMaxLength(){
        InputFilter.LengthFilter gioihan = new InputFilter.LengthFilter(getMaxLength());
        InputFilter.LengthFilter[] mangfilter= new InputFilter.LengthFilter[1];
        mangfilter[0] = gioihan;
        setFilters(mangfilter);
    }

    @Override
    public void addParam(JSONObject input) {
        try{
            input.put(get_field_name(),this.getText());
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String get_field_name() {
        return "a";
    }

    @Override
    public void getParam(JSONObject input){
        try {
            setText(input.getString(get_field_name()));
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
    @Override
    public boolean isRequired(){
        return false;
    }
    @Override
    public ArrayList<Error_Input> checkInput(){
        ArrayList<Error_Input> reuturn_Error = new ArrayList<Error_Input>();
        if(isRequired()==true && getText().toString().equals("")){
            String errorMessage = "trường "+get_field_name()+" là bắt buộc nhập";
            reuturn_Error.add(new Error_Input("1", "Lỗi bắt buộc nhập", errorMessage));
        }
        return reuturn_Error;
    }
}
