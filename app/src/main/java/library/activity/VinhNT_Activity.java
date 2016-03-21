package library.activity;

import android.annotation.TargetApi;
import android.content.pm.ActivityInfo;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;

import library.connect.VinhNT_HTTP;
import vinhnt.test01.R;

/**
 * Created by Picachu on 3/15/2016.
 */
public class VinhNT_Activity extends AppCompatActivity {
    private ImageView icon;
    private VinhNT_HTTP requestHTTP;
    //private
    public VinhNT_Activity(){
        super();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        init();
    }
    public void init(){
        //init common
        VinhNT_Common.init();
        //
        icon = new ImageView(this);
        icon.setImageResource(R.mipmap.icon_default);
        //
        requestHTTP = new VinhNT_HTTP(this);
        //
        //set layout
        LinearLayout mainView = new LinearLayout(this);
        setContentView(mainView);
        mainView.setOrientation(LinearLayout.VERTICAL);
        //
        VinhNT_Header header = new VinhNT_Header(this);
        mainView.addView(header, VinhNT_Common.size_10_per_HORIZONTAL);
        mainView.addView(getContent(),VinhNT_Common.size_80_per_HORIZONTAL);
        mainView.addView(getFooter(),VinhNT_Common.size_10_per_HORIZONTAL);

    }
    public ScrollView getContent() {
        ScrollView a = new ScrollView(this);
        return a;
    }
    @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
    public LinearLayout getFooter(){
        LinearLayout a = new LinearLayout(this);
        a.setBackground(VinhNT_Common.background01);
        a.setOrientation(LinearLayout.HORIZONTAL);
        /*Button buttonTest = new Button(this);
        buttonTest.setText("TEST");
        a.addView(buttonTest);
        Button buttonTest2 = new Button(this);
        buttonTest2.setText("TEST2");
        a.addView(buttonTest2);*/
        return a;
    }
    //
    public ImageView getIcon(){
        return icon;
    }
    public String getTitle_VinhNT(){
        return "Default title VinhNT";
    }
    @Override
    protected void onStop () {
        super.onStop();
        if (requestHTTP != null) {
            requestHTTP.cancelAll();
        }
    }
    public VinhNT_HTTP getHTTP(){
        return requestHTTP;
    }
}
