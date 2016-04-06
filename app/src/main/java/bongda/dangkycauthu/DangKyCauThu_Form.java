package bongda.dangkycauthu;

import android.content.Intent;
import android.net.Uri;
import android.os.Parcel;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import org.json.JSONObject;

import java.util.List;

import bongda.login.Password;
import bongda.login.User;
import library.activity.VinhNT_Activity;

/**
 * Created by Picachu on 4/3/2016.
 */
public class DangKyCauThu_Form extends VinhNT_Activity {
    private User user;
    private Password password;
    private Button_OK_DangKy buton_ok;
    private DangKyCauThu_HTTP dangky_http;
    @Override
    public String getTitle_VinhNT(){
        return "Đăng ký cầu thủ";
    }
    @Override
    public ScrollView getContent() {
        TextView tenUser = new TextView(this);
        tenUser.setText("User ID:");
        TextView passwordLabel = new TextView(this);
        passwordLabel.setText("Password:");
        user = new User(this);
        password = new Password(this);
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
        //
        buton_ok = new Button_OK_DangKy(this);
        dangky_http = new DangKyCauThu_HTTP(this);
        dangky_http.setInfo(user,password);
        dangky_http.setNguCanh(this);
        buton_ok.setHTTP(dangky_http);
        //
        LinearLayout footer = super.getFooter();
        footer.addView(buton_ok);
        return footer;
    }
    @Override
    public Intent setResultIntentOK(){
        Intent a = super.setResultIntentOK();
        JSONObject dataReturn = new JSONObject();
        user.addParam(dataReturn);
        password.addParam(dataReturn);
        a.putExtra(RETURN_OBJECT,dataReturn.toString());
        //a.put
        return a;
    }
}
