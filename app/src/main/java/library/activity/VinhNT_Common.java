package library.activity;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.text.method.TextKeyListener;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import java.net.InetAddress;

import static android.text.method.TextKeyListener.*;
import static android.text.method.TextKeyListener.Capitalize.*;

/**
 * Created by Picachu on 3/16/2016.
 */
public class VinhNT_Common {
    public static LinearLayout.LayoutParams size_10_per;
    public static LinearLayout.LayoutParams size_20_per;
    public static LinearLayout.LayoutParams size_70_per;
    public static LinearLayout.LayoutParams size_80_per;
    public static LinearLayout.LayoutParams size_90_per;
    public static LinearLayout.LayoutParams size_100_per;
    public static LinearLayout.LayoutParams size_5_per_HORIZONTAL;
    public static LinearLayout.LayoutParams size_80_per_HORIZONTAL;
    public static LinearLayout.LayoutParams size_10_per_HORIZONTAL;
    //
    public static ShapeDrawable background01;
    //
    public static TextKeyListener nhapText;
    //
    public static String link="http://192.168.0.100/bongda/";
    public static void init(){
        if(size_10_per == null){
            size_20_per = new LinearLayout.LayoutParams(
                 ViewGroup.LayoutParams.WRAP_CONTENT
                ,ViewGroup.LayoutParams.WRAP_CONTENT
                ,0.2f
            );
            size_10_per = new LinearLayout.LayoutParams(
                 ViewGroup.LayoutParams.WRAP_CONTENT
                ,ViewGroup.LayoutParams.WRAP_CONTENT
                ,0.1f
            );
            size_70_per = new LinearLayout.LayoutParams(
                 ViewGroup.LayoutParams.WRAP_CONTENT
                ,ViewGroup.LayoutParams.WRAP_CONTENT
                ,0.7f
            );
            size_80_per = new LinearLayout.LayoutParams(
                    ViewGroup.LayoutParams.WRAP_CONTENT
                    ,ViewGroup.LayoutParams.WRAP_CONTENT
                    ,0.8f
            );
            size_90_per = new LinearLayout.LayoutParams(
                    ViewGroup.LayoutParams.WRAP_CONTENT
                    ,ViewGroup.LayoutParams.WRAP_CONTENT
                    ,0.9f
            );
            size_100_per = new LinearLayout.LayoutParams(
                    ViewGroup.LayoutParams.WRAP_CONTENT
                    ,ViewGroup.LayoutParams.WRAP_CONTENT
                    ,1.00f
            );
            size_5_per_HORIZONTAL = new LinearLayout.LayoutParams(
                    ViewGroup.LayoutParams.MATCH_PARENT
                    ,ViewGroup.LayoutParams.WRAP_CONTENT
                    ,0.05f
            );
            size_80_per_HORIZONTAL = new LinearLayout.LayoutParams(
                    ViewGroup.LayoutParams.MATCH_PARENT
                    ,ViewGroup.LayoutParams.WRAP_CONTENT
                    ,0.80f
            );
            size_10_per_HORIZONTAL = new LinearLayout.LayoutParams(
                    ViewGroup.LayoutParams.MATCH_PARENT
                    ,ViewGroup.LayoutParams.WRAP_CONTENT
                    ,0.10f
            );
            //
            background01 = new ShapeDrawable(new RectShape());
            background01.getPaint().setARGB(255,62,182,94);
            //
            nhapText = new TextKeyListener(NONE,true);

        }

    }
    public static boolean isNetworkAvailable(final Context context) {
        ConnectivityManager cm =
                (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo netInfo = cm.getActiveNetworkInfo();
        return netInfo != null && netInfo.isConnectedOrConnecting();
    }

}
