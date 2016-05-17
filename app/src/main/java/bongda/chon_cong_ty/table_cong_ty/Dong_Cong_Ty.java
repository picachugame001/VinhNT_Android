package bongda.chon_cong_ty.table_cong_ty;

import android.content.Context;

import bongda.field.*;
import library.view.grid.VinhNT_Grid_Row;
import library.view.grid.radio.VinhNT_Content_Row_Radio;
import library.view.grid.radio.VinhNT_Grid_Radio;
import library.view.grid.radio.VinhNT_Grid_Row_Radio;
import library.viewgroup.VinhNT_LinearLayout_ChieuDoc;

/**
 * Created by Picachu on 5/15/2016.
 */
public class Dong_Cong_Ty extends VinhNT_Grid_Row_Radio {
    private Ma_Cong_Ty_Hide ma_cong_ty_hide;
    private Ten_Cong_Ty ten_cong_ty;
    private Dia_Chi dia_chi;
    private So_Dien_Thoai so_dien_thoai;

    public Dong_Cong_Ty(Context context, VinhNT_Grid_Radio in_main_View) {
        super(context, in_main_View);
    }

    @Override
    public void init() {
        super.init();
        // tao layout

    }
    @Override
    protected VinhNT_Content_Row_Radio get_Detail(){
        VinhNT_Content_Row_Radio mainView = super.get_Detail();
        //
        VinhNT_LinearLayout_ChieuDoc subView1 = new VinhNT_LinearLayout_ChieuDoc(getContext());
        //
        ma_cong_ty_hide = new Ma_Cong_Ty_Hide(getContext());
        ten_cong_ty = new Ten_Cong_Ty(getContext());
        dia_chi = new Dia_Chi(getContext());
        so_dien_thoai = new So_Dien_Thoai(getContext());
        //
        add_To_Set_Data(ma_cong_ty_hide);
        add_To_Set_Data(ten_cong_ty);
        add_To_Set_Data(dia_chi);
        add_To_Set_Data(so_dien_thoai);
        //
        subView1.addView(ma_cong_ty_hide);
        subView1.addView(ten_cong_ty);
        subView1.addView(dia_chi);
        subView1.addView(so_dien_thoai);
        //
        mainView.addView(subView1);
        return mainView;
    }

}