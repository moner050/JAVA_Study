package programmers.lv1;

import java.util.Arrays;

// https://school.programmers.co.kr/learn/courses/30/lessons/86051
public class NonNumberSum_86051 {
    public static void main(String[] args) {
//        int[] numbers = {1,2,3,4,6,7,8,0};
        int[] numbers = {5,8,4,0,6,7,9};
        System.out.println(solution1(numbers));
        System.out.println(solution2(numbers));
    }

    public static int solution1(int[] numbers) {
        int answer = 0;
        boolean[] numberCheck = new boolean[10];

        for (int num : numbers) {
            numberCheck[num] = true;
        }

        for (int i = 0; i < numberCheck.length; i++) {
            if(!numberCheck[i]) answer += i;
        }
        return answer;
    }

    public static int solution2(int[] numbers) {
        return 45 - Arrays.stream(numbers).sum();
    }
}
