package programmers.lv0;

// 문자열 곱하기
// https://school.programmers.co.kr/learn/courses/30/lessons/181940
public class MultiplicationString_181940 {
    public static void main(String[] args) {
        String my_string = "string";
        int k = 3;

        System.out.println(solution(my_string, k));
    }

    public static String solution(String my_string, int k) {
        return my_string.repeat(k);
    }
}
