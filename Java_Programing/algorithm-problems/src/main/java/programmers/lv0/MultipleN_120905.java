package programmers.lv0;

import java.util.Arrays;

// N의 배수 고르기
// https://school.programmers.co.kr/learn/courses/30/lessons/120905
public class MultipleN_120905 {
    public static void main(String[] args) {
        int n = 3;
        int[] numlist = {4, 5, 6, 7, 8, 9, 10, 11, 12};

        System.out.println(Arrays.toString(solution(n, numlist)));
    }

    public static int[] solution(int n, int[] numlist) {
        return Arrays.stream(numlist).filter(i -> i % n == 0)
                .toArray();
    }
}
