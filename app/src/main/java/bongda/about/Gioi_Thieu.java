package bongda.about;

import android.content.Context;

import library.view.VinhNT_TextView;

/**
 * Created by Picachu on 4/10/2016.
 */
public class Gioi_Thieu extends VinhNT_TextView {
    public Gioi_Thieu(Context context) {
        super(context);
        init();
    }
    @Override
    public void init(){
        super.init();
        setMaxLines(3);
        setLines(3);
        String loi_gioi_thieu = "Tác giả:\nNguyển Thành Vinh\nDuy Tân University";
        setText(loi_gioi_thieu);
    }

}
