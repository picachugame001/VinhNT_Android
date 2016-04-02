package bongda.login;

import android.content.Context;

import library.view.VinhNT_Dialog;

/**
 * Created by Picachu on 4/2/2016.
 */
public class Login_Error extends VinhNT_Dialog {
    public Login_Error(Context context) {
        super(context);
        setTitle("Lỗi đăng nhập");
        setMessage("Tài khoản hoặc mật khẩu chưa đúng");
    }
}
