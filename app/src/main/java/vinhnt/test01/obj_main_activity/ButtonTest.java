package vinhnt.test01.obj_main_activity;

import android.app.ActionBar;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Toolbar;

import library.view.VinhNT_Button;
import library.view.VinhNT_EditInteger;
import vinhnt.test01.MainActivity;
import vinhnt.test01.Test;

/**
 * Created by Picachu on 3/13/2016.
 */
public class ButtonTest extends VinhNT_Button {
    private static final String TAG = MainActivity.class.getSimpleName();
    private VinhNT_EditInteger dulieu;
    public ButtonTest(Context context) {
        super(context);
    }
    public void setDulieu(VinhNT_EditInteger dulieu1){
        dulieu = dulieu1;
    }
    @Override
    public void onClick(View v) {
        Log.d(TAG, "abc kích button test");
        Intent cau01 = new Intent(getContext(), Test.class);
        String data1= dulieu.getText().toString();
        cau01.putExtra("BIEN1", data1);
        getContext().startActivity(cau01);
        //
        // TEST menu
        AppCompatActivity a = (AppCompatActivity)getContext();
        android.support.v7.app.ActionBar actionbar = a.getSupportActionBar();
        Log.d("gaga",actionbar.getTitle().toString());
    }
}
