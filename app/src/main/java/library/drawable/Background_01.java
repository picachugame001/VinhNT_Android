package library.drawable;

import android.content.res.Resources;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.graphics.drawable.shapes.Shape;

/**
 * Created by Picachu on 11/4/2015.
 */
public class Background_01 extends ShapeDrawable {

    public void init(){
        setShape(new OvalShape());
        getPaint().setARGB(100,255,255,0);
    }
    public Background_01(){
        super();
        init();
    }
    public Background_01(Shape a){
        super(a);
        init();
    }
}
