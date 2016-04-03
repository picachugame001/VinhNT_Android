package bongda.login;

import android.content.Context;
import android.content.Intent;
import android.view.View;

import bongda.dangkycauthu.DangKyCauThu_Form;
import library.view.VinhNT_Button;

/**
 * Created by Picachu on 3/19/2016.
 */
public class Button_DangKi extends VinhNT_Button {
    public Button_DangKi(Context context) {
        super(context);
    }
    @Override
    public String getNameButton(){
        return "Đăng Ký";
    }
    @Override
    public void onClick(View v) {
        //go to dang ky form
        Intent intent = new Intent(getContext(), DangKyCauThu_Form.class);
        getContext().startActivity(intent);
    }
}
