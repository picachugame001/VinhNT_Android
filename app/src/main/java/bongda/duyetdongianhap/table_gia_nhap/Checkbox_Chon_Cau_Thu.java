package bongda.duyetdongianhap.table_gia_nhap;

import android.content.Context;

import bongda.duyetdongianhap.table_gia_nhap.Ho_Ten_Dem_Hide;
import bongda.duyetdongianhap.table_gia_nhap.Ten_Hide;
import library.view.VinhNT_CheckBox;

/**
 * Created by Picachu on 4/27/2016.
 */
public class Checkbox_Chon_Cau_Thu extends VinhNT_CheckBox {
    private Ho_Ten_Dem_Hide ho_ten;
    private Ten_Hide ten;
    public Checkbox_Chon_Cau_Thu(Context context) {
        super(context);
    }
    public void set_Ho_Ten(Ho_Ten_Dem_Hide a){
        ho_ten = a;
    }
    public void set_Ten(Ten_Hide b){
        ten = b;
    }
    public void hien_Ten(){
        String hoTen_t = ho_ten.getText().toString();
        String ten_t = ten.getText().toString();
        setText(hoTen_t + " " + ten_t);
    }
}
