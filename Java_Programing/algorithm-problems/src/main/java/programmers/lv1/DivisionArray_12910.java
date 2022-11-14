package programmers.lv1;

import java.util.Arrays;

// https://school.programmers.co.kr/learn/courses/30/lessons/12910
public class DivisionArray_12910 {
    public static void main(String[] args) {
//        int[] arr = {5, 9, 7, 10};
//        int divisor = 5;
        int[] arr = {3,2,6};
        int divisor = 10;
        for (int num : solution(arr, divisor)) {
            System.out.print(num + " ");
        }
    }

    public static int[] solution(int[] arr, int divisor) {
        int[] answer = Arrays.stream(arr).filter(i -> i % divisor == 0).sorted().toArray();
        return answer.length == 0 ? new int[]{-1} : answer;
    }
}
