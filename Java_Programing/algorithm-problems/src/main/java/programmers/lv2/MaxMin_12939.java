package programmers.lv2;

import java.util.Arrays;

// 최댓값과 최솟값
// https://school.programmers.co.kr/learn/courses/30/lessons/12939
public class MaxMin_12939 {
    public static void main(String[] args) {
//        String s = "1 2 3 4";
        String s = "-1 -2 -3 -4";

        System.out.println(solution(s));
    }

    public static String solution(String s) {
        StringBuilder sb = new StringBuilder();

        int max = Arrays.stream(s.split(" ")).mapToInt(Integer::parseInt).max().orElse(0);
        int min = Arrays.stream(s.split(" ")).mapToInt(Integer::parseInt).min().orElse(0);

        return sb.append(min).append(" ").append(max).toString();
    }
}
