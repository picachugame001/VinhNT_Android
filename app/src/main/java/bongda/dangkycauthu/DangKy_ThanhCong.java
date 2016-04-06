package bongda.dangkycauthu;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;

import library.view.VinhNT_Dialog;

/**
 * Created by Picachu on 4/3/2016.
 */
public class DangKy_ThanhCong extends VinhNT_Dialog implements DialogInterface.OnClickListener{
    DangKyCauThu_Form form;
    public DangKy_ThanhCong(Context context) {
        super(context);
        setTitle("Thông báo");
        setMessage("Đăng ký tài khoản thành công");
        setButton(BUTTON_POSITIVE,"OK",this);
    }
    public void setNguCanh(DangKyCauThu_Form a){
        form = a;
    }
    @Override
    public void onClick(DialogInterface dialog, int which) {
        switch (which){
            case BUTTON_POSITIVE:
                form.setResultIntentOK();
                form.finish();
                break;
        }

    }
}
