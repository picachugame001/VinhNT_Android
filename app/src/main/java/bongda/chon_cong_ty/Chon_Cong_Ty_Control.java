package bongda.chon_cong_ty;

import android.content.Context;

import org.json.JSONObject;

import java.util.ArrayList;

import library.activity.VinhNT_Activity;
import library.activity.VinhNT_Common;
import library.connect.VinhNT_Parameter;
import library.view.Error_Input;
import library.viewgroup.VinhNT_LinearLayout_ChieuNgang;

/**
 * Created by Picachu on 5/15/2016.
 */
public class Chon_Cong_Ty_Control extends VinhNT_LinearLayout_ChieuNgang implements VinhNT_Parameter {
    private String ma_cong_ty;
    private VinhNT_CongTy_Text cong_ty_text;
    private VinhNT_CongTy_Button cong_ty_button;
    private VinhNT_Activity nguCanh;
    public Chon_Cong_Ty_Control(VinhNT_Activity in_nguCanh) {
        super(in_nguCanh);
        nguCanh = in_nguCanh;
    }
    @Override
    public void init(){
        super.init();
        ma_cong_ty = "";
        cong_ty_text = new VinhNT_CongTy_Text(getContext());
        cong_ty_button = new VinhNT_CongTy_Button(nguCanh,cong_ty_text,this);

        addView(cong_ty_text, VinhNT_Common.size_90_per);
        addView(cong_ty_button, VinhNT_Common.size_10_per);
    }

    @Override
    public void addParam(JSONObject input) {

    }

    @Override
    public String get_field_name() {
        return "ma_cong_ty";
    }

    @Override
    public void getParam(JSONObject input) {

    }

    @Override
    public boolean isRequired() {
        return false;
    }

    @Override
    public ArrayList<Error_Input> checkInput() {
        return null;
    }
}
