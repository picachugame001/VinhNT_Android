package bongda.chon_cong_ty;

import org.json.JSONObject;

import bongda.chon_cong_ty.table_cong_ty.Bang_Cong_Ty;
import library.activity.VinhNT_Activity;
import library.connect.VinhNT_HTTP;

/**
 * Created by Picachu on 5/18/2016.
 */
public class Bang_Cong_Ty_HTTP extends VinhNT_HTTP {
    private Bang_Cong_Ty bang_cong_ty;
    public Bang_Cong_Ty_HTTP(VinhNT_Activity nguCanh,Bang_Cong_Ty in_bang_cong_ty) {
        super(nguCanh);
        bang_cong_ty = in_bang_cong_ty;
    }
    public String get_Function_Name(){
        return "lay_danh_sach_cong_ty";
    }
    @Override
    public void onResponse(JSONObject response){
        super.onResponse(response);
        if(!is_Error_Common()){
            bang_cong_ty.getParam(getResults());
        }
    }
}
