package programmers.lv1;

import java.util.Arrays;

// https://school.programmers.co.kr/learn/courses/30/lessons/12933
public class Descending_12933 {
    public static void main(String[] args) {
        long n = 118372L;
        System.out.println(solution(n));
    }

    public static long solution(long n) {
        StringBuilder sb = new StringBuilder();
        String[] arr = String.valueOf(n).split("");

        long[] numArr = Arrays.stream(arr).mapToLong(Long::parseLong).sorted().toArray();

        for (int i = numArr.length - 1; i >= 0; i--) {
            sb.append(numArr[i]);
        }

        return Long.parseLong(sb.toString());
    }
}
