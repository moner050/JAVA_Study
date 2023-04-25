package programmers.lv0;

import java.util.Arrays;

// 수열과 구간 쿼리 2
// https://school.programmers.co.kr/learn/courses/30/lessons/181923
public class QuerySequencesAndIntervals_181923 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 4, 3};
        int[][] queries = {{0, 4, 2}, {0, 3, 2}, {0, 2, 2}};

        System.out.println(Arrays.toString(solution(arr, queries)));
    }

    public static int[] solution(int[] arr, int[][] queries) {
        int[] result = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = queries[i][0]; j <= queries[i][1]; j++) {
                if(arr[j] > queries[i][2] && arr[j] < min) min = arr[j];
            }
            if(min == Integer.MAX_VALUE) min = -1;
            result[i] = min;
        }

        return result;
    }
}
