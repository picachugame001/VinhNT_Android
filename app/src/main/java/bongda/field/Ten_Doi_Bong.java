package bongda.field;

import android.content.Context;

import library.view.VinhNT_EditText;

/**
 * Created by Picachu on 4/14/2016.
 */
public class Ten_Doi_Bong extends VinhNT_EditText {
    public Ten_Doi_Bong(Context context) {
        super(context);
    }
    @Override
    public String getHintToShow(){
        return "nhập tên đội bóng";
    }
    @Override
    public String get_field_name() {
        return "ten_doi_bong";
    }
    @Override
    public int getMaxLength(){
        return 30; // max length in text field
    }
    @Override
    public boolean isRequired(){
        return true;
    }
}
