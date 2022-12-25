package programmers.lv0;

import java.util.Arrays;

// 최대값 만들기
// https://school.programmers.co.kr/learn/courses/30/lessons/120847
public class MaxValue_120847 {
    public static void main(String[] args) {
//        int[] numbers = {1, 2, 3, 4, 5};
        int[] numbers = {0, 31, 24, 10, 1, 9};

        System.out.println(solution(numbers));
    }

    public static int solution(int[] numbers) {
        Arrays.sort(numbers);
        return numbers[numbers.length-1] * numbers[numbers.length-2];
    }
}
