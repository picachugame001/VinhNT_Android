package library.drawable;

import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.graphics.drawable.shapes.Shape;

/**
 * Created by Picachu on 11/4/2015.
 */
public class Background_02 extends ShapeDrawable {
    public void init(){
        setShape(new OvalShape());
        getPaint().setARGB(100,255,0,255);
    }
    public Background_02(){
        super();
        init();
    }
    public Background_02(Shape a){
        super(a);
        init();
    }
}
