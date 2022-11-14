package programmers.lv1;

import java.util.Arrays;

// https://school.programmers.co.kr/learn/courses/30/lessons/12935
public class RemoveMinNum_12935 {
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 1};
//        int[] arr = {10};
        for (int num : solution(arr)) {
            System.out.print(num + " ");
        }
    }


    public static int[] solution(int[] arr) {
        if(arr.length <= 1) return new int[] {-1};

        int min = Arrays.stream(arr).min().getAsInt();

        return Arrays.stream(arr).filter(i -> i != min).toArray();
    }
}
