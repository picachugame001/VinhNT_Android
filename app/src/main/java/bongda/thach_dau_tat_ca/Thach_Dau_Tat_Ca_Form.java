package bongda.thach_dau_tat_ca;


import android.widget.LinearLayout;

import bongda.chon_cong_ty.Chon_Cong_Ty_Control;
import library.activity.VinhNT_Activity;

/**
 * Created by Picachu on 5/15/2016.
 */
public class Thach_Dau_Tat_Ca_Form extends VinhNT_Activity {
    private Chon_Cong_Ty_Control chon_cong_ty;
    @Override
    public String getTitle_VinhNT(){
        return "Thach Dau Tat Ca";
    }

    protected LinearLayout getContent() {
        LinearLayout a = super.getContent();
        //
        chon_cong_ty = new Chon_Cong_Ty_Control(this);

        a.addView(chon_cong_ty);

        //
        return a;
    }

}
