package library.view.grid.radio;

import android.content.Context;
import android.view.View;

import library.viewgroup.VinhNT_LinearLayout;

/**
 * Created by Picachu on 5/18/2016.
 */
public class VinhNT_Content_Row_Radio extends VinhNT_LinearLayout implements View.OnClickListener {
    private  VinhNT_Grid_Row_Radio cell;
    public VinhNT_Content_Row_Radio(Context context,VinhNT_Grid_Row_Radio in_cell) {
        super(context);
        setOnClickListener(this);
        cell=in_cell;
    }

    @Override
    public void onClick(View v) {
        cell.checkRadio();
    }
}
