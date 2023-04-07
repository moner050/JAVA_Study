package programmers.lv0;

// 문자열을 정수로 변환하기
// https://school.programmers.co.kr/learn/courses/30/lessons/181848
public class StringToInteger_181848 {
    public static void main(String[] args) {
        String n_str = "8542";

        System.out.println(solution(n_str));
    }

    public static int solution(String n_str) {
        return Integer.parseInt(n_str);
    }
}
