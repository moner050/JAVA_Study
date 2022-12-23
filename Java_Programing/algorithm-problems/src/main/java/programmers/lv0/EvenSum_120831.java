package programmers.lv0;

import java.util.stream.IntStream;

// 짝수의 합
// https://school.programmers.co.kr/learn/courses/30/lessons/120831
public class EvenSum_120831 {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(solution1(n));
        System.out.println(solution2(n));
    }

    public static int solution1(int n) {
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) answer += i;
        }
        return answer;
    }

    public static int solution2(int n) {
        return IntStream.rangeClosed(0, n)
                .filter(i -> i % 2 == 0)
                .sum();
    }
}
