package bongda.quanlythongtin;

import android.view.View;
import android.widget.LinearLayout;

import bongda.field.Dia_Chi;
import bongda.field.Email;
import bongda.field.Ho_Va_Ten_Dem;
import bongda.field.Ngay_Sinh;
import bongda.field.So_CMND;
import bongda.field.So_Dien_Thoai;
import bongda.field.Ten;
import bongda.field.gioi_tinh.Gioi_Tinh;
import library.activity.VinhNT_Activity;
import library.activity.VinhNT_Common;
import library.view.VinhNT_TextView;

/**
 * Created by Picachu on 4/11/2016.
 */
public class Quan_Ly_Thong_Tin_Form extends VinhNT_Activity {
    private User_TextView user;
    private Old_Password old_password;
    private  New_Password new_password;
    private Ho_Va_Ten_Dem ho_ten_dem;
    private Ten ten;
    private Gioi_Tinh gioi_tinh;
    private Ngay_Sinh ngay_sinh;
    private Dia_Chi dia_chi;
    private So_CMND so_cmnd;
    private So_Dien_Thoai so_dien_thoai;
    private Email email;
    //

    //
    @Override
    public String getTitle_VinhNT(){
        return "Cập nhật thông tin";
    }
    @Override
    public LinearLayout getContent() {
        VinhNT_TextView user_desc = new VinhNT_TextView(this,"tài khoản:");
        VinhNT_TextView mk_desc = new VinhNT_TextView(this,"mật khẩu cũ:");
        VinhNT_TextView mk_n_desc = new VinhNT_TextView(this,"mật khẩu mới:");
        VinhNT_TextView ho_Ten_Dem_Desc = new VinhNT_TextView(this,"Họ và tên đệm:");
        VinhNT_TextView ten_Desc = new VinhNT_TextView(this,"Tên:");
        VinhNT_TextView gioi_Desc = new VinhNT_TextView(this,"Giới tính:");
        VinhNT_TextView ngay_sinh_Desc = new VinhNT_TextView(this,"Ngày sinh:");
        VinhNT_TextView dia_chi_Desc = new VinhNT_TextView(this,"Địa chỉ:");
        VinhNT_TextView so_cmnd_Desc = new VinhNT_TextView(this,"Số CMND:");
        VinhNT_TextView so_dt_Desc = new VinhNT_TextView(this,"Số điện thoại:");
        VinhNT_TextView email_Desc = new VinhNT_TextView(this,"Địa chỉ email:");
        //
        user = new User_TextView(this,VinhNT_Common.get_VinhNT_id());
        old_password = new Old_Password(this);
        new_password = new New_Password(this);
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
        view.addView(user_desc);
        view.addView(user);
        view.addView(mk_desc);
        view.addView(old_password);
        view.addView(mk_n_desc);
        view.addView(new_password);
        view.addView(ho_Ten_Dem_Desc);
        view.addView(ho_ten_dem);
        view.addView(ten_Desc);
        view.addView(ten);
        //view.addView(gioi_Desc);
        view.addView(gioi_tinh);
        gioi_tinh.setVisibility(View.GONE);
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
        Update_CauThu_HTTP http = new Update_CauThu_HTTP(this,new_password,old_password,ho_ten_dem,ten,gioi_tinh,ngay_sinh,dia_chi,so_cmnd,so_dien_thoai,email,user);
        Button_Update update = new Button_Update(this,http);

        //
        LinearLayout footer = super.getFooter();
        footer.addView(update);
        return footer;
    }
    @Override
    public void init(){
        super.init();
        Khoi_Tao_Data_HTTP layData = new Khoi_Tao_Data_HTTP(this,user,old_password,new_password,ho_ten_dem,ten,gioi_tinh,ngay_sinh,dia_chi,so_cmnd,so_dien_thoai,email);
        layData.sendRequest();
    }

}
