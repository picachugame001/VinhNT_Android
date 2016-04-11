package library.view;

import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.text.util.Linkify;

/**
 * Created by Picachu on 4/10/2016.
 */
public class VinhNT_Hyperlink extends android.widget.TextView  {
    protected String hyperlink;
    public VinhNT_Hyperlink(Context context) {
        super(context);
        init();
    }
    public void init(){
        setAutoLinkMask(Linkify.WEB_URLS);
        setText(get_link());
        setMovementMethod(LinkMovementMethod.getInstance());
    }
    public String get_link(){
        if(hyperlink == null){
            hyperlink = "http://google.com.vn";
        }
        return hyperlink;
    }
}
