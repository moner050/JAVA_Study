package programmers.lv0;

import java.util.Arrays;

// 배열 두 배 만들기
// https://school.programmers.co.kr/learn/courses/30/lessons/120809
public class DoubleArray_120809 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        System.out.println(Arrays.toString(solution(numbers)));
    }

    public static int[] solution(int[] numbers) {
        return Arrays.stream(numbers).map(i -> i * 2).toArray();
    }
}
