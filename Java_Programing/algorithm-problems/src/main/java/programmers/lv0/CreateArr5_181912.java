package programmers.lv0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 배열 만들기 5
// https://school.programmers.co.kr/learn/courses/30/lessons/181912
public class CreateArr5_181912 {
    public static void main(String[] args) {
        String[] intStrs = {"0123456789","9876543210","9999999999999"};
        int k = 50000, s = 5, l = 5;

        System.out.println(Arrays.toString(solution(intStrs, k, s, l)));
    }

    public static int[] solution(String[] intStrs, int k, int s, int l) {
        List<Integer> result = new ArrayList<>();

        for (String str : intStrs) {
            int temp = Integer.parseInt(str.substring(s, s + l));

            if(temp > k) result.add(temp);
        }

        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
