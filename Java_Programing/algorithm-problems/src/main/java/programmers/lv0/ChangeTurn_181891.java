package programmers.lv0;

import java.util.Arrays;

// 순서 바꾸기
// https://school.programmers.co.kr/learn/courses/30/lessons/181891
public class ChangeTurn_181891 {
    public static void main(String[] args) {
        int[] num_list = {2, 1, 6};
        int n = 1;

        System.out.println(Arrays.toString(solution(num_list, n)));
    }

    public static int[] solution(int[] num_list, int n) {
        int idx = 0;
        int[] result = new int[num_list.length];

        for (int i = n; i < num_list.length; i++, idx++) {
            result[idx] = num_list[i];
        }

        for (int i = 0; i < n; i++, idx++) {
            result[idx] = num_list[i];
        }

        return result;
    }
}
