package bongda.thach_dau_tat_ca;

import android.content.Context;
import android.content.Intent;
import android.view.View;

import library.view.VinhNT_Button;

/**
 * Created by Picachu on 5/15/2016.
 */
public class Button_Thach_Dau_Tat_Ca extends VinhNT_Button {
    public Button_Thach_Dau_Tat_Ca(Context context) {
        super(context);
    }
    @Override
    public String getNameButton(){
        return "Thách đấu tất cả";
    }
    @Override
    public void onClick(View v) {
        Intent intent = new Intent(getContext(), Thach_Dau_Tat_Ca_Form.class);
        getContext().startActivity(intent);
    }
}
