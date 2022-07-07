package effectiveJava.item6;

public class EmailValidate {

    static boolean email(String email){
        return email.matches("^[a-zA-Z0-9+-\\_.]+@[a-zA-Z0-9-]+\\.[a-zA-Z0-9-.]+$");
    }

}
