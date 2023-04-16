package programmers.lv0;

import java.util.Arrays;

// 배열의 길이에 따라 다른 연산하기
// https://school.programmers.co.kr/learn/courses/30/lessons/181854
public class CalculatingArrLength_181854 {
    public static void main(String[] args) {
        int[] arr = {49, 12, 100, 276, 33};
        int n = 27;

        System.out.println(Arrays.toString(solution(arr, n)));
    }

    public static int[] solution(int[] arr, int n) {
        if(arr.length % 2 == 0) {
            for (int i = 2; i <= arr.length; i+=2) {
                arr[i - 1] = arr[i - 1] + n;
            }
        }
        else {
            for (int i = 1; i <= arr.length; i+=2) {
                arr[i - 1] = arr[i - 1] + n;
            }
        }

        return arr;
    }
}
