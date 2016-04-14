package library.view;

import android.app.AlertDialog;
import android.content.Context;

/**
 * Created by Picachu on 3/19/2016.
 */
public class VinhNT_Dialog extends AlertDialog{
    public VinhNT_Dialog(Context context) {
        super(context);
        // init
        setTitle("Error");
    }
    public VinhNT_Dialog(Context context,String title,String message) {
        super(context);
        // init
        setTitle(title);
        setMessage(message);
    }
}
