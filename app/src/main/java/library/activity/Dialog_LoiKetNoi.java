package library.activity;

import android.content.Context;

import library.view.VinhNT_Dialog;

/**
 * Created by Picachu on 3/19/2016.
 */
public class Dialog_LoiKetNoi extends VinhNT_Dialog {
    public Dialog_LoiKetNoi(Context context) {
        super(context);
        setTitle("Lỗi kết nối");
        setMessage("Vui lòng kiểm tra lại kết nối");
    }
}
