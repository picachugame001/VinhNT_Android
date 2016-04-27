package bongda.duyetdongianhap;

import android.widget.LinearLayout;

import bongda.duyetdongianhap.table_gia_nhap.Grid_Don_Gia_Nhap;
import bongda.duyetdongianhap.table_gia_nhap.Row_Don_Gia_Nhap;
import bongda.timkiemdoibong.danh_sach_doi_bong.Row_Doi_Bong;
import library.activity.VinhNT_Activity;
import library.activity.VinhNT_Common;
import library.view.VinhNT_TextView_Param_Hide;

/**
 * Created by Picachu on 4/27/2016.
 */
public class Duyet_Don_Gia_Nhap_Form extends VinhNT_Activity {
    private VinhNT_TextView_Param_Hide user;
    private VinhNT_TextView_Param_Hide ma_doi_bong;
    private Grid_Don_Gia_Nhap<Row_Don_Gia_Nhap> grid_don_gia_nhap;
    private Get_Danh_Sach_Don_Gia_Nhap_HTTP http_get_data;
    private Button_Duyet_Don button_duyet_don;
    private Duyet_Don_Gia_Nhap_HTTP duyet_don_gia_nhap_http;
    //
    @Override
    public LinearLayout getContent() {
        user = new VinhNT_TextView_Param_Hide(this,"user");
        user.setText(VinhNT_Common.get_VinhNT_id());
        ma_doi_bong = new VinhNT_TextView_Param_Hide(this,"ma_doi_bong");
        grid_don_gia_nhap = new Grid_Don_Gia_Nhap<Row_Don_Gia_Nhap>(this,Row_Don_Gia_Nhap.class);
        http_get_data = new Get_Danh_Sach_Don_Gia_Nhap_HTTP(this,ma_doi_bong,grid_don_gia_nhap,user);

        //
        LinearLayout  main = super.getContent();
        main.addView(user);
        main.addView(ma_doi_bong);
        main.addView(grid_don_gia_nhap);

        duyet_don_gia_nhap_http = new Duyet_Don_Gia_Nhap_HTTP(this,ma_doi_bong,grid_don_gia_nhap);
        //
        return main;
    }
    @Override
    public LinearLayout getFooter(){
        LinearLayout footer = super.getFooter();
        //
        button_duyet_don = new Button_Duyet_Don(this,duyet_don_gia_nhap_http);
        //
        footer.addView(button_duyet_don);
        //
        return footer;
    }
    @Override
    public void init(){
        super.init();
        http_get_data.sendRequest();
    }
    @Override
    public String getTitle_VinhNT(){
        return "Duyệt Đơn";
    }

}
