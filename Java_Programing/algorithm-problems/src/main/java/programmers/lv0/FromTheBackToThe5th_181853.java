package programmers.lv0;

import java.util.Arrays;

// 뒤에서 5등까지
// https://school.programmers.co.kr/learn/courses/30/lessons/181853
public class FromTheBackToThe5th_181853 {
    public static void main(String[] args) {
        int[] num_list = {12, 4, 15, 46, 38, 1, 14};

        System.out.println(Arrays.toString(solution(num_list)));
    }

    public static int[] solution(int[] num_list) {
        int[] sort_num_list = Arrays.stream(num_list).sorted().toArray();
        int[] result = new int[5];

        System.arraycopy(sort_num_list, 0, result, 0, 5);

        return result;
    }
}
