package bongda.duyetdongianhap.table_gia_nhap;

import android.content.Context;

import library.activity.VinhNT_Common;
import library.view.VinhNT_TextView;
import library.view.grid.VinhNT_Grid_Row;
import library.viewgroup.VinhNT_LinearLayout_ChieuDoc;
import library.viewgroup.VinhNT_LinearLayout_ChieuNgang;

/**
 * Created by Picachu on 4/27/2016.
 */
public class Row_Don_Gia_Nhap extends VinhNT_Grid_Row {
    Checkbox_Chon_Cau_Thu check;
    Ho_Ten_Dem_Hide ho_ten_dem_hide;
    Ten_Hide ten_hide;
    Tuoi_Cau_Thu tuoi_cau_thu;
    Ngay_Nop_Don_Hide ngay_nop_don_hide;
    Gio_Nop_Don_Hide gio_nop_don_hide;
    Ngay_Gio_Nop_Don ngay_gio_nop_don;
    User_Hide user;

    public Row_Don_Gia_Nhap(Context context) {
        super(context);
        init_layout(context);
        set_Data_Field();
    }
    private void init_layout(Context context){
        VinhNT_TextView tuoi = new VinhNT_TextView(getContext(),"Tuổi ");
        VinhNT_TextView nopdon = new VinhNT_TextView(getContext(),"thời gian nộp đơn ");
        //
        check = new Checkbox_Chon_Cau_Thu(context);
        ho_ten_dem_hide = new Ho_Ten_Dem_Hide(context,check);
        ten_hide = new Ten_Hide(context,check);
        tuoi_cau_thu = new Tuoi_Cau_Thu(context);
        ngay_gio_nop_don = new Ngay_Gio_Nop_Don(context);
        ngay_nop_don_hide = new Ngay_Nop_Don_Hide(context,ngay_gio_nop_don);
        gio_nop_don_hide = new Gio_Nop_Don_Hide(context,ngay_gio_nop_don);
        user = new User_Hide(context);
        //
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
        row2.addView(row2_col1, VinhNT_Common.size_15_per);
        row2.addView(row2_col2, VinhNT_Common.size_85_per);
        //
        row2_col2.addView(row2_col2_row1);
        row2_col2.addView(row2_col2_row2);
        //
        row1.addView(check);
        row1.addView(ho_ten_dem_hide);
        row1.addView(ten_hide);
        row1.addView(user);
        //
        row2_col2_row1.addView(tuoi);
        row2_col2_row1.addView(tuoi_cau_thu);
        //
        row2_col2_row2.addView(nopdon);
        row2_col2_row2.addView(ngay_gio_nop_don);

    }
    private void set_Data_Field(){
        add_To_Set_Data(ho_ten_dem_hide);
        add_To_Set_Data(ten_hide);
        add_To_Set_Data(tuoi_cau_thu);
        add_To_Set_Data(ngay_nop_don_hide);
        add_To_Set_Data(gio_nop_don_hide);
        add_To_Set_Data(user);
    }
    @Override
    protected boolean is_Row_Get(){
        return check.isChecked();
    }

    public String get_ten_cau_thu(){
        return check.getText().toString();
    }
}
