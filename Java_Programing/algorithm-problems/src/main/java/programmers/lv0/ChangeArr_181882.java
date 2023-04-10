package programmers.lv0;

import java.util.Arrays;

// 조건에 맞게 수열 변환하기 1
// https://school.programmers.co.kr/learn/courses/30/lessons/181882
public class ChangeArr_181882 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 100, 99, 98};

        System.out.println(Arrays.toString(solution(arr)));
    }

    public static int[] solution(int[] arr) {
        int[] result = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] >= 50 && arr[i] % 2 == 0) result[i] = arr[i] / 2;
            else if(arr[i] <= 50 && arr[i] % 2 == 1) result[i] = arr[i] * 2;
            else result[i] = arr[i];
        }

        return result;
    }
}
