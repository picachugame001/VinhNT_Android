package library.view;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.StateListDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.graphics.drawable.shapes.RectShape;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import library.drawable.Background_01;
import library.drawable.Background_02;
import library.drawable.State_01;
import vinhnt.test01.R;

/**
 * Created by Picachu on 11/4/2015.
 */
public class VinhNT_Button extends Button implements View.OnClickListener {

   @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
   public void init(){
       //setBackgroundColor(1);
       //setBackgroundDrawable(new State_01());
       setText(this.getNameButton());
       ViewGroup.LayoutParams layoutSize;
       layoutSize = new ViewGroup.LayoutParams(
                            ViewGroup.LayoutParams.WRAP_CONTENT
                        ,   ViewGroup.LayoutParams.WRAP_CONTENT
                    );
       setLayoutParams(layoutSize);
       setOnClickListener(this);
   }
    public VinhNT_Button(Context context) {
        super(context);
        init();
    }

    public VinhNT_Button(Context context, AttributeSet attrs) {
        super(context, attrs);

        init();

    }

    public VinhNT_Button(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }
    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public VinhNT_Button(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init();
    }

    @Override
    public void onClick(View v) {

    }
    public String getNameButton(){
        return "Button của Vinh";
    }
}
