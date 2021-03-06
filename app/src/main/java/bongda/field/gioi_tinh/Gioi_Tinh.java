package bongda.field.gioi_tinh;

import android.content.Context;
import android.widget.LinearLayout;

import library.view.radio.VinhNT_RadioGroup;

/**
 * Created by Picachu on 4/7/2016.
 */
public class Gioi_Tinh extends VinhNT_RadioGroup {
    protected String field_name;
    public Gioi_Tinh(Context context) {
        super(context);
        Gioi_Tinh_Nam nam = new Gioi_Tinh_Nam(context);
        Gioi_Tinh_Nu nu = new Gioi_Tinh_Nu(context);
        add_VinhNT_RadioButton(nam);
        add_VinhNT_RadioButton(nu);
        setOrientation(LinearLayout.HORIZONTAL);//phần tử con nằm ngang
        set_Default(nam);
    }
    @Override
    public String get_field_name() {
        if(field_name == null){
            field_name = "gioi_tinh";
        }
        return field_name;
    }
}
