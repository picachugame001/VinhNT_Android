package bongda.chon_cong_ty;

import android.content.Context;

import library.view.VinhNT_EditText;

/**
 * Created by Picachu on 5/15/2016.
 */
public class VinhNT_CongTy_Text extends VinhNT_EditText {
    public VinhNT_CongTy_Text(Context context) {
        super(context);
        //disable
        setInputType(0);
        setFocusable(false);
    }
    @Override
    public String getHintToShow(){
        return "nhập công ty";
    }
}
