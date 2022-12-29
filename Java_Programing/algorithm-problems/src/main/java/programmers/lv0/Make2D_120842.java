package programmers.lv0;

import java.util.Arrays;

// 2차원으로 만들기
// https://school.programmers.co.kr/learn/courses/30/lessons/120842
public class Make2D_120842 {
    public static void main(String[] args) {
        int[] num_list = {1, 2, 3, 4, 5, 6, 7, 8};
        int n = 2;

        System.out.println(Arrays.toString(solution1(num_list, n)));
        System.out.println(Arrays.toString(solution2(num_list, n)));
    }

    public static int[][] solution1(int[] num_list, int n) {
        int xIdx = 0, yIdx = 0;
        int[][] result = new int[num_list.length / n][n];

        for (int num : num_list) {
            if(yIdx >= n) {
                xIdx++;
                yIdx = 0;
            }
            result[xIdx][yIdx++] = num;
        }

        return result;
    }

    public static int[][] solution2(int[] num_list, int n) {
        int[][] result = new int[num_list.length / n][n];

        for (int i = 0; i < num_list.length; i++) {
            result[i/n][i%n] = num_list[i];
        }

        return result;
    }
}
