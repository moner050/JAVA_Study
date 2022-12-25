package programmers.lv0;

import java.util.Arrays;

// 짝수 홀수 개수
// https://school.programmers.co.kr/learn/courses/30/lessons/120824
public class EvenOddCount_120824 {
    public static void main(String[] args) {
//        int[] num_list = {1, 2, 3, 4, 5};
        int[] num_list = {1, 3, 5, 7};
        System.out.println(Arrays.toString(solution(num_list)));
    }

    public static int[] solution(int[] num_list) {
        return new int[] {(int)Arrays.stream(num_list).filter(i -> i % 2 == 0).count(), (int)Arrays.stream(num_list).filter(i -> i % 2 != 0).count()};
    }
}
