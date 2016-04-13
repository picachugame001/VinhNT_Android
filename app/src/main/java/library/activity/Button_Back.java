package library.activity;

import android.content.Context;
import android.view.View;

import library.view.VinhNT_Button;

/**
 * Created by Picachu on 4/11/2016.
 */
public class Button_Back extends VinhNT_Button {
    private VinhNT_Activity nguCanh;
    public Button_Back(VinhNT_Activity context) {
        super(context);
        nguCanh = context;
    }
    @Override
    public void onClick(View view){
        nguCanh.finish();
    }
    public String getNameButton(){
        return "Back";
    }
}
