package programmers.lv1;

import java.util.Arrays;

// https://school.programmers.co.kr/learn/courses/30/lessons/12933
public class Descending_12933 {
    public static void main(String[] args) {
        long n = 118372L;
        System.out.println(solution1(n));
        System.out.println(solution2(n));
    }

    public static long solution1(long n) {
        StringBuilder sb = new StringBuilder();
        String[] arr = String.valueOf(n).split("");

        long[] numArr = Arrays.stream(arr).mapToLong(Long::parseLong).sorted().toArray();

        for (int i = numArr.length - 1; i >= 0; i--) {
            sb.append(numArr[i]);
        }

        return Long.parseLong(sb.toString());
    }

    public static long solution2(long n) {
        String[] arr = String.valueOf(n).split("");
        Arrays.sort(arr);

        StringBuilder sb = new StringBuilder();
        for (String s : arr) {
            sb.append(s);
        }

        return Long.parseLong(sb.reverse().toString());
    }
}
