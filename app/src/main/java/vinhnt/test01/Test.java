package vinhnt.test01;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import library.view.VinhNT_Button;
import library.view.VinhNT_EditText;
import library.view.VinhNT_TextView;
import library.viewgroup.VinhNT_LinearLayout;

public class Test extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_test);
        //Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);

        VinhNT_LinearLayout a = new VinhNT_LinearLayout(this);

        library.view.VinhNT_TextView b = new VinhNT_TextView(this);
        VinhNT_EditText c = new VinhNT_EditText(this);
        VinhNT_Button d = new VinhNT_Button(this);
        a.addView(b);
        a.addView(c);
        a.addView(d);
        setContentView(a);
    }

}
