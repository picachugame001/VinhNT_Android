package vinhnt.test01;

import android.content.Intent;
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
import vinhnt.test01.obj_main_activity.ButtonTest;
import vinhnt.test01.obj_main_activity.Test_EditText;

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
        ButtonTest d = new ButtonTest(this);
        Test_EditText e = new Test_EditText(this);
        a.addView(b);
        a.addView(c);
        a.addView(d);
        a.addView(e);

        setContentView(a);

        Intent intent = getIntent();
        String message = intent.getStringExtra("BIEN1");
        c.setText(message);
    }

}
