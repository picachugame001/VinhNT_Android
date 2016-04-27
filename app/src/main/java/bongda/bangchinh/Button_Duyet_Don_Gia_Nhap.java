package bongda.bangchinh;

import android.content.Context;
import android.content.Intent;
import android.view.View;

import bongda.duyetdongianhap.Duyet_Don_Gia_Nhap_Form;
import library.view.VinhNT_Button;

/**
 * Created by Picachu on 4/27/2016.
 */
public class Button_Duyet_Don_Gia_Nhap extends VinhNT_Button {
    public Button_Duyet_Don_Gia_Nhap(Context context) {
        super(context);
    }
    public String getNameButton(){
        return "Duyệt đơn gia nhập";
    }
    @Override
    public void onClick(View v) {
        Intent intent = new Intent(getContext(), Duyet_Don_Gia_Nhap_Form.class);
        getContext().startActivity(intent);
    }
}
