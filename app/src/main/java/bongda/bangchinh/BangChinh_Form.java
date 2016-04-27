package bongda.bangchinh;

import android.widget.LinearLayout;
import android.widget.ScrollView;

import bongda.field.Ten_Doi_Bong;
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
        Button_Dang_Ky_Doi_Bong button_dang_ki_doi_bong = new Button_Dang_Ky_Doi_Bong(this);
        Button_Tim_Kiem_Doi_Bong button_tim_kiem_doi_bong = new Button_Tim_Kiem_Doi_Bong(this);
        Button_Duyet_Don_Gia_Nhap button_duyet_don_gia_nhap = new Button_Duyet_Don_Gia_Nhap(this);
        //
        LinearLayout view = super.getContent();
        view.addView(buton_thong_tin);
        view.addView(button_dang_ki_doi_bong);
        view.addView(button_tim_kiem_doi_bong);
        view.addView(button_duyet_don_gia_nhap);
        //
        return view;
    }
}
