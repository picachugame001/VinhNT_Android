package bongda.bangchinh;

import android.content.Context;
import android.content.Intent;
import android.view.View;

import bongda.dangkydoibong.Dang_Ky_Doi_Bong_Form;
import library.view.VinhNT_Button;

/**
 * Created by Picachu on 4/14/2016.
 */
public class Button_Dang_Ky_Doi_Bong extends VinhNT_Button {
    public Button_Dang_Ky_Doi_Bong(Context context) {
        super(context);
    }
    @Override
    public void onClick(View v) {
        Intent intent = new Intent(getContext(), Dang_Ky_Doi_Bong_Form.class);
        getContext().startActivity(intent);
    }
    public String getNameButton(){
        return "Đăng ký đội bóng";
    }
}
