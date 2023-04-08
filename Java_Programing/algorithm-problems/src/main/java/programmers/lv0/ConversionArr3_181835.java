package programmers.lv0;

import java.util.Arrays;

// 조건에 맞게 수열 변환하기 3
// https://school.programmers.co.kr/learn/courses/30/lessons/181835
public class ConversionArr3_181835 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 100, 99, 98};
        int k = 3;

        System.out.println(Arrays.toString(solution(arr, k)));
    }

    public static int[] solution(int[] arr, int k) {
        int[] result = new int[arr.length];

        if(k % 2 == 0) {
            for (int i = 0; i < arr.length; i++) {
                result[i] = arr[i] + k;
            }
        }
        else {
            for (int i = 0; i < arr.length; i++) {
                result[i] = arr[i] * k;
            }
        }

        return result;
    }
}
