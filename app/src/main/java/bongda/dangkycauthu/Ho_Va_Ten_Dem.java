package bongda.dangkycauthu;

import android.content.Context;

import library.view.VinhNT_EditText;

/**
 * Created by Picachu on 4/7/2016.
 */
public class Ho_Va_Ten_Dem extends VinhNT_EditText {
    protected String field_name;
    public Ho_Va_Ten_Dem(Context context) {
        super(context);
    }
    @Override
    public String getHintToShow(){
        return "Họ và tên đệm của bạn";
    }
    @Override
    public int getMaxLength(){
        return 30; // max length in text field
    }
    @Override
    public String get_field_name() {
        if(field_name == null){
            field_name = "ho_ten_dem";
        }
        return field_name;
    }
    @Override
    public boolean isRequired(){
        return true;
    }
}
