package bongda.duyetdongianhap.table_gia_nhap;

import android.content.Context;

import bongda.field.User;

/**
 * Created by Picachu on 4/27/2016.
 */
public class User_Hide extends User {
    public User_Hide(Context context) {
        super(context);
        setVisibility(GONE);
    }
}
