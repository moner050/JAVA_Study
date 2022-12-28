package programmers.lv0;

// 피자 나눠 먹기 2
// https://school.programmers.co.kr/learn/courses/30/lessons/120815
public class SharePizza_120815 {
    public static void main(String[] args) {
//        int n = 6;
        int n = 10;

        System.out.println(solution1(n));
        System.out.println(solution2(n));
    }

    public static int solution1(int n) {
        int result = 1;

        while ((result * 6) % n != 0) {
            result++;
        }

        return result;
    }

    public static int solution2(int n) {
        return LCM(n, 6) / 6;
    }

    public static int GCD(int num1, int num2) {
        if(num1 % num2 == 0) return num2;
        return GCD(num2, num1 % num2);
    }

    public static int LCM(int num1, int num2) {
        return num1 * num2 / GCD(num1, num2);
    }
}
