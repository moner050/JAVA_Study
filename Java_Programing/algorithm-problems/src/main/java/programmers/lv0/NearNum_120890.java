package programmers.lv0;

import java.util.Arrays;

// 가까운 수
// https://school.programmers.co.kr/learn/courses/30/lessons/120890
public class NearNum_120890 {
    public static void main(String[] args) {
        int[] array = {3, 10, 28};
        int n = 20;

        System.out.println(solution(array, n));
    }

    public static int solution(int[] array, int n) {
        int near = Integer.MAX_VALUE;
        Arrays.sort(array);

        for (int num : array) {
            if(Math.abs(n - num) < Math.abs(n - near)) near = num;
        }
        return near;
    }

}
