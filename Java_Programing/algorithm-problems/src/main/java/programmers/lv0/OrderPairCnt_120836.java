package programmers.lv0;

import java.util.stream.IntStream;

// 순서쌍의 개수
// https://school.programmers.co.kr/learn/courses/30/lessons/120836
public class OrderPairCnt_120836 {
    public static void main(String[] args) {
//        int n = 20;
        int n = 100;

        System.out.println(solution1(n));
        System.out.println(solution2(n));
    }

    public static int solution1(int n) {
        int result = 0;

        for (int i = 1; i <= n; i++) {
            if(n % i == 0) result++;
        }

        return result;
    }

    public static int solution2(int n) {
        return (int) IntStream.rangeClosed(1, n)
                .filter(i -> n % i == 0)
                .count();
    }
}
