package programmers.lv2;

import java.util.Arrays;

// N개의 최소공배수
// https://school.programmers.co.kr/learn/courses/30/lessons/12953
public class LeastCommonMultiple_12953 {
    public static void main(String[] args) {
        int[] arr = {2,6,8,14};
//        int[] arr = {1, 2, 3};
//        int[] arr = {100, 101};
        System.out.println(solution(arr));
    }

    public static int solution(int[] arr) {
        Arrays.sort(arr);

        int result = arr[0];
        for (int i = 1; i < arr.length; i++) {
            result = lcm(result, arr[i]);
        }

        return result;
    }

    public static int gcd(int num1, int num2) {
        if(num2 == 0) return num1;
        else return gcd(num2, num1 % num2);
    }

    public static int lcm(int num1, int num2) {
        return (num1 * num2) / gcd(num1, num2);
    }
}
