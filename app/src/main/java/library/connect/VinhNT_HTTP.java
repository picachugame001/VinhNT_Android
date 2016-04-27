package library.connect;

import android.util.Log;

import com.android.volley.Cache;
import com.android.volley.DefaultRetryPolicy;
import com.android.volley.Network;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.BasicNetwork;
import com.android.volley.toolbox.DiskBasedCache;
import com.android.volley.toolbox.HurlStack;
import com.android.volley.toolbox.JsonObjectRequest;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

import library.activity.Dialog_LoiKetNoi;
import library.activity.VinhNT_Activity;
import library.activity.VinhNT_Common;
import library.view.VinhNT_Dialog;


/**
 * Created by Picachu on 3/20/2016.
 */
public class VinhNT_HTTP implements Response.Listener<JSONObject>,Response.ErrorListener {
    protected VinhNT_Activity context;
    private RequestQueue queue;
    protected JSONObject data;
    private VinhNT_Array_Parameter params;
    protected String tab = "abc1234";
    private Dang_Xu_Ly_Dialog thong_bao_xu_ly;
    private JSONObject results;
    private JSONArray errors;
    private boolean error_Common; //true: có error; false: không có error
    //
    public VinhNT_Activity getContext(){
        return context;
    }
    public String get_Function_Name(){
        return "VinhNT";
    }

    public VinhNT_HTTP(VinhNT_Activity nguCanh) {
        context = nguCanh;
        // Instantiate the cache
        Cache cache = new DiskBasedCache(context.getCacheDir(), 1024 * 1024); // 1MB cap
        //
        // Set up the network to use HttpURLConnection as the HTTP client.
        Network network = new BasicNetwork(new HurlStack());

        //
        // Instantiate the RequestQueue with the cache and network.
        queue = new RequestQueue(cache, network);
        //
        params = new VinhNT_Array_Parameter();


    }
    public void setData(){
        //
        error_Common = false;
        data = new JSONObject();
        params.set_Function_Name(data,get_Function_Name());
        params.set_Parameter(data);
    }
    public void sendRequest() {
        //

        try {
            if(params.checkInput()){
                queue.stop();
                queue.start();
                hien_Thi_Thong_Bao_Xu_Ly();
                setData();
                //
                JsonObjectRequest a = new JsonObjectRequest(Request.Method.POST, VinhNT_Common.link, data, this, this);
                a.setRetryPolicy(new DefaultRetryPolicy(DefaultRetryPolicy.DEFAULT_TIMEOUT_MS * 10, DefaultRetryPolicy.DEFAULT_MAX_RETRIES, DefaultRetryPolicy.DEFAULT_BACKOFF_MULT));

                a.setTag(get_Tab());
                queue.add(a);
            }

        } catch (Exception e) {
            Log.d("Error", "JSONException");
        }

    }

    public void cancelAll() {
        queue.cancelAll(get_Tab());
    }

    @Override
    public void onResponse(JSONObject response) {
        Log.d("Ket noi", "OK roi nhe");
        queue.cancelAll(get_Tab());
        queue.stop();
        try {
            results = response.getJSONObject("results");
            errors = response.getJSONArray("errors");
            error_Common = check_Common_Error();
        } catch (JSONException e) {
            e.printStackTrace();
        }
        dong_Thong_Bao_Xu_Ly();
    }

    @Override
    public void onErrorResponse(VolleyError error) {
        Log.d("Ket noi", "Loi roi");
        dong_Thong_Bao_Xu_Ly();
        Dialog_LoiKetNoi error2 = new Dialog_LoiKetNoi(context);
        error2.show();

        queue.cancelAll(get_Tab());
        queue.stop();
    }

    public String get_Tab(){
        if (tab == null){
            tab = "tab01";
        }
        return tab;
    }

    private void hien_Thi_Thong_Bao_Xu_Ly(){
        thong_bao_xu_ly = new Dang_Xu_Ly_Dialog(getContext());
        thong_bao_xu_ly.show();
    }
    private void dong_Thong_Bao_Xu_Ly(){
        thong_bao_xu_ly.cancel();
        thong_bao_xu_ly = null;
    }
    private JSONArray getErrors(){
        return errors;
    }
    /**
     * return true: no error
     * return false: have errror
     */
    private boolean check_Common_Error(){
        int size = get_Error_Count();
        for(int i=0;i<size;i++){
            int error_code = get_Error_Code(i);
            switch (error_code){
                case -1:
                    VinhNT_Dialog viewerror = new VinhNT_Dialog(getContext(),"Lỗi DB","DataBase had an exception");
                    viewerror.show();
                    return true;
                    //break;
                default:
                    break;
            }

        }
        return false;
    }
    protected boolean is_Error_Common(){
        return error_Common;
    }

    protected JSONObject getResults(){
        return results;
    }
    //  PROCESS ERROR
    protected int get_Error_Code(int index){
        JSONArray errorArray = getErrors();
        try {
            JSONObject errorObj = errorArray.getJSONObject(index);
            int code_error =  errorObj.getInt("code");
            return code_error;
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return 0;
    }
    protected int get_Sub_Code(int index){
        JSONArray errorArray = getErrors();
        try {
            JSONObject errorObj = errorArray.getJSONObject(index);
            int sub_code =  errorObj.getInt("sub_code");
            return sub_code;
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return 0;
    }
    protected int get_Error_Count(){
        JSONArray errorArray = getErrors();
        return errorArray.length();
    }
    protected final void add_Parameter(VinhNT_Parameter input){
        params.add_Parameter(input);
    }
}

