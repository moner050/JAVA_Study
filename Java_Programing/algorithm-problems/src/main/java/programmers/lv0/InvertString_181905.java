package programmers.lv0;

// 문자열 뒤집기
// https://school.programmers.co.kr/learn/courses/30/lessons/181905
public class InvertString_181905 {
    public static void main(String[] args) {
        String my_string = "Progra21Sremm3";
        int s = 6, e = 12;

        System.out.println(solution(my_string, s, e));
    }

    public static String solution(String my_string, int s, int e) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s; i++) {
            sb.append(my_string.charAt(i));
        }

        for (int i = e; i >= s; i--) {
            sb.append(my_string.charAt(i));
        }

        for (int i = e + 1; i < my_string.length(); i++) {
            sb.append(my_string.charAt(i));
        }

        return sb.toString();
    }
}
