package programmers.lv0;

import java.util.stream.IntStream;

// 합성수 찾기
// https://school.programmers.co.kr/learn/courses/30/lessons/120846
public class CompositeNumber_120846 {
    public static void main(String[] args) {
        int n = 10;

        System.out.println(solution1(n));
        System.out.println(solution2(n));
    }

    public static int solution1(int n) {
        int cnt = 0;
        for (int i = 1; i <= n; i++) {
            if(isCompositeNum(i)) cnt++;
        }

        return cnt;
    }

    public static boolean isCompositeNum(int n) {
        int chk = 0;
        for (int i = 1; i <= n; i++) {
            if(n % i == 0) chk++;
            if(chk >= 3) return true;
        }
        return false;
    }

    public static int solution2(int n) {
        return (int) IntStream.rangeClosed(1, n)
                .filter(num1 -> IntStream.rangeClosed(1, num1).filter(num2 -> num1 % num2 == 0).count() > 2)
                .count();
    }
}
