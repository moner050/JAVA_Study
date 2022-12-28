package programmers.lv0;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// 숫자 찾기
// https://school.programmers.co.kr/learn/courses/30/lessons/120904
public class FindNum_120904 {
    public static void main(String[] args) {
//        int num = 29183, k = 1;
//        int num = 232443, k = 4;
        int num = 123456, k = 7;

        System.out.println(solution1(num, k));
        System.out.println(solution2(num, k));
    }

    public static int solution1(int num, int k) {
        List<String> list = Arrays.stream(String.valueOf(num).split("")).collect(Collectors.toList());

        return !list.contains(String.valueOf(k)) ? -1 : list.indexOf(String.valueOf(k)) + 1;
    }

    public static int solution2(int num, int k) {
        return ("-" + num).indexOf(String.valueOf(k));
    }
}
