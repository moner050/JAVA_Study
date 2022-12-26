package programmers.lv0;

import java.util.Arrays;

// 자릿수 더하기
// https://school.programmers.co.kr/learn/courses/30/lessons/120906
public class DigitSum_120906 {
    public static void main(String[] args) {
        int n = 1234;

        System.out.println(solution1(n));
        System.out.println(solution2(n));
    }

    public static int solution1(int n) {
        int answer = 0;
        String temp = String.valueOf(n);

        for (char c : temp.toCharArray()) {
            answer += Integer.parseInt(String.valueOf(c));
        }

        return answer;
    }

    public static int solution2(int n) {
        return Arrays.stream(String.valueOf(n).split("")).mapToInt(Integer::parseInt).sum();
    }
}
