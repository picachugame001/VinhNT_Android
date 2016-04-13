package bongda.login;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import org.json.JSONException;
import org.json.JSONObject;

import bongda.field.Password;
import bongda.field.User;
import library.activity.VinhNT_Activity;

/**
 * Created by Picachu on 3/17/2016.
 */
public class Login_Form extends VinhNT_Activity{
    private User user;
    private Password password;
    private Button_Login buttonLogin;
    private Button_DangKi buttonDangKy;
    private Login_HTTP requestLogin;
    public static final int REQUEST_DANGKI = 2;
    //
    /*public void init(){
        super.init();
    }*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    @Override
    public void init(){
        super.init();
    }
    @Override
    public String getTitle_VinhNT(){
        return "Login Form";
    }
    @Override
    public LinearLayout getContent(){
        TextView tenUser = new TextView(this);
        tenUser.setText("User ID:");
        TextView passwordLabel = new TextView(this);
        passwordLabel.setText("Password:");
        //
        user = new User(this);
        password = new Password(this);
        //
        LinearLayout view = super.getContent();
        view.addView(tenUser);
        view.addView(user);
        view.addView(passwordLabel);
        view.addView(password);
        //
        return view;
    }
    @Override
    public LinearLayout getFooter(){
        requestLogin = new Login_HTTP(this);
        requestLogin.set_Param(user, password);
        LinearLayout footer = super.getFooter();
        buttonLogin = new Button_Login(this);
        buttonLogin.setHTTP(requestLogin);
        footer.addView(buttonLogin);
        buttonDangKy = new Button_DangKi(this);
        footer.addView(buttonDangKy);
        return footer;
    }
    @Override
    protected void onActivityResult (int requestCode, int resultCode, Intent data){
        switch (requestCode){
            case REQUEST_DANGKI:
                if(resultCode == Activity.RESULT_OK){
                    String returnString = data.getStringExtra(RETURN_OBJECT);
                    try {
                        JSONObject returnJSON = new JSONObject(returnString);
                        user.getParam(returnJSON);
                        password.getParam(returnJSON);

                    } catch (JSONException e) {
                        e.printStackTrace();
                    }

                }
                break;
        }
    }

}
