package programmers.lv0;

import java.util.Arrays;

// 배열 원소의 길이
// https://school.programmers.co.kr/learn/courses/30/lessons/120854
public class ArrayElementLength_120854 {
    public static void main(String[] args) {
        String[] strlist = {"We", "are", "the", "world!"};

        System.out.println(Arrays.toString(solution(strlist)));
    }

    public static int[] solution(String[] strlist) {
        return Arrays.stream(strlist).mapToInt(String::length).toArray();
    }
}
