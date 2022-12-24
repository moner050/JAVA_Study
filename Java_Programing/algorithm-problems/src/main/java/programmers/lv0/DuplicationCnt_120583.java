package programmers.lv0;

import java.util.Arrays;

// 중복된 숫자 개수
// https://school.programmers.co.kr/learn/courses/30/lessons/120583
public class DuplicationCnt_120583 {
    public static void main(String[] args) {
        int[] array = {1, 1, 2, 3, 4, 5};
        int n = 1;

        System.out.println(solution(array, n));
    }

    public static int solution(int[] array, int n) {
        return (int) Arrays.stream(array).filter(i -> i == n).count();
    }
}
