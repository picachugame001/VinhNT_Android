package bongda.dangkycauthu;

import android.content.Context;
import android.content.DialogInterface;

import library.view.VinhNT_Dialog;

/**
 * Created by Picachu on 4/3/2016.
 */
public class DangKy_ThanhCong extends VinhNT_Dialog implements DialogInterface.OnClickListener{
    public DangKy_ThanhCong(Context context) {
        super(context);
        setTitle("Thông báo");
        setMessage("Đăng ký tài khoản thành công");
        setButton(1,"OK",this);
    }

    @Override
    public void onClick(DialogInterface dialog, int which) {
        switch (which){
            case 1:

                break;
        }

    }
}
