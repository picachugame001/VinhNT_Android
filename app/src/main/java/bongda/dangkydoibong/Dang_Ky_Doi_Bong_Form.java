package bongda.dangkydoibong;

import android.view.View;
import android.widget.LinearLayout;

import bongda.field.Ten_Doi_Bong;
import bongda.field.User;
import library.activity.VinhNT_Activity;
import library.activity.VinhNT_Common;
import library.view.VinhNT_TextView;

/**
 * Created by Picachu on 4/14/2016.
 */
public class Dang_Ky_Doi_Bong_Form extends VinhNT_Activity {
    private Ten_Doi_Bong ten_doi_bong;
    private User user;
    //
    private Dang_Ky_Doi_Bong_HTTP dang_ky_doi_bong_http;
    @Override
    public String getTitle_VinhNT(){
        return "Đăng ký đội bóng";
    }
    @Override
    public LinearLayout getContent() {
        LinearLayout content = super.getContent();
        //
        ten_doi_bong = new Ten_Doi_Bong(this);
        user = new User(this);
        user.setVisibility(View.GONE);
        user.setText(VinhNT_Common.get_VinhNT_id());
        //
        dang_ky_doi_bong_http = new Dang_Ky_Doi_Bong_HTTP(this,ten_doi_bong,user,this);
        //
        VinhNT_TextView ten_db_desc = new VinhNT_TextView(this,"Tên đội bóng");
        //VinhNT_TextView gioi_desc = new VinhNT_TextView(this,"Giới tính cầu thủ:");
        //
        content.addView(ten_db_desc);
        content.addView(ten_doi_bong);
        content.addView(user);
        //content.addView(gioi_desc);


        //
        return content;
    }
    @Override
    public LinearLayout getFooter(){
        LinearLayout footer = super.getFooter();
        //
        Button_OK_Dang_Ky_Doi_Bong button_ok_dang_ky_doi_bong = new Button_OK_Dang_Ky_Doi_Bong(this,dang_ky_doi_bong_http);
        footer.addView(button_ok_dang_ky_doi_bong);
        //
        return footer;
    }
}
