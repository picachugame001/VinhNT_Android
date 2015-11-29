package vinhnt.test01;

import android.annotation.TargetApi;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextSwitcher;
import android.widget.TextView;

import library.view.VinhNT_Button;
//test 002
public class MainActivity extends AppCompatActivity {

    @TargetApi(Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        LinearLayout b = new LinearLayout(this);
        TextView c = new TextView(this);
        c.setText("vai luyen");
        TextView d = new TextView(this);
        d.setText("vai luyen");
        b.addView(c);
        b.addView(d);
        b.setOrientation(LinearLayout.VERTICAL);
        setContentView(b);
        VinhNT_Button a;
        a = (VinhNT_Button) findViewById(R.id.button);
    }
}
