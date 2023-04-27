package programmers.lv0;

import java.util.Arrays;

// 문자 개수 세기
// https://school.programmers.co.kr/learn/courses/30/lessons/181902
public class CountChar_181902 {
    public static void main(String[] args) {
        String my_string = "Programmers";

        System.out.println(Arrays.toString(solution(my_string)));
    }

    public static int[] solution(String my_string) {
        int[] result = new int[52];

        for (char c : my_string.toCharArray()) {
            if(c >= 'A' && c <= 'Z') result[(int)c - 65]++;
            else if(c >= 'a' && c <= 'z') result[(int)c - 71]++;
        }

        return result;
    }
}
