package bongda.bangchinh;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;

import org.json.JSONException;
import org.json.JSONObject;

import bongda.field.Ten_Doi_Bong;
import bongda.login.Button_DangKi;
import bongda.thach_dau_tat_ca.Button_Thach_Dau_Tat_Ca;
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
        Button_Dang_Ky_Doi_Bong button_dang_ki_doi_bong = new Button_Dang_Ky_Doi_Bong(this);
        Button_Tim_Kiem_Doi_Bong button_tim_kiem_doi_bong = new Button_Tim_Kiem_Doi_Bong(this);
        Button_Duyet_Don_Gia_Nhap button_duyet_don_gia_nhap = new Button_Duyet_Don_Gia_Nhap(this);
        Button_Thach_Dau_Tat_Ca button_thach_dau_tat_ca = new Button_Thach_Dau_Tat_Ca(this);
        //
        LinearLayout view = super.getContent();
        view.addView(buton_thong_tin);
        view.addView(button_dang_ki_doi_bong);
        view.addView(button_tim_kiem_doi_bong);
        view.addView(button_duyet_don_gia_nhap);
        view.addView(button_thach_dau_tat_ca);

        String sendString = getIntent().getStringExtra(SEND_OBJECT);
        try {
            JSONObject sendJSON = new JSONObject(sendString);
            int is_team_leader = sendJSON.getInt("is_team_leader");
            if(is_team_leader==0){
                button_duyet_don_gia_nhap.setVisibility(View.GONE);
                button_thach_dau_tat_ca.setVisibility(View.GONE);

            }
        } catch (JSONException e) {
            e.printStackTrace();
        }

        //abc
        return view;
    }
}
