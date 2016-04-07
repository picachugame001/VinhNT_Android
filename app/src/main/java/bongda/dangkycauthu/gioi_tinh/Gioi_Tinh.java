package bongda.dangkycauthu.gioi_tinh;

import android.content.Context;
import android.widget.LinearLayout;

import library.view.radio.VinhNT_RadioGroup;

/**
 * Created by Picachu on 4/7/2016.
 */
public class Gioi_Tinh extends VinhNT_RadioGroup {
    public Gioi_Tinh(Context context) {
        super(context);
        Gioi_Tinh_Nam nam = new Gioi_Tinh_Nam(context);
        Gioi_Tinh_Nu nu = new Gioi_Tinh_Nu(context);
        add_VinhNT_RadioButton(nam);
        add_VinhNT_RadioButton(nu);
        setOrientation(LinearLayout.HORIZONTAL);//phần tử con nằm ngang
    }
}
