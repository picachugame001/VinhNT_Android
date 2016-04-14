package library.activity;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;

import bongda.about.VinhNT_About_Form;
import library.connect.VinhNT_HTTP;
import library.view.VinhNT_Button;
import library.view.VinhNT_TextView;
import vinhnt.test01.R;


/**
 * Created by Picachu on 3/15/2016.
 */
public class VinhNT_Activity extends AppCompatActivity {
    public final String RETURN_OBJECT = "VinhNT_Return";
    private ImageView icon;
    //private
    public VinhNT_Activity(){
        super();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //getSupportActionBar().hide();

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        init();
    }
    public void init(){
        //init common
        VinhNT_Common.init(this);
        //
        icon = new ImageView(this);
        icon.setImageResource(R.mipmap.icon_default);
        //
        //set layout
        LinearLayout mainView = new LinearLayout(this);
        setContentView(mainView);
        mainView.setOrientation(LinearLayout.VERTICAL);
        //
        ActionBar actionBar = getSupportActionBar();
        //actionBar.hide();
        actionBar.setBackgroundDrawable(VinhNT_Common.create_background01());
        Resources res = getResources();
        //actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(false);
        actionBar.setHomeAsUpIndicator(R.drawable.ball);
        actionBar.setTitle(getTitle_VinhNT());
        /*VinhNT_Header header = new VinhNT_Header(this);
        //
        mainView.addView(   header
                        ,   VinhNT_Common.size_10_per_HORIZONTAL
                        );*/
        ScrollView main = new ScrollView(this);
        main.addView(getContent());
        mainView.addView(main, VinhNT_Common.size_80_per_HORIZONTAL);
        mainView.addView(getFooter(),VinhNT_Common.size_10_per_HORIZONTAL);

    }
    public LinearLayout getContent() {
        LinearLayout a = new LinearLayout(this);
        a.setOrientation(LinearLayout.VERTICAL);
        return a;
    }
    @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
    public LinearLayout getFooter(){
        LinearLayout a = new LinearLayout(this);
        a.setBackground(VinhNT_Common.create_background01());
        a.setOrientation(LinearLayout.HORIZONTAL);
        return a;
    }
    //
    public ImageView getIcon(){
        return icon;
    }
    public String getTitle_VinhNT(){
        return "Default title VinhNT";
    }
    public Intent setResultIntentOK(){
        Intent result = new Intent();
        setResult(Activity.RESULT_OK,result);
        return result;
    }
    public Intent setResultIntentCancel(){
        Intent result = new Intent();
        setResult(Activity.RESULT_CANCELED,result);
        return result;
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        if(menu == null){
            Log.d("errror", "menu is null");
        }
        if (menu != null) {
            menu.add("Exit");
            menu.add("About");

        }
        return super.onCreateOptionsMenu(menu);
    }
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle presses on the action bar items
        String item_chose= item.getTitle().toString();
        if(item_chose.equals("Exit")){
            setResultIntentCancel();
            finish();
        }
        if(item_chose.equals("About")){
            //go to dang ky form
            Intent intent = new Intent(this, VinhNT_About_Form.class);
            startActivity(intent);
        }
        return true;
    }
    protected boolean temp_method(Menu menu){
        return super.onCreateOptionsMenu(menu);
    }

}
