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
        ,   Dang_Ky_Doi_Bong_Form d
    ) {
        super(nguCanh);
        add_Parameter(a);
        add_Parameter(b);
        form = d;
    }
    @Override
    public String get_Function_Name(){
        return "dang_ky_doi_bong";
    }
    @Override
    public void onResponse(JSONObject response) {
        super.onResponse(response);
        if(!is_Error_Common()) {
            int lenngError = get_Error_Count();
            if (lenngError == 0) {
                Dang_Ky_Doi_Bong_Hoan_Tat_Dialog a = new Dang_Ky_Doi_Bong_Hoan_Tat_Dialog(getContext(),form);a.show();
            }
            for(int i = 0;i<lenngError;i++){
                int error_Code = get_Error_Code(i);
                switch (error_Code) {
                    case 6:
                        VinhNT_Dialog loi6 = new VinhNT_Dialog(getContext(),"Lỗi đăng ký","tên đội bóng đã có người đăng ký.");
                        loi6.show();
                        break;
                }
            }
        }
    }
}
