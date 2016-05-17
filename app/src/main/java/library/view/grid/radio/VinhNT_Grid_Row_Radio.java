package library.view.grid.radio;

import android.content.Context;
import android.widget.RadioButton;

import library.view.grid.VinhNT_Grid_Row;
import library.viewgroup.VinhNT_LinearLayout;

/**
 * Created by Picachu on 5/15/2016.
 */
public class VinhNT_Grid_Row_Radio extends VinhNT_Grid_Row {
    private boolean is_get;
    private VinhNT_RadioButton_Grid check;
    private VinhNT_Grid_Radio mainView;
    public VinhNT_Grid_Row_Radio(Context context,VinhNT_Grid_Radio in_main_View) {
        super(context);
        is_get = false;
        setOrientation(super.HORIZONTAL);
        check = new VinhNT_RadioButton_Grid(context,this);
        addView(check);
        addView(get_Detail());
        mainView = in_main_View;
    }
    protected boolean is_Row_Get(){
        return  is_get;
    }
    protected VinhNT_Content_Row_Radio get_Detail(){
        VinhNT_Content_Row_Radio mainView = new VinhNT_Content_Row_Radio(getContext(),this);
        return mainView;
    }
    public void checkRadio(){
        mainView.check_Row(this);
        is_get = true;
        check.setChecked(is_get);

    }
    public void unCheckRadio(){
        is_get = false;
        check.setChecked(is_get);
    }
}
