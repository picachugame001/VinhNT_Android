package bongda.quanlythongtin;

import android.util.Log;

import com.android.volley.VolleyError;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import bongda.field.Dia_Chi;
import bongda.field.Email;
import bongda.field.Ho_Va_Ten_Dem;
import bongda.field.Ngay_Sinh;
import bongda.field.So_CMND;
import bongda.field.So_Dien_Thoai;
import bongda.field.Ten;
import bongda.field.User;
import bongda.field.gioi_tinh.Gioi_Tinh;
import library.activity.Dialog_LoiKetNoi;
import library.activity.VinhNT_Activity;
import library.connect.VinhNT_HTTP;

/**
 * Created by Picachu on 4/11/2016.
 */
public class Khoi_Tao_Data_HTTP extends VinhNT_HTTP {
    private Old_Password    old_password        ;
    private  New_Password   new_password        ;
    private Ho_Va_Ten_Dem   ho_ten_dem          ;
    private Ten             ten                 ;
    private Gioi_Tinh       gioi_tinh           ;
    private Ngay_Sinh       ngay_sinh           ;
    private Dia_Chi         dia_chi             ;
    private So_CMND         so_cmnd             ;
    private So_Dien_Thoai   so_dien_thoai       ;
    private Email           email               ;
    public Khoi_Tao_Data_HTTP(
                VinhNT_Activity nguCanh
            ,   User_TextView   a
            ,   Old_Password    b
            ,   New_Password    c
            ,   Ho_Va_Ten_Dem   d
            ,   Ten             e
            ,   Gioi_Tinh       f
            ,   Ngay_Sinh       h
            ,   Dia_Chi         i
            ,   So_CMND         j
            ,   So_Dien_Thoai   k
            ,   Email           l
    ) {
        super(nguCanh);
        add_Parameter(a);
        old_password     = b  ;
        new_password     = c  ;
        ho_ten_dem       = d  ;
        ten              = e  ;
        gioi_tinh        = f  ;
        ngay_sinh        = h  ;
        dia_chi          = i  ;
        so_cmnd          = j  ;
        so_dien_thoai    = k  ;
        email            = l  ;
    }
    public String get_Function_Name(){
        return "lay_data_cau_thu";
    }
    @Override
    public String get_Tab(){
        if (tab == null){
            tab = "khoiTaoCauThu";
        }
        return tab;
    }
    @Override
    public void onResponse(JSONObject response) {
        super.onResponse(response);
        try{
            JSONObject results = getResults();
            JSONArray data_array = results.getJSONArray("data_cau_thu");
            JSONObject data = data_array.getJSONObject(0);
            ho_ten_dem.getParam(data);
            ten.getParam(data);
            gioi_tinh.getParam(data);
            ngay_sinh.getParam(data);
            dia_chi.getParam(data);
            so_cmnd.getParam(data);
            so_dien_thoai.getParam(data);
            email.getParam(data);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
    @Override
    public void onErrorResponse(VolleyError error) {
        super.onErrorResponse(error);
    }
}

