package bongda.login;

import android.content.Context;
import android.text.InputFilter;

import java.lang.reflect.Array;

import library.activity.VinhNT_Common;
import library.config.OnlyText;
import library.view.VinhNT_EditText;

/**
 * Created by Picachu on 3/17/2016.
 */
public class User extends VinhNT_EditText {
    public User(Context context) {
        super(context);
    }
    public String getHintToShow(){
        return "nhập tên User";
    }
    @Override
    public void init(){
        super.init();
        setKiTuNhap();
    }
    public void setKiTuNhap(){
        InputFilter[] mangCu = getFilters();
        InputFilter[] mangMoi = new InputFilter[mangCu.length+1];
        System.arraycopy(mangCu,0,mangMoi,0,mangCu.length);
        //
        OnlyText gioiHanNhap = new 	OnlyText();
        mangMoi[mangCu.length] = gioiHanNhap;
        //
        setFilters(mangMoi);
    }
    @Override
    public int getMaxLength(){
        return 9; // max length in text field
    }
    @Override
    public String get_field_name(){
        return "user";
    }

}
