package programmers.lv0;

import java.util.Arrays;

// 접미사 배열
// https://school.programmers.co.kr/learn/courses/30/lessons/181909
public class SuffixArr_181909 {
    public static void main(String[] args) {
        String my_string = "banana";

        System.out.println(Arrays.toString(solution(my_string)));
    }

    public static String[] solution(String my_string) {
        String[] result = new String[my_string.length()];

        for (int i = 0; i < my_string.length(); i++) {
            result[i] = my_string.substring(i, my_string.length());
        }
        return Arrays.stream(result).sorted().toArray(String[]::new);
    }
}
