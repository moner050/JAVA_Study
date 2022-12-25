package programmers.lv0;

// 문자열 뒤집기
// https://school.programmers.co.kr/learn/courses/30/lessons/120822
public class ReverseString_120822 {
    public static void main(String[] args) {
        String my_string = "jaron";

        System.out.println(solution1(my_string));
        System.out.println(solution2(my_string));
    }

    public static String solution1(String my_string) {
        StringBuilder sb = new StringBuilder();

        for (int i = my_string.length() - 1; i >= 0; i--) {
            sb.append(my_string.charAt(i));
        }

        return sb.toString();
    }

    public static String solution2(String my_string) {
        StringBuilder sb = new StringBuilder(my_string);
        return sb.reverse().toString();
    }
}
