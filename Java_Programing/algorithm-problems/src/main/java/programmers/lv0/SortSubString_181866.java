package programmers.lv0;

import java.util.Arrays;

// 문자열 잘라서 정렬하기
// https://school.programmers.co.kr/learn/courses/30/lessons/181866
public class SortSubString_181866 {
    public static void main(String[] args) {
        String myString = "axbxcxdx";

        System.out.println(Arrays.toString(solution(myString)));
    }

    public static String[] solution(String myString) {
        return Arrays.stream(myString.split("x")).filter(i -> !i.equals(" ")).sorted().toArray(String[]::new);
    }
}
