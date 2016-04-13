package bongda.bangchinh;

import android.widget.LinearLayout;
import android.widget.ScrollView;

import bongda.login.Button_DangKi;
import library.activity.VinhNT_Activity;

/**
 * Created by Picachu on 4/2/2016.
 */
public class BangChinh_Form extends VinhNT_Activity {
    private  Button_Quan_Ly_Thong_Tin buton_thong_tin;
    @Override
    public String getTitle_VinhNT(){
        return "Main Board";
    }
    @Override
    public LinearLayout getContent() {
        //
        buton_thong_tin = new Button_Quan_Ly_Thong_Tin(this);
        //
        LinearLayout view = super.getContent();
        view.addView(buton_thong_tin);
        //
        return view;
    }
}
