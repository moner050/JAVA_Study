package programmers.lv0;

import java.util.Arrays;

// n 번째 원소부터
// https://school.programmers.co.kr/learn/courses/30/lessons/181892
public class FromNElement_181892 {
    public static void main(String[] args) {
        int[] num_list = {2, 1, 6};
        int n = 3;

        System.out.println(Arrays.toString(solution(num_list, n)));
    }

    public static int[] solution(int[] num_list, int n) {
        int[] result = new int[num_list.length - n + 1];

        for (int i = n - 1, idx = 0; i < num_list.length; i++, idx++) {
            result[idx] = num_list[i];
        }

        return result;
    }
}
