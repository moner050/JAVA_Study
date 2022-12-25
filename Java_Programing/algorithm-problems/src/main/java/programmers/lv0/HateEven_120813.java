package programmers.lv0;

import java.util.Arrays;
import java.util.stream.IntStream;

// 짝수는 싫어요
// https://school.programmers.co.kr/learn/courses/30/lessons/120813
public class HateEven_120813 {
    public static void main(String[] args) {
        int n = 15;

        System.out.println(Arrays.toString(solution(n)));
    }

    public static int[] solution(int n) {
        return IntStream.range(1, n + 1)
                .filter(i -> i % 2 == 1)
                .toArray();
    }
}
