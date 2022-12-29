package programmers.lv0;

import java.util.Arrays;
import java.util.stream.Collectors;

// 문자열 정렬하기
// https://school.programmers.co.kr/learn/courses/30/lessons/120911
public class SortString_120911 {
    public static void main(String[] args) {
        String my_string = "Bcad";

        System.out.println(solution(my_string));
    }

    public static String solution(String my_string) {
        return Arrays.stream(my_string.toLowerCase().split("")).sorted().collect(Collectors.joining());
    }
}
