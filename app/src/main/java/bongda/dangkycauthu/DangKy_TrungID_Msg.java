package bongda.dangkycauthu;

import android.content.Context;

import library.view.VinhNT_Dialog;

/**
 * Created by Picachu on 4/7/2016.
 */
public class DangKy_TrungID_Msg extends VinhNT_Dialog {
    public DangKy_TrungID_Msg(Context context) {
        super(context);
        setTitle("Lỗi dăng kí");
        setMessage("Id đăng kí đã tồn tại");
        show();
    }
}
