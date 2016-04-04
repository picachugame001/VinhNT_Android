package bongda.login;

import android.content.Context;
import android.content.Intent;
import android.view.View;

import bongda.dangkycauthu.DangKyCauThu_Form;
import library.activity.VinhNT_Activity;
import library.view.VinhNT_Button;

/**
 * Created by Picachu on 3/19/2016.
 */
public class Button_DangKi extends VinhNT_Button {
    private Login_Form nguCanh;
    public Button_DangKi(Login_Form context) {
        super(context);
        nguCanh = context;
    }
    @Override
    public String getNameButton(){
        return "Đăng Ký";
    }
    @Override
    public void onClick(View v) {
        //go to dang ky form
        Intent intent = new Intent(getContext(), DangKyCauThu_Form.class);
        nguCanh.startActivityForResult(intent,Login_Form.REQUEST_DANGKI);
    }
}
