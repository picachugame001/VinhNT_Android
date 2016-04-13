package bongda.quanlythongtin;

import android.content.Context;

import library.view.VinhNT_Dialog;

/**
 * Created by Picachu on 4/13/2016.
 */
public class MatKhau_Sai_Dialog extends VinhNT_Dialog {
    public MatKhau_Sai_Dialog(Context context) {
        super(context);
        setTitle("Lỗi");
        setMessage("Mật khẩu cũ nhập sai");
    }
}
