package library.connect;

import android.util.Log;

import com.android.volley.Cache;
import com.android.volley.Network;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.BasicNetwork;
import com.android.volley.toolbox.DiskBasedCache;
import com.android.volley.toolbox.HurlStack;
import com.android.volley.toolbox.JsonObjectRequest;

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


/**
 * Created by Picachu on 3/20/2016.
 */
public class VinhNT_HTTP implements Response.Listener<JSONObject>,Response.ErrorListener {
    protected VinhNT_Activity context;
    private RequestQueue queue;
    protected JSONObject data;

    public VinhNT_Activity getContext(){
        return context;
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


    }
    public void setData() throws JSONException {
        data = new JSONObject();
        data.put("function", "VinhNT");
    }
    public void sendRequest() {
        //
        queue.stop();
        queue.start();
        try {
            setData();
            //
            JsonObjectRequest a = new JsonObjectRequest(Request.Method.POST, VinhNT_Common.link, data, this, this);
            a.setTag(context.getTitle_VinhNT());
            queue.add(a);

        } catch (Exception e) {
            Log.d("Error", "JSONException");
        }

    }

    public void cancelAll() {
        queue.cancelAll(context.getTitle_VinhNT());
    }

    @Override
    public void onResponse(JSONObject response) {
        Log.d("Ket noi", "OK roi nhe");
    }

    @Override
    public void onErrorResponse(VolleyError error) {
        Log.d("Ket noi", "Loi roi");
        Dialog_LoiKetNoi error2 = new Dialog_LoiKetNoi(context);
        error2.show();
    }
}
