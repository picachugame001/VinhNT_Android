package bongda.chon_cong_ty;

import android.widget.LinearLayout;

import bongda.chon_cong_ty.table_cong_ty.Bang_Cong_Ty;
import bongda.chon_cong_ty.table_cong_ty.Dong_Cong_Ty;
import library.activity.VinhNT_Activity;
import library.activity.VinhNT_Common;


/**
 * Created by Picachu on 5/15/2016.
 */
public class Chon_Cong_Ty_Form extends VinhNT_Activity {
    private Bang_Cong_Ty bang_cong_ty;
    private Bang_Cong_Ty_HTTP bang_cong_ty_http;
    private Button_Select_Congty button_select_congty;
    public String getTitle_VinhNT(){
        return "Chọn công ty";
    }
    @Override
    protected void init(){
        super.init();
        bang_cong_ty_http = new Bang_Cong_Ty_HTTP(this,bang_cong_ty);
        bang_cong_ty_http.sendRequest();

    }
    @Override
    protected LinearLayout getContent(){
        LinearLayout a = super.getContent();
        bang_cong_ty = new Bang_Cong_Ty(this, Dong_Cong_Ty.class);
        a.addView(bang_cong_ty);
        return a;
    }
    //Button_Select_Congty
    public LinearLayout getFooter(){
        LinearLayout a = super.getFooter();
        //
        button_select_congty = new Button_Select_Congty(this);
        a.addView(button_select_congty);
        //
        return a;
    }
}
