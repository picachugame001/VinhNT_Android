package bongda.login;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import library.activity.VinhNT_Activity;
import library.view.VinhNT_EditInteger;
import library.view.VinhNT_EditText;

/**
 * Created by Picachu on 3/17/2016.
 */
public class Login_Form extends VinhNT_Activity{
    private User user;
    private Passworkd password;
    private Button_Login buttonLogin;
    private Button_DangKi buttonDangKy;
    //
    /*public void init(){
        super.init();
    }*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    @Override
    public String getTitle_VinhNT(){
        return "Login Form";
    }
    @Override
    public ScrollView getContent(){
        TextView tenUser = new TextView(this);
        tenUser.setText("User ID:");
        TextView passwordLabel = new TextView(this);
        passwordLabel.setText("Password:");
        //
        user = new User(this);
        password = new Passworkd(this);
        //
        LinearLayout view = new LinearLayout(this);
        view.setOrientation(LinearLayout.VERTICAL);
        view.addView(tenUser);
        view.addView(user);
        view.addView(passwordLabel);
        view.addView(password);
        //
        ScrollView a = super.getContent();
        a.addView(view);
        return a;
    }
    @Override
    public LinearLayout getFooter(){
        LinearLayout footer = super.getFooter();
        buttonLogin = new Button_Login(this);
        buttonLogin.setHTTP(getHTTP());
        footer.addView(buttonLogin);
        buttonDangKy = new Button_DangKi(this);
        footer.addView(buttonDangKy);
        return footer;
    }

}
