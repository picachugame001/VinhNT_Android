package library.view;

/**
 * Created by Picachu on 4/7/2016.
 */
public class Error_Input {
    public String get_Error_Code() {
        return error_Code;
    }

    public void set_Error_Code(String error_Code) {
        this.error_Code = error_Code;
    }

    public String get_Description() {
        return description;
    }

    public void set_Description(String description) {
        this.description = description;
    }

    private String error_Code;
    private String description;

    public String get_Title_msg() {
        return title_msg;
    }

    public void set_Title_msg(String title_msg) {
        this.title_msg = title_msg;
    }

    private String title_msg;
    public Error_Input(String code, String title,String desc){
        error_Code = code;
        description = desc;
        title_msg = title;
    }

}
