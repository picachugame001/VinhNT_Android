package library.view.grid.radio;

import android.content.Context;
import android.view.View;
import android.widget.RadioButton;

/**
 * Created by Picachu on 5/17/2016.
 */
public class VinhNT_RadioButton_Grid extends RadioButton implements View.OnClickListener {
    private VinhNT_Grid_Row_Radio row;
    public VinhNT_RadioButton_Grid(Context context,VinhNT_Grid_Row_Radio in_row) {
        super(context);
        setOnClickListener(this);
        row = in_row;
        setText("");
    }

    @Override
    public void onClick(View v) {
        row.checkRadio();
    }
}
