package programmers.lv0;

import java.util.Arrays;

// 배열 자르기
// https://school.programmers.co.kr/learn/courses/30/lessons/120833
public class ArraySlice_120833 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int num1 = 1, num2 = 3;

        System.out.println(Arrays.toString(solution1(numbers, num1, num2)));
        System.out.println(Arrays.toString(solution2(numbers, num1, num2)));
    }

    public static int[] solution1(int[] numbers, int num1, int num2) {
        int max = num2 - num1 + 1;
        int[] result = new int[max];
        for (int i = 0; i < max; i++) {
            result[i] = numbers[num1++];
        }

        return result;
    }

    public static int[] solution2(int[] numbers, int num1, int num2) {
        return Arrays.copyOfRange(numbers, num1, num2 + 1);
    }
}
