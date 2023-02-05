package programmers.lv2;

import java.util.ArrayList;
import java.util.Arrays;

// n^2 배열 자르기
// https://school.programmers.co.kr/learn/courses/30/lessons/87390
public class CutArray_87390 {
    public static void main(String[] args) {
        int n = 3;
        long left = 2, right = 5;
//        int n = 4;
//        long left = 7, right = 14;

        System.out.println(Arrays.toString(solution(n, left, right)));
    }

// 시간초과
/*    public static int[] solution(int n, long left, long right) {
        int idx = 0;
        int[] result = new int[(int)(right - left) + 1];
        int[] arr = new int[n * n];

        for (long i = 1; i <= n; i++) {
            for (long j = 0; j < i; j++) {
                arr[idx++] = (int)i;
            }
            for (long j = i + 1; j <= n; j++) {
                arr[idx++] = (int)j;
            }
        }

        idx = 0;
        for (long i = left; i <= right; i++) {
            result[idx++] = arr[(int)i];
        }

        return result;
    }*/

    public static int[] solution(int n, long left, long right) {
        int[] result = new int[(int)(right - left) + 1];

        for (int i = 0; i < result.length; i++) {
            int x = (int)(left / n + 1);
            int y = (int)(left % n + 1);
            left += 1;
            result[i] = Math.max(x, y);
        }

        return result;
    }
}
