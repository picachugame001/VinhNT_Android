package bongda.duyetdongianhap;

import android.util.Log;

import org.json.JSONException;
import org.json.JSONObject;

import bongda.duyetdongianhap.table_gia_nhap.Grid_Don_Gia_Nhap;
import bongda.duyetdongianhap.table_gia_nhap.Row_Don_Gia_Nhap;
import bongda.timkiemdoibong.danh_sach_doi_bong.Row_Doi_Bong;
import library.activity.VinhNT_Activity;
import library.connect.VinhNT_HTTP;
import library.view.VinhNT_TextView_Param;
import library.view.VinhNT_TextView_Param_Hide;

/**
 * Created by Picachu on 4/27/2016.
 */
public class Get_Danh_Sach_Don_Gia_Nhap_HTTP extends VinhNT_HTTP {
    private VinhNT_TextView_Param_Hide ma_doi_bong;
    private Grid_Don_Gia_Nhap<Row_Don_Gia_Nhap> grid_don_gia_nhap;
    public Get_Danh_Sach_Don_Gia_Nhap_HTTP(VinhNT_Activity nguCanh,VinhNT_TextView_Param_Hide in_ma_doi_bong,Grid_Don_Gia_Nhap<Row_Don_Gia_Nhap> in_grid_don_gia_nhap
        ,VinhNT_TextView_Param_Hide user
    ) {
        super(nguCanh);
        ma_doi_bong = in_ma_doi_bong;
        grid_don_gia_nhap = in_grid_don_gia_nhap;
        add_Parameter(user);
    }
    @Override
    public String get_Function_Name(){
        return "lay_danh_sach_don_gia_nhap";
    }
    @Override
    public void onResponse(JSONObject response) {
        super.onResponse(response);
        if(!is_Error_Common()){
            ma_doi_bong.getParam(getResults());
            grid_don_gia_nhap.getParam(getResults());
        }
    }
}
