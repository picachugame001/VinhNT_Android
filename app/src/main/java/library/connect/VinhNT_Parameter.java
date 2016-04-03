package library.connect;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by Picachu on 4/2/2016.
 */
public interface VinhNT_Parameter {
    public void addParam(JSONObject input) throws JSONException;
    public String get_field_name();
}
