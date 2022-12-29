package programmers.lv0;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// A로 B 만들기
// https://school.programmers.co.kr/learn/courses/30/lessons/120886
public class MakeBUsingA_120886 {
    public static void main(String[] args) {
//        String before = "olleh", after = "hello";
        String before = "allpe", after = "apple";

        System.out.println(solution(before, after));
    }

    public static int solution(String before, String after) {
        List<String> afterList = Arrays.stream(after.split("")).collect(Collectors.toList());

        for (String b : before.split("")) {
            afterList.remove(b);
        }

        return afterList.isEmpty() ? 1 : 0;
    }
}
