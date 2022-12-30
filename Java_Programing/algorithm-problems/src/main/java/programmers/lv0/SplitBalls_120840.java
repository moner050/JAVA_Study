package programmers.lv0;

import java.math.BigInteger;

// 구슬을 나누는 경우의 수
// https://school.programmers.co.kr/learn/courses/30/lessons/120840
public class SplitBalls_120840 {
    public static void main(String[] args) {
//        int balls = 3, share = 2;
        int balls = 5, share = 3;
//        int balls = 30, share = 30;

        System.out.println(solution1(balls, share));
        System.out.println(solution2(balls, share));
    }

    public static int solution1(int balls, int share) {
        BigInteger num1 = BigInteger.ONE, num2 = BigInteger.ONE;

        long result1 = Math.max(balls - share, share);
        long result2 = Math.min(balls - share, share);

        for(long i = result1 + 1; i <= balls; i++) {
            num1 = num1.multiply(BigInteger.valueOf(i));
        }
        for(long i = 2L; i <= result2; i++) {
            num2 = num2.multiply(BigInteger.valueOf(i));
        }

        return num1.divide(num2).intValue();
    }

    public static long solution2(int balls, int share) {
        share = Math.min(balls - share, share);

        if (share == 0)
            return 1;

        long result = solution2(balls - 1, share - 1);
        result *= balls;
        result /= share;

        return result;
    }
}
