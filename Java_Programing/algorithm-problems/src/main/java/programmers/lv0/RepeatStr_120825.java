package programmers.lv0;

// 문자 반복 출력하기
// https://school.programmers.co.kr/learn/courses/30/lessons/120825
public class RepeatStr_120825 {
    public static void main(String[] args) {
        String my_string = "hello";
        int n = 3;

        System.out.println(solution(my_string, n));
    }

    public static String solution(String my_string, int n) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < my_string.length(); i++) {
            String temp = String.valueOf(my_string.charAt(i));
            sb.append(temp.repeat(n));
        }

        return sb.toString();
    }
}
