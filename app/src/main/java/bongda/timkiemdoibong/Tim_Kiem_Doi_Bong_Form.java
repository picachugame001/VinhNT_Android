package bongda.timkiemdoibong;

import android.widget.LinearLayout;

import bongda.timkiemdoibong.danh_sach_doi_bong.Row_Doi_Bong;
import bongda.timkiemdoibong.danh_sach_doi_bong.Table_Doi_Bong;
import library.activity.VinhNT_Activity;
import library.view.grid.VinhNT_Grid;

/**
 * Created by Picachu on 4/15/2016.
 */
public class Tim_Kiem_Doi_Bong_Form extends VinhNT_Activity {
    Tim_Doi_Bong_HTTP http;
    Table_Doi_Bong table_doi_bong;
    @Override
    public String getTitle_VinhNT(){
        return "Tìm kiếm đội bóng";
    }
    @Override
    public LinearLayout getContent() {
        table_doi_bong = new Table_Doi_Bong(this,Row_Doi_Bong.class);
        //
        LinearLayout  main = super.getContent();
        main.addView(table_doi_bong);
        //
        return main;
    }
    @Override
    public void init(){
        super.init();
        http = new Tim_Doi_Bong_HTTP(this,table_doi_bong);
        http.sendRequest();


    }
}
