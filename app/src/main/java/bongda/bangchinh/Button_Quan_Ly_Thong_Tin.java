package bongda.bangchinh;

import android.content.Context;
import android.content.Intent;
import android.view.View;

import bongda.quanlythongtin.Quan_Ly_Thong_Tin_Form;
import library.view.VinhNT_Button;

/**
 * Created by Picachu on 4/11/2016.
 */
public class Button_Quan_Ly_Thong_Tin extends VinhNT_Button {
    public Button_Quan_Ly_Thong_Tin(Context context) {
        super(context);
    }
    @Override
    public String getNameButton(){
        return "Quản lý thông tin";
    }
    @Override
    public void onClick(View v) {
        Intent intent = new Intent(getContext(), Quan_Ly_Thong_Tin_Form.class);
        getContext().startActivity(intent);
    }
}
