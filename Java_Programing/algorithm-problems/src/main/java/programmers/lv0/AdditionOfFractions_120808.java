package programmers.lv0;

import java.util.Arrays;

// 분수의 덧셈
// https://school.programmers.co.kr/learn/courses/30/lessons/120808
public class AdditionOfFractions_120808 {
    public static void main(String[] args) {
        int denum1 = 1, num1 = 2, denum2 = 3, num2 = 4;

        System.out.println(Arrays.toString(solution(denum1, num1, denum2, num2)));
    }

    public static int[] solution(int denum1, int num1, int denum2, int num2) {
        int denum = (denum1 * num2) + (denum2 * num1);
        int num = (num1 * num2);

        int gcd = GCD(denum, num);

        return new int[] {denum / gcd, num / gcd};
    }

    public static int GCD(int num1, int num2) {
        if(num1 % num2 == 0) return num2;
        else return GCD(num2, num1 % num2);
    }
}
