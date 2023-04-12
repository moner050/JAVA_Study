package programmers.lv0;

import java.util.Arrays;

// 뒤에서 5등 위로
// https://school.programmers.co.kr/learn/courses/30/lessons/181852
public class FivethPlaceFromTheBack_181852 {
    public static void main(String[] args) {
        int[] num_list = {12, 4, 15, 46, 38, 1, 14, 56, 32, 10};

        System.out.println(Arrays.toString(solution(num_list)));
    }

    public static int[] solution(int[] num_list) {
        int[] result = new int[num_list.length - 5];
        Arrays.sort(num_list);

        for (int i = 5; i < num_list.length; i++) {
            result[i-5] = num_list[i];
        }
        return result;
    }
}
