package library.view;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.text.InputFilter;
import android.text.InputType;
import android.util.AttributeSet;
import android.view.View;
import android.widget.EditText;

import org.json.JSONException;
import org.json.JSONObject;

import library.connect.VinhNT_Parameter;

/**
 * Created by Picachu on 11/15/2015.
 */
public class VinhNT_EditInteger extends EditText implements VinhNT_Parameter {

    public String getHintToShow(){
        return "nhập gì vào đây";
    }

    public int getMaxNumber(){
        return 9999; // max length in text field
    }
	//commit 01
	//commit 02
    public int getMinNumber(){
        return -9999; // max length in text field
    }

    public int getMaxLength(){
        return 8;
    }

    @TargetApi(Build.VERSION_CODES.JELLY_BEAN_MR1)
    public void init(){
        setHint(getHintToShow());
        setInputType(InputType.TYPE_CLASS_NUMBER);
        setTextAlignment(View.TEXT_ALIGNMENT_TEXT_END);// rignt align
        setMaxLength();
    }

    public VinhNT_EditInteger(Context context) {
        super(context);
        init();
    }

    public VinhNT_EditInteger(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public VinhNT_EditInteger(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public VinhNT_EditInteger(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
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
}
