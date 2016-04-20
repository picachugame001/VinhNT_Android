package bongda.timkiemdoibong.danh_sach_doi_bong;

import android.content.Context;
import android.support.v4.widget.Space;

import bongda.field.gioi_tinh.Gioi_Tinh_Text_View;
import library.activity.VinhNT_Common;
import library.view.VinhNT_TextView;
import library.view.VinhNT_TextView_Param;
import library.view.VinhNT_TextView_Param_Hide;
import library.view.grid.VinhNT_Grid_Row;
import library.viewgroup.VinhNT_LinearLayout_ChieuDoc;
import library.viewgroup.VinhNT_LinearLayout_ChieuNgang;

/**
 * Created by Picachu on 4/15/2016.
 */
public class Row_Doi_Bong extends VinhNT_Grid_Row {
    private Chon_Doi_Bong_CheckBox check;
    private Ten_Doi_Bong_TextView_Hide ten_doi_bong;
    private Gioi_Tinh_Text_View gioi_tinh;
    private VinhNT_TextView_Param level;
    private VinhNT_TextView_Param so_thanh_vien;
    private VinhNT_TextView_Param_Hide ma_doi_bong;

    public Row_Doi_Bong(Context context) {
        super(context);
        init_layout();
        set_Data_Field();
    }
    private void init_layout(){
        //init textview
        VinhNT_TextView doi_bong_desc = new VinhNT_TextView(getContext(),"Đội bóng ");
        VinhNT_TextView level_desc = new VinhNT_TextView(getContext()," Level ");
        VinhNT_TextView so_thanh_vien_desc = new VinhNT_TextView(getContext(),"Số thành viên ");
        ma_doi_bong = new VinhNT_TextView_Param_Hide(getContext(),"ma_doi_bong");

        // init data
        check = new Chon_Doi_Bong_CheckBox(getContext());
        ten_doi_bong = new Ten_Doi_Bong_TextView_Hide(getContext(),check);
        level = new VinhNT_TextView_Param(getContext(),"cap_do","");
        gioi_tinh = new Gioi_Tinh_Text_View(getContext());
        Space space = new Space(getContext());
        so_thanh_vien = new VinhNT_TextView_Param(getContext(),"so_thanh_vien","0");
        //
        //All group view
        VinhNT_LinearLayout_ChieuDoc col_main = new VinhNT_LinearLayout_ChieuDoc(getContext());
        VinhNT_LinearLayout_ChieuNgang row1 = new VinhNT_LinearLayout_ChieuNgang(getContext());
        VinhNT_LinearLayout_ChieuNgang row2 = new VinhNT_LinearLayout_ChieuNgang(getContext());
        VinhNT_LinearLayout_ChieuNgang row2_col1 = new VinhNT_LinearLayout_ChieuNgang(getContext());
        VinhNT_LinearLayout_ChieuDoc row2_col2 = new VinhNT_LinearLayout_ChieuDoc(getContext());
        VinhNT_LinearLayout_ChieuNgang row2_col2_row1 = new VinhNT_LinearLayout_ChieuNgang(getContext());
        VinhNT_LinearLayout_ChieuNgang row2_col2_row2 = new VinhNT_LinearLayout_ChieuNgang(getContext());
        //
        addView(col_main);
        col_main.addView(row1);
        col_main.addView(row2);
        //
        row2.addView(row2_col1,VinhNT_Common.size_15_per);
        row2.addView(row2_col2,VinhNT_Common.size_85_per);
        //
        row2_col2.addView(row2_col2_row1);
        row2_col2.addView(row2_col2_row2);
        //
        //row1
        row1.addView(check);
        row1.addView(ten_doi_bong);
        //row2_col2_row1
        row2_col2_row1.addView(doi_bong_desc);
        row2_col2_row1.addView(gioi_tinh);
        row2_col2_row1.addView(level_desc);
        row2_col2_row1.addView(level);
        //row2_col2_row2
        row2_col2_row2.addView(so_thanh_vien_desc);
        row2_col2_row2.addView(so_thanh_vien);

    }
    private void set_Data_Field(){
        add_To_Set_Data(ma_doi_bong);
        add_To_Set_Data(ten_doi_bong);
        add_To_Set_Data(gioi_tinh);
        add_To_Set_Data(level);
        add_To_Set_Data(so_thanh_vien);
    }
    @Override
    protected boolean is_Row_Get(){
        return check.isChecked();
    }

}
