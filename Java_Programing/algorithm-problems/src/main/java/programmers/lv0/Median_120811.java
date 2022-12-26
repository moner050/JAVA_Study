package programmers.lv0;

import java.util.Arrays;

// 중앙값
// https://school.programmers.co.kr/learn/courses/30/lessons/120811
public class Median_120811 {
    public static void main(String[] args) {
//        int[] array = {1, 2, 7, 10, 11};
        int[] array = {9, -1, 0};

        System.out.println(solution(array));
    }

    public static int solution(int[] array) {
        Arrays.sort(array);
        return array[array.length / 2];
    }
}
