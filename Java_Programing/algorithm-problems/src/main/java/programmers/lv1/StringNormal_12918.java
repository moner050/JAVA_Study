package programmers.lv1;

// https://school.programmers.co.kr/learn/courses/30/lessons/12918
public class StringNormal_12918 {
    public static void main(String[] args) {
//        String s = "a234";
        String s = "1234";

        System.out.println(solution1(s));
        System.out.println(solution2(s));
    }

    public static boolean solution1(String s) {
        if(s.length() == 4 || s.length() == 6) {
            for (int i = 0; i < s.length(); i++) {
                if(!(s.charAt(i) >= 48 && s.charAt(i) <= 57)) return false;
            }
            return true;
        }
        else return false;
    }

    public static boolean solution2(String s) {
        return (s.length() == 4 || s.length() == 6) && (s.split("[0-9]").length <= 0);
    }
}
