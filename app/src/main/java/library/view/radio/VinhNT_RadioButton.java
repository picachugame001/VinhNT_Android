package library.view.radio;

import android.content.Context;
import android.widget.RadioButton;

/**
 * Created by Picachu on 4/7/2016.
 */
public class VinhNT_RadioButton extends RadioButton {
    private int value;
    private String label;
    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
        setText(getLabel());
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public VinhNT_RadioButton(Context context) {
        super(context);
    }
    public VinhNT_RadioButton(Context context,int in_value,String label) {
        super(context);
        setLabel(label);
        setValue(in_value);
        //

    }

}
