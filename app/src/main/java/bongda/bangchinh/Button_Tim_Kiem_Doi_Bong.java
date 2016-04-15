package bongda.bangchinh;

import android.content.Context;
import android.content.Intent;
import android.view.View;

import bongda.timkiemdoibong.Tim_Kiem_Doi_Bong_Form;
import library.view.VinhNT_Button;

/**
 * Created by Picachu on 4/15/2016.
 */
public class Button_Tim_Kiem_Doi_Bong extends VinhNT_Button {
    public Button_Tim_Kiem_Doi_Bong(Context context) {
        super(context);
    }
    @Override
    public String getNameButton(){
        return "Tìm kiếm đội bóng";
    }
    @Override
    public void onClick(View v) {
        Intent intent = new Intent(getContext(), Tim_Kiem_Doi_Bong_Form.class);
        getContext().startActivity(intent);
    }
}
