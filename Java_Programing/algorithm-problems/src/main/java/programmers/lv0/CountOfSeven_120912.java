package programmers.lv0;

import java.util.Arrays;
import java.util.stream.Collectors;

// 7의 개수
// https://school.programmers.co.kr/learn/courses/30/lessons/120912
public class CountOfSeven_120912 {
    public static void main(String[] args) {
        int[] array = {7, 77, 17};

        System.out.println(solution(array));
    }

    public static int solution(int[] array) {
        return (int) Arrays.stream(array)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining())
                .chars()
                .filter(str -> str == '7')
                .count();
    }
}
