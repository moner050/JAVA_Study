package programmers.lv0;

import java.util.Arrays;

// n 번째 원소까지
// https://school.programmers.co.kr/learn/courses/30/lessons/181889
public class UpToTheElement_181889 {
    public static void main(String[] args) {
        int[] num_list = {2, 1, 6};
        int n = 1;

        System.out.println(Arrays.toString(solution1(num_list, n)));
        System.out.println(Arrays.toString(solution2(num_list, n)));
    }

    public static int[] solution1(int[] num_list, int n) {
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            result[i] = num_list[i];
        }

        return result;
    }

    public static int[] solution2(int[] num_list, int n) {
        int[] result = {};

        result = Arrays.copyOfRange(num_list, 0, n);

        return result;
    }
}
