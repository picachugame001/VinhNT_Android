package library.view;

import android.content.Context;

import java.util.ArrayList;

/**
 * Created by Picachu on 4/8/2016.
 */
public class VinhNT_EditEmail extends VinhNT_EditText {
    public VinhNT_EditEmail(Context context) {
        super(context);
    }
    public String getHintToShow(){
        return "nhập email";
    }
    public int getMaxLength(){
        return 50; // max length in text field
    }
    @Override
    public String get_field_name() {
        return "email";
    }
    @Override
    public ArrayList<Error_Input> checkInput(){
        ArrayList<Error_Input> reuturn_Error = super.checkInput();
        String value = getText().toString();
        if(!value.equals("")){
            if(!android.util.Patterns.EMAIL_ADDRESS.matcher(value).matches()){
                String errorMessage = "trường "+get_field_name()+" có định dạng email chưa chính xác";
                reuturn_Error.add(new Error_Input("1", "Lỗi định dạng", errorMessage));
            }
        }
        return reuturn_Error;
    }
}
