package programmers.lv0;

import java.util.Arrays;

// 공백으로 구분하기 1
// https://school.programmers.co.kr/learn/courses/30/lessons/181869
public class SeparateBySpace_181869 {
    public static void main(String[] args) {
        String my_string = "i love you";

        System.out.println(Arrays.toString(solution(my_string)));
    }

    public static String[] solution(String my_string) {
        return my_string.split(" ");
    }
}
