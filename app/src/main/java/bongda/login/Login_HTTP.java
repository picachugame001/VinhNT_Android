package bongda.login;

import android.content.Intent;

import com.android.volley.VolleyError;

import org.json.JSONException;
import org.json.JSONObject;

import bongda.bangchinh.BangChinh_Form;
import bongda.field.Password;
import bongda.field.User;
import library.activity.VinhNT_Activity;
import library.activity.VinhNT_Common;
import library.connect.VinhNT_HTTP;
import library.view.VinhNT_Dialog;

/**
 * Created by Picachu on 4/2/2016.
 */
public class Login_HTTP extends VinhNT_HTTP {
    private User id;
    private VinhNT_Activity nguCanh;
    public Login_HTTP(VinhNT_Activity nguCanh) {
        super(nguCanh);
        this.nguCanh = nguCanh;
    }
    public void set_Param(User a, Password b){
        id = a;
        add_Parameter(a);
        add_Parameter(b);
    }
    @Override
    public void onResponse(JSONObject response) {
        super.onResponse(response);
        if(!is_Error_Common()){
            int lenngError = get_Error_Count();
            if(lenngError == 0){
                //dang nhap thanh cong
                VinhNT_Common.set_VinhNT_id(id.getText().toString());
                //
                JSONObject sendObj = new JSONObject();
                try {
                    int is_team_leader = getResults().getInt("is_team_leader");

                    sendObj.put("is_team_leader",is_team_leader);

                } catch (JSONException e) {
                    e.printStackTrace();
                }
                //

                Intent intent = new Intent(context, BangChinh_Form.class);
                intent.putExtra(nguCanh.SEND_OBJECT,sendObj.toString());
                context.startActivity(intent);
            }
            for(int i = 0;i<lenngError;i++){
                int error_Code = get_Error_Code(i);
                switch (error_Code) {
                    case 1:
                        //dang nhap that bai
                        VinhNT_Dialog loi = new VinhNT_Dialog(getContext(),"Lỗi đăng nhập","User nhập vào không tồn tại");
                        loi.show();
                        break;
                    case 2:
                        //dang nhap that bai
                        VinhNT_Dialog loi2 = new VinhNT_Dialog(getContext(),"Lỗi đăng nhập","Password nhập vào chưa đúng, xin nhập lại");
                        loi2.show();
                        break;
                }
            }
        }
    }

    @Override
    public void onErrorResponse(VolleyError error) {
        super.onErrorResponse(error);
    }
    @Override
    public String get_Function_Name(){
        return "login";
    }
    public String get_Tab(){
        if (tab == null){
            tab = "login";
        }
        return tab;
    }
}
