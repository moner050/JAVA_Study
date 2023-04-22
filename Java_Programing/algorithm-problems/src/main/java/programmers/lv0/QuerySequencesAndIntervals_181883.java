package programmers.lv0;

import java.util.Arrays;

// 수열과 구간 쿼리 1
// https://school.programmers.co.kr/learn/courses/30/lessons/181883
public class QuerySequencesAndIntervals_181883 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4};
        int[][] queries = {{0, 1}, {1, 2}, {2, 3}};

        System.out.println(Arrays.toString(solution(arr, queries)));
    }

    public static int[] solution(int[] arr, int[][] queries) {
        for (int[] query : queries) {
            for (int i = query[0]; i <= query[1]; i++) {
                arr[i] += 1;
            }
        }

        return arr;
    }
}
