package library.drawable;

import android.graphics.drawable.StateListDrawable;

import android.R;

/**
 * Created by Picachu on 11/4/2015.
 */
public class State_01 extends StateListDrawable {

    public void init(){

        addState(new int[]{
                    R.attr.state_pressed
        }, new Background_01());

        addState(new int[]{}, new Background_02());

    }

    public State_01(){
        super();
        init();
    }
}
