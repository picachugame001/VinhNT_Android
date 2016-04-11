package bongda.dangkycauthu;

import android.content.Intent;
import android.widget.LinearLayout;
import android.widget.ScrollView;

import org.json.JSONObject;

import bongda.field.Email;
import bongda.field.gioi_tinh.Gioi_Tinh;
import bongda.field.Dia_Chi;
import bongda.field.Ho_Va_Ten_Dem;
import bongda.field.Ngay_Sinh;
import bongda.field.Password;
import bongda.field.So_CMND;
import bongda.field.So_Dien_Thoai;
import bongda.field.Ten;
import bongda.field.User;
import library.activity.VinhNT_Activity;
import library.view.VinhNT_TextView;

/**
 * Created by Picachu on 4/3/2016.
 */
public class DangKyCauThu_Form extends VinhNT_Activity {
    private User user;
    private Password password;
    private Button_OK_DangKy buton_ok;
    private DangKyCauThu_HTTP dangky_http;
    private Ho_Va_Ten_Dem ho_ten_dem;
    private Ten ten;
    private Gioi_Tinh gioi_tinh;
    private Ngay_Sinh ngay_sinh;
    private Dia_Chi dia_chi;
    private So_CMND so_cmnd;
    private So_Dien_Thoai so_dien_thoai;
    private Email email;
    @Override
    public String getTitle_VinhNT(){
        return "Đăng ký cầu thủ";
    }
    @Override
    public LinearLayout getContent() {
        VinhNT_TextView tenUser =  new VinhNT_TextView(this,"User ID:");
        VinhNT_TextView passwordLabel = new VinhNT_TextView(this,"Password:");
        VinhNT_TextView ho_Ten_Dem_Desc = new VinhNT_TextView(this,"Họ và tên đệm:");
        VinhNT_TextView ten_Desc = new VinhNT_TextView(this,"Tên:");
        VinhNT_TextView gioi_Desc = new VinhNT_TextView(this,"Giới tính:");
        VinhNT_TextView ngay_sinh_Desc = new VinhNT_TextView(this,"Ngày sinh:");
        VinhNT_TextView dia_chi_Desc = new VinhNT_TextView(this,"Địa chỉ:");
        VinhNT_TextView so_cmnd_Desc = new VinhNT_TextView(this,"Số CMND:");
        VinhNT_TextView so_dt_Desc = new VinhNT_TextView(this,"Số điện thoại:");
        VinhNT_TextView email_Desc = new VinhNT_TextView(this,"Địa chỉ email:");
        //
        user = new User(this);
        password = new Password(this);
        ho_ten_dem = new Ho_Va_Ten_Dem(this);
        ten = new Ten(this);
        gioi_tinh = new Gioi_Tinh(this);
        ngay_sinh = new Ngay_Sinh(this);
        dia_chi = new Dia_Chi(this);
        so_cmnd = new So_CMND(this);
        so_dien_thoai = new So_Dien_Thoai(this);
        email = new Email(this);
        //
        LinearLayout view = super.getContent();
        view.setOrientation(LinearLayout.VERTICAL);
        view.addView(tenUser);
        view.addView(user);
        view.addView(passwordLabel);
        view.addView(password);
        view.addView(ho_Ten_Dem_Desc);
        view.addView(ho_ten_dem);
        view.addView(ten_Desc);
        view.addView(ten);
        view.addView(gioi_Desc);
        view.addView(gioi_tinh);
        view.addView(ngay_sinh_Desc);
        view.addView(ngay_sinh);
        view.addView(dia_chi_Desc);
        view.addView(dia_chi);
        view.addView(so_cmnd_Desc);
        view.addView(so_cmnd);
        view.addView(so_dt_Desc);
        view.addView(so_dien_thoai);
        view.addView(email_Desc);
        view.addView(email);
        //
        return view;
    }
    @Override
    public LinearLayout getFooter(){
        //
        buton_ok = new Button_OK_DangKy(this);
        dangky_http = new DangKyCauThu_HTTP(this);
        dangky_http.setInfo(user,password,ho_ten_dem,ten,gioi_tinh,ngay_sinh,dia_chi,so_cmnd,so_dien_thoai,email);
        dangky_http.setNguCanh(this);
        buton_ok.setHTTP(dangky_http);
        //
        LinearLayout footer = super.getFooter();
        footer.addView(buton_ok);
        return footer;
    }
    @Override
    public Intent setResultIntentOK(){
        Intent a = super.setResultIntentOK();
        JSONObject dataReturn = new JSONObject();
        user.addParam(dataReturn);
        password.addParam(dataReturn);
        a.putExtra(RETURN_OBJECT,dataReturn.toString());
        //a.put
        return a;
    }
}
