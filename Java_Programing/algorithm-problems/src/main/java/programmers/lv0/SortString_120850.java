package programmers.lv0;

import java.util.Arrays;

// 문자열 정렬하기
// https://school.programmers.co.kr/learn/courses/30/lessons/120850
public class SortString_120850 {
    public static void main(String[] args) {
        String my_string = "hi12392";

        System.out.println(Arrays.toString(solution(my_string)));
    }

    public static int[] solution(String my_string) {
        return Arrays.stream(my_string.split("")).filter(str -> str.matches("[0-9]"))
                .mapToInt(Integer::parseInt).sorted().toArray();
    }
}
