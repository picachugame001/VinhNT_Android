package library.connect;

import android.content.Context;

import library.view.VinhNT_Dialog;

/**
 * Created by Picachu on 4/10/2016.
 */
public class Dang_Xu_Ly_Dialog extends VinhNT_Dialog {
    public Dang_Xu_Ly_Dialog(Context context) {
        super(context);
        setTitle("Thông báo");
        setMessage("Hệ thống đang xử lý");
    }
}
