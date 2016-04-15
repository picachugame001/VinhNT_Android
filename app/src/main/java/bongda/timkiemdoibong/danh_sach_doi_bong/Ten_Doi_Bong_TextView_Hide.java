package bongda.timkiemdoibong.danh_sach_doi_bong;

import android.content.Context;
import android.view.View;

import org.json.JSONException;
import org.json.JSONObject;

import library.view.VinhNT_TextView_Param;

/**
 * Created by Picachu on 4/15/2016.
 */
public class Ten_Doi_Bong_TextView_Hide extends VinhNT_TextView_Param {
    private Chon_Doi_Bong_CheckBox show_Text;
    public Ten_Doi_Bong_TextView_Hide(Context context,Chon_Doi_Bong_CheckBox kn) {
        super(context,"ten_doi_bong");
        setVisibility(View.GONE);
        show_Text = kn;
    }
    @Override
    public void getParam(JSONObject input) {
        super.getParam(input);
        show_Text.setText(getText().toString());
    }
}
