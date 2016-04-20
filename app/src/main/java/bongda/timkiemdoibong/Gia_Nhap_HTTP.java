package bongda.timkiemdoibong;

import bongda.timkiemdoibong.danh_sach_doi_bong.Table_Doi_Bong;
import library.activity.VinhNT_Activity;
import library.connect.VinhNT_HTTP;
import library.view.VinhNT_TextView_Param_Hide;

/**
 * Created by Picachu on 4/17/2016.
 */
public class Gia_Nhap_HTTP extends VinhNT_HTTP {
    public Gia_Nhap_HTTP(VinhNT_Activity nguCanh
            ,VinhNT_TextView_Param_Hide in_user
            ,Table_Doi_Bong in_table) {
        super(nguCanh);
        add_Parameter(in_user);
        add_Parameter(in_table);
    }
    @Override
    public String get_Function_Name(){
        return "gia_nhap_doi_bong";
    }
}
