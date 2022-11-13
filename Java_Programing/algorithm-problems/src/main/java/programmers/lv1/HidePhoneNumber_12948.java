package programmers.lv1;

// https://school.programmers.co.kr/learn/courses/30/lessons/12948
public class HidePhoneNumber_12948 {
    public static void main(String[] args) {
        String phone_number = "01033334444";
//        String phone_number = "027778888";
        System.out.println(solution(phone_number));
    }

    public static String solution(String phone_number) {
        return "*".repeat(phone_number.length() - 4) +
                phone_number.substring(phone_number.length() - 4, phone_number.length());
    }
}
