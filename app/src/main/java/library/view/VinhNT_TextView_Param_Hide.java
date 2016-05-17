package library.view;

import android.content.Context;
import android.view.View;

/**
 * Created by Picachu on 4/15/2016.
 */
public class VinhNT_TextView_Param_Hide extends VinhNT_TextView_Param {
    public VinhNT_TextView_Param_Hide(Context context, String in_field_name) {
        super(context, in_field_name);
        setVisibility(View.GONE);
    }
    public VinhNT_TextView_Param_Hide(Context context){
        super(context);

    }
}
