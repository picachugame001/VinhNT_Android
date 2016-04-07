package bongda.dangkycauthu;

import android.content.Context;

import library.view.VinhNT_EditText;

/**
 * Created by Picachu on 4/7/2016.
 */
public class Ten extends VinhNT_EditText {
    public Ten(Context context) {
        super(context);
    }
    protected String field_name;
    @Override
    public String getHintToShow(){
        return "Nhập tên của bạn";
    }
    @Override
    public int getMaxLength(){
        return 20; // max length in text field
    }
    @Override
    public String get_field_name() {
        if(field_name == null){
            field_name = "ten";
        }
        return field_name;
    }
    @Override
    public boolean isRequired(){
        return true;
    }
}

