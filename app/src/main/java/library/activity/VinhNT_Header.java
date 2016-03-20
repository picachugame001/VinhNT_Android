package library.activity;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import static android.view.ViewGroup.*;

/**
 * Created by Picachu on 3/16/2016.
 */
public class VinhNT_Header extends LinearLayout {
    public VinhNT_Header(VinhNT_Activity context){
        super(context);
        init(context);
    }
    @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
    public void init(VinhNT_Activity context){
        setOrientation(HORIZONTAL);
        //
        setBackground(VinhNT_Common.background01);
        //
        ImageView icon = context.getIcon();
        String title = context.getTitle_VinhNT();
        TextView titlebar = new TextView(context);
        titlebar.setText(title);
        //
        addView(icon,VinhNT_Common.size_10_per);
        addView(titlebar,VinhNT_Common.size_70_per);

    }
}
