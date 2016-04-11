package bongda.about;

import android.content.Context;

import library.view.VinhNT_Hyperlink;

/**
 * Created by Picachu on 4/10/2016.
 */
public class Link_To_DTU extends VinhNT_Hyperlink {
    public Link_To_DTU(Context context) {
        super(context);
    }
    @Override
    public String get_link(){
        if(hyperlink == null){
            hyperlink = "http://dtu.edu.vn";
        }
        return hyperlink;
    }
}
