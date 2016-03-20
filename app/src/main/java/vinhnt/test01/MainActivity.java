package vinhnt.test01;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import library.activity.VinhNT_Activity;
import library.view.VinhNT_Button;
import library.view.VinhNT_EditInteger;
import vinhnt.test01.obj_main_activity.ButtonTest;

//test 002
public class MainActivity extends VinhNT_Activity {

    @TargetApi(Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        //setTieuDe();
        //getSupportActionBar().hide();
        //
        //LinearLayout Ti
        //
        /*ScrollView a1 = new ScrollView(this);
        setContentView(a1);
        LinearLayout b = new LinearLayout(this);
        a1.addView(b);
        b.setScrollbarFadingEnabled(true);
        TextView d = new TextView(this);
        d.setText("vai luyen");
        b.addView(d);
        b.setOrientation(LinearLayout.VERTICAL);


        VinhNT_Button a = new VinhNT_Button(this);
        b.addView(a);
        VinhNT_EditInteger so = new VinhNT_EditInteger(this);
        b.addView(so);
        VinhNT_EditInteger so1 = new VinhNT_EditInteger(this);
        b.addView(so1);
        VinhNT_EditInteger so7 = new VinhNT_EditInteger(this);
        b.addView(so7);
        ButtonTest testbutton = new ButtonTest(this);
        testbutton.setDulieu(so7);
        ImageView hinh = new ImageView(this);
        hinh.setImageResource(R.mipmap.icon_default);
        b.addView(hinh);
        b.addView(testbutton);


        //getSupportActionBar().hide();*/
    }
    public void setTieuDe(){
        //setTitle("abc003");
    }
}
