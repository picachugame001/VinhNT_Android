package bongda.chon_cong_ty;

import android.content.Context;
import android.content.Intent;
import android.view.View;

import library.view.VinhNT_Button;

/**
 * Created by Picachu on 5/15/2016.
 */
public class VinhNT_CongTy_Button extends VinhNT_Button{
    private VinhNT_CongTy_Text cong_ty_text;
    private Chon_Cong_Ty_Control control;
    public VinhNT_CongTy_Button(Context context,VinhNT_CongTy_Text in_cong_ty_text,Chon_Cong_Ty_Control in_control) {
        super(context);
        cong_ty_text = in_cong_ty_text;
        control = in_control;
    }
    @Override
    public void onClick(View v) {
        Intent intent = new Intent(getContext(), Chon_Cong_Ty_Form.class);
        getContext().startActivity(intent);
    }
    @Override
    public String getNameButton(){
        return "Chọn";
    }

}
