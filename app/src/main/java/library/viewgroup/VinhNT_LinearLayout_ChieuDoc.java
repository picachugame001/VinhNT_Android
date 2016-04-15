package library.viewgroup;

import android.content.Context;

/**
 * Created by Picachu on 4/15/2016.
 */
public class VinhNT_LinearLayout_ChieuDoc extends VinhNT_LinearLayout {
    public VinhNT_LinearLayout_ChieuDoc(Context context) {
        super(context);
    }
    @Override
    public void init(){
        setOrientation(super.VERTICAL);
    }
}
