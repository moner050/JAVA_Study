package programmers.lv0;

import java.util.Arrays;

// 수열과 구간 쿼리 4
// https://school.programmers.co.kr/learn/courses/30/lessons/181922
public class QuerySequencesAndIntervals_181922 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 4, 3};
        int[][] queries = {{0, 4, 1}, {0, 3, 2}, {0, 3, 3}};

        System.out.println(Arrays.toString(solution(arr, queries)));
    }

    public static int[] solution(int[] arr, int[][] queries) {
        for (int[] query : queries) {
            for (int i = query[0]; i <= query[1]; i++) {
                if (i % query[2] == 0) {
                    arr[i]++;
                }
            }
        }

        return arr;
    }
}
