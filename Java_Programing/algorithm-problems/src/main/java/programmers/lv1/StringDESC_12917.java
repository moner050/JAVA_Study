package programmers.lv1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// https://school.programmers.co.kr/learn/courses/30/lessons/12917
public class StringDESC_12917 {
    public static void main(String[] args) {
        String s = "Zbcdefg";
        System.out.println(solution1(s));
        System.out.println(solution2(s));
    }

    public static String solution1(String s) {
        String[] arr = s.split("");
        Arrays.sort(arr, Collections.reverseOrder());
        return String.join("", arr);
    }

    public static String solution2(String s) {
        return Stream.of(s.split(""))
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.joining());
    }
}
