package bongda.timkiemdoibong;

import android.util.Log;

import org.json.JSONException;
import org.json.JSONObject;

import bongda.field.Ten_Doi_Bong;
import bongda.timkiemdoibong.danh_sach_doi_bong.Table_Doi_Bong;
import library.activity.VinhNT_Activity;
import library.connect.VinhNT_HTTP;

/**
 * Created by Picachu on 4/15/2016.
 */
public class Tim_Doi_Bong_HTTP extends VinhNT_HTTP {
    private Table_Doi_Bong table_doi_bong;
    public Tim_Doi_Bong_HTTP(VinhNT_Activity nguCanh,Table_Doi_Bong in,Ten_Doi_Bong in_ten_doi_bong) {
        super(nguCanh);
        table_doi_bong = in;
        add_Parameter(in_ten_doi_bong);
    }
    @Override
    public String get_Function_Name(){
        return "tim_kiem_doi_bong";
    }
    @Override
    public void onResponse(JSONObject response) {
        super.onResponse(response);
        JSONObject result = getResults();
        table_doi_bong.getParam(result);


    }
}
