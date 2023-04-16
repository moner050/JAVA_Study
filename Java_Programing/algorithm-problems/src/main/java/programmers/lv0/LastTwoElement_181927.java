package programmers.lv0;

import java.util.Arrays;

// 마지막 두 원소
// https://school.programmers.co.kr/learn/courses/30/lessons/181927
public class LastTwoElement_181927 {
    public static void main(String[] args) {
        int[] num_list = {2, 1, 6};

        System.out.println(Arrays.toString(solution(num_list)));
    }

    public static int[] solution(int[] num_list) {
        int length = num_list.length;
        int[] result = new int[length + 1];

        System.arraycopy(num_list, 0, result, 0, length);

        if(num_list[length - 1] > num_list[length - 2]) {
            result[length] = num_list[length - 1] - num_list[length - 2];
        }
        else {
            result[length] = num_list[length - 1] * 2;
        }

        return result;
    }
}
