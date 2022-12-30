package programmers.lv0;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// 한 번만 등장한 문자
// https://school.programmers.co.kr/learn/courses/30/lessons/120896
public class OneTimeString_120896 {
    public static void main(String[] args) {
        String s = "abcabcadc";

        System.out.println(solution1(s));
        System.out.println(solution2(s));
    }

    public static String solution1(String s) {
        StringBuilder sb = new StringBuilder();

        List<String> stringList = Arrays.stream(s.split("")).distinct().sorted().collect(Collectors.toList());

        int[] cnt = new int[stringList.size()];

        for(String str : s.split("")) {
            cnt[stringList.indexOf(str)]++;
        }

        for (int i = 0; i < cnt.length; i++) {
            if(cnt[i] == 1) sb.append(stringList.get(i));
        }

        return sb.toString();
    }

    public static String solution2(String s) {
        return Arrays.stream(s.split(""))
                .collect(Collectors.groupingBy(s1 -> s1))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue().size() <= 1)
                .map(Map.Entry::getKey)
                .sorted()
                .collect(Collectors.joining());
    }
}
