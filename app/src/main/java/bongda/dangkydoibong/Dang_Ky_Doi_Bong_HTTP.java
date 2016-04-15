package bongda.dangkydoibong;

import com.android.volley.VolleyError;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import bongda.field.Ten_Doi_Bong;
import bongda.field.User;
import bongda.field.gioi_tinh.Gioi_Tinh;
import library.activity.VinhNT_Activity;
import library.connect.VinhNT_HTTP;
import library.view.VinhNT_Dialog;

/**
 * Created by Picachu on 4/14/2016.
 */
public class Dang_Ky_Doi_Bong_HTTP extends VinhNT_HTTP {
    private Dang_Ky_Doi_Bong_Form form;
    public Dang_Ky_Doi_Bong_HTTP(
            VinhNT_Activity nguCanh
        ,   Ten_Doi_Bong a
        ,   User b
        ,   Gioi_Tinh c
        ,   Dang_Ky_Doi_Bong_Form d
    ) {
        super(nguCanh);
        add_Parameter(a);
        add_Parameter(b);
        add_Parameter(c);
        form = d;
    }
    @Override
    public String get_Function_Name(){
        return "dang_ky_doi_bong";
    }
    @Override
    public void onResponse(JSONObject response) {
        super.onResponse(response);
        try {
            JSONArray errors = response.getJSONArray("errors");
            int i=errors.length();
            if(i==0){
                Dang_Ky_Doi_Bong_Hoan_Tat_Dialog a = new Dang_Ky_Doi_Bong_Hoan_Tat_Dialog(getContext(),form);a.show();
            }
            else{
                for(int j=0;j<i;j++){
                    JSONObject b = errors.getJSONObject(j);
                    int error_code = b.getInt("code");
                    switch (error_code){
                        case 1:
                            VinhNT_Dialog viewerror = new VinhNT_Dialog(getContext(),"Lỗi","Tên đội bóng đã tồn tại");
                            viewerror.show();
                            break;
                    }
                }
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
