package bongda.timkiemdoibong.danh_sach_doi_bong;

import android.content.Context;

import library.view.grid.VinhNT_Grid;
import library.view.grid.VinhNT_Grid_Row;

/**
 * Created by Picachu on 4/15/2016.
 */
public class Table_Doi_Bong<Row_Doi_Bong extends VinhNT_Grid_Row> extends VinhNT_Grid<Row_Doi_Bong> {
    public Table_Doi_Bong(Context context, Class cls) {
        super(context, cls);
    }
    @Override
    public String get_field_name() {
        return "list_doi_bong";
    }
    @Override
    public boolean isRequired() {
        return true;
    }
}
