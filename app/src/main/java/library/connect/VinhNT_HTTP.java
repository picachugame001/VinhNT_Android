package library.connect;

import android.content.Context;
import android.util.Log;

import com.android.volley.AuthFailureError;
import com.android.volley.Cache;
import com.android.volley.Network;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.VolleyLog;
import com.android.volley.toolbox.BasicNetwork;
import com.android.volley.toolbox.DiskBasedCache;
import com.android.volley.toolbox.HttpStack;
import com.android.volley.toolbox.HurlStack;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.File;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

import library.activity.VinhNT_Activity;
import library.view.VinhNT_Dialog;

/**
 * Created by Picachu on 3/20/2016.
 */
public class VinhNT_HTTP implements Response.Listener<JSONObject>,Response.ErrorListener {
    private VinhNT_Activity context;
    private RequestQueue queue;
    public VinhNT_HTTP(VinhNT_Activity nguCanh){
        context = nguCanh;
        // Instantiate the cache
        Cache cache = new DiskBasedCache(context.getCacheDir(), 1024 * 1024); // 1MB cap
        cache.clear();
        //
        // Set up the network to use HttpURLConnection as the HTTP client.
        Network network = new BasicNetwork(new HurlStack());
        //
        // Instantiate the RequestQueue with the cache and network.
        queue = new RequestQueue(cache,network);

        //


    }
    public  void sendRequest() {
        //
        queue.start();
        try{
            String url ="http://192.168.0.101/bongda";
            // Request a string response from the provided URL.
           /* StringRequest stringRequest = new StringRequest(Request.Method.GET, url,
                    new Response.Listener<String>() {
                        @Override
                        public void onResponse(String response) {
                            // Display the first 500 characters of the response string.
                            Log.d("test NETWORK","Response is: " + response.substring(0, 500));
                        }
                    }, new Response.ErrorListener() {
                @Override
                public void onErrorResponse(VolleyError error) {
                    Log.d("test NETWORK", "That didn't work!");
                }
            });
            // Add the request to the RequestQueue.
            stringRequest.setTag(context.getTitle_VinhNT());
            //
            queue.add(stringRequest);*/
            //


            JSONObject jsonBody = new JSONObject();
            jsonBody.put("user","VinhNT");
            jsonBody.put("function", "login");
            JsonObjectRequest a = new JsonObjectRequest(Request.Method.POST,url,jsonBody,this,this);
            queue.add(a);


        }
        /*catch (JSONException  e){
            Log.d("Error","JSONException");
        }*/
        catch (Exception e){
            Log.d("Error","JSONException"+ e.getMessage());
        }

    }
    public void cancelAll(){
        queue.cancelAll(context.getTitle_VinhNT());
    }

    @Override
    public void onResponse(JSONObject response) {
        Log.d("Ket noi","OK roi nhe");
    }

    @Override
    public void onErrorResponse(VolleyError error) {
        Log.d("Ket noi","Loi roi");
    }
}
