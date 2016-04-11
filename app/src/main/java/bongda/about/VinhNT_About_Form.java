package bongda.about;

import android.util.Log;
import android.view.Menu;
import android.widget.LinearLayout;
import android.widget.ScrollView;

import library.activity.VinhNT_Activity;
import library.view.VinhNT_Button;

/**
 * Created by Picachu on 4/10/2016.
 */
public class VinhNT_About_Form extends VinhNT_Activity {
    @Override
    public String getTitle_VinhNT(){
        return "Bản quyền";
    }
    @Override
    public LinearLayout getContent() {
        Gioi_Thieu gt = new Gioi_Thieu(this);
        Link_To_DTU dtu = new Link_To_DTU(this);
        //
        LinearLayout main = super.getContent();
        //
        main.addView(gt);
        main.addView(dtu);
        //
        return main;
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        if(menu == null){
            Log.d("error", "menu is null");
        }
        if (menu != null) {
            menu.add("Exit");
        }
        return temp_method(menu);
    }
}
