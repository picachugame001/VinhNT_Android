package bongda.duyetdongianhap.table_gia_nhap;

import android.content.Context;

import bongda.timkiemdoibong.danh_sach_doi_bong.Row_Doi_Bong;
import library.view.grid.VinhNT_Grid;
import library.view.grid.VinhNT_Grid_Row;

/**
 * Created by Picachu on 4/27/2016.
 */
public class Grid_Don_Gia_Nhap<Row_Don_Gia_Nhap extends VinhNT_Grid_Row> extends VinhNT_Grid<Row_Don_Gia_Nhap> {
    public Grid_Don_Gia_Nhap(Context context, Class cls) {
        super(context, cls);
    }
    @Override
    public String get_field_name() {
        return "list_cau_thu";
    }
    @Override
    public boolean isRequired() {
        return true;
    }
}
