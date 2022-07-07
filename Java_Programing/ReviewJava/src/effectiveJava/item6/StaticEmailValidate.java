package effectiveJava.item6;

import java.util.regex.Pattern;

public class StaticEmailValidate {

    private static final Pattern EMAIL = Pattern.compile(
        "^[a-zA-Z0-9+-\\_.]+@[a-zA-Z0-9-]+\\.[a-zA-Z0-9-.]+$"
    );

    static boolean isEmail(String email){
        return EMAIL.matcher(email).matches();
    }

}
