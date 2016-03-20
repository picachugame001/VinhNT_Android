package library.config;

import android.text.InputFilter;
import android.text.Spanned;

/**
 * Created by Picachu on 3/17/2016.
 */
public class OnlyText implements InputFilter {
    @Override
    public CharSequence filter(CharSequence source, int start, int end, Spanned dest, int dstart, int dend) {

        if(source.equals("")){ // for backspace
            return source;
        }
        if(source.toString().matches("[a-zA-Z0-9 ]+")){
            return source;
        }
        return "";
    }

}
