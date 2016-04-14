package bongda.dangkydoibong;

import android.content.Context;
import android.content.DialogInterface;

import bongda.dangkycauthu.DangKyCauThu_Form;
import library.view.VinhNT_Dialog;

/**
 * Created by Picachu on 4/14/2016.
 */
public class Dang_Ky_Doi_Bong_Hoan_Tat_Dialog extends VinhNT_Dialog implements DialogInterface.OnClickListener {
    private Dang_Ky_Doi_Bong_Form context1;
    public Dang_Ky_Doi_Bong_Hoan_Tat_Dialog(Context context,Dang_Ky_Doi_Bong_Form form) {
        super(context);
        setTitle("Thông báo");
        setMessage("Đăng ký dội bóng hoàn tất");
        context1 = form;
        setButton(BUTTON_POSITIVE, "OK",  this);
    }

    @Override
    public void onClick(DialogInterface dialog, int which) {
        switch (which){
            case BUTTON_POSITIVE:
                context1.setResultIntentOK();
                context1.finish();
                break;
        }

    }
}
