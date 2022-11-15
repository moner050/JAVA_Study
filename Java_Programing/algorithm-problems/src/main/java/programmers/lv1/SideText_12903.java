package programmers.lv1;

// https://school.programmers.co.kr/learn/courses/30/lessons/12903
public class SideText_12903 {
    public static void main(String[] args) {
        String s = "abcde";
//        String s = "qwer";

        System.out.println(solution(s));
    }

    public static String solution(String s) {
        return s.substring((s.length() - 1) / 2, s.length() / 2 + 1);
    }
}
