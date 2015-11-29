package library.drawable;

import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.graphics.drawable.shapes.Shape;

/**
 * Created by Picachu on 11/5/2015.
 */
public class Background_03 extends ShapeDrawable {
    public void init(){
        setShape(new OvalShape());
        getPaint().setARGB(100,0,255,255);
    }
    public Background_03(){
        super();
        init();
    }
    public Background_03(Shape a){
        super(a);
        init();
    }
}

