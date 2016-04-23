package bongda.timkiemdoibong;

import android.widget.LinearLayout;

import bongda.bangchinh.*;
import bongda.bangchinh.Button_Tim_Kiem_Doi_Bong;
import bongda.field.Ten_Doi_Bong;
import bongda.timkiemdoibong.danh_sach_doi_bong.Row_Doi_Bong;
import bongda.timkiemdoibong.danh_sach_doi_bong.Table_Doi_Bong;
import library.activity.VinhNT_Activity;
import library.activity.VinhNT_Common;
import library.view.VinhNT_TextView_Param_Hide;
import library.view.grid.VinhNT_Grid;
import library.viewgroup.VinhNT_LinearLayout_ChieuNgang;

/**
 * Created by Picachu on 4/15/2016.
 */
public class Tim_Kiem_Doi_Bong_Form extends VinhNT_Activity {
    private Tim_Doi_Bong_HTTP http;
    private Table_Doi_Bong table_doi_bong;
    private TimKiem_TenDoiBong_TextView timkiem;
    private Button_Xin_Gia_Nhap button_xin_gia_nhap;
    private bongda.timkiemdoibong.Button_Tim_Kiem_Doi_Bong button_tim_kiem_doi_bong;
    private VinhNT_TextView_Param_Hide user;
    private Gia_Nhap_HTTP gia_nhap_http;
    @Override
    public String getTitle_VinhNT(){
        return "Tìm kiếm đội bóng";
    }
    @Override
    public LinearLayout getContent() {
        //init control
        user = new VinhNT_TextView_Param_Hide(this,"user");
        user.setText(VinhNT_Common.get_VinhNT_id());
        table_doi_bong = new Table_Doi_Bong(this,Row_Doi_Bong.class);
        timkiem = new TimKiem_TenDoiBong_TextView(this);
        http = new Tim_Doi_Bong_HTTP(this,table_doi_bong,timkiem,user);
        button_tim_kiem_doi_bong = new bongda.timkiemdoibong.Button_Tim_Kiem_Doi_Bong(this,http);
        gia_nhap_http = new Gia_Nhap_HTTP(this,user,table_doi_bong);
        //row1
        VinhNT_LinearLayout_ChieuNgang row1 = new VinhNT_LinearLayout_ChieuNgang(this);
        row1.addView(user);
        row1.addView(timkiem, VinhNT_Common.size_90_per);
        row1.addView(button_tim_kiem_doi_bong,VinhNT_Common.size_10_per);
        //
        LinearLayout  main = super.getContent();
        main.addView(row1);
        main.addView(table_doi_bong);

        //

        //
        return main;
    }
    @Override
    public void init(){
        super.init();
        //http.sendRequest();


    }
    @Override
    public LinearLayout getFooter(){
        LinearLayout footer = super.getFooter();
        button_xin_gia_nhap = new Button_Xin_Gia_Nhap(this,gia_nhap_http);
        //
        footer.addView(button_xin_gia_nhap);

        //
        return footer;
    }
}
