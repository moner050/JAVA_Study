package programmers.lv0;

import java.util.Arrays;

// n개 간격의 원소들
// https://school.programmers.co.kr/learn/courses/30/lessons/181888
public class NIntervalElements_181888 {
    public static void main(String[] args) {
        int[] num_list = {4, 2, 6, 1, 7, 6};
        int n = 2;

        System.out.println(Arrays.toString(solution(num_list, n)));
    }

    public static int[] solution(int[] num_list, int n) {
        int[] result = new int[(num_list.length / n) + (num_list.length % n > 0 ? 1 : 0)];

        for (int i = 0, idx = 0; i < num_list.length; i+=n, idx++) {
            result[idx] = num_list[i];
        }

        return result;
    }
}
