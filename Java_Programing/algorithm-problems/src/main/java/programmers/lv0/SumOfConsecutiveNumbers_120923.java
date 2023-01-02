package programmers.lv0;

import java.util.Arrays;

// 연속된 수의 합
// https://school.programmers.co.kr/learn/courses/30/lessons/120923
public class SumOfConsecutiveNumbers_120923 {
    public static void main(String[] args) {
//        int num = 3, total = 12;
//        int num = 5, total = 15;
//        int num = 4, total = 14;
//        int num = 5, total = 5;
        int num = 3, total = 3;

        System.out.println(Arrays.toString(solution(num, total)));
    }

    public static int[] solution(int num, int total) {
        int[] result = new int[num];

        if(num == 1) return new int[] {total};

        int start = (total / num) - (total % num == 0 ? num / 2 : num / 2 - 1);

        for (int i = 0; i < num; i++) {
            result[i] = start + i;
        }

        return result;
    }
}
