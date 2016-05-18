package bongda.chon_cong_ty;

import android.content.Context;
import android.content.Intent;
import android.view.View;

import library.activity.VinhNT_Activity;
import library.view.VinhNT_Button;

/**
 * Created by Picachu on 5/15/2016.
 */
public class VinhNT_CongTy_Button extends VinhNT_Button{
    private VinhNT_CongTy_Text cong_ty_text;
    private Chon_Cong_Ty_Control control;
    private VinhNT_Activity nguCanh;
    public VinhNT_CongTy_Button(VinhNT_Activity in_nguCanh,VinhNT_CongTy_Text in_cong_ty_text,Chon_Cong_Ty_Control in_control) {
        super(in_nguCanh);
        cong_ty_text = in_cong_ty_text;
        control = in_control;
        nguCanh = in_nguCanh;
    }
    @Override
    public void onClick(View v) {
        Intent intent = new Intent(getContext(), Chon_Cong_Ty_Form.class);
        nguCanh.startActivityForResult(intent, 101);
    }

    @Override
    public String getNameButton(){
        return "Chọn";
    }

}
