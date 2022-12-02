package programmers.lv1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

// https://school.programmers.co.kr/learn/courses/30/lessons/12915
public class StringMyself_12915 {
    public static void main(String[] args) {
//        String[] strings = {"sun", "bed", "car"};
//        int n = 1;
        String[] strings = {"abce", "abcd", "cdx"};
        int n = 2;

        System.out.println(Arrays.toString(solution1(strings, n)));
        System.out.println(Arrays.toString(solution2(strings, n)));
        System.out.println(Arrays.toString(solution3(strings, n)));
    }

    public static String[] solution1(String[] strings, int n) {
        String[] result = new String[strings.length];
        List<String> tempArr = Arrays.stream(strings).map(text -> "" + text.charAt(n) + text).sorted().collect(Collectors.toList());

        for (int i = 0; i < tempArr.size(); i++) {
            result[i] = tempArr.get(i).substring(1, tempArr.get(i).length());
        }

        return result;
    }

    public static String[] solution2(String[] strings, int n) {
        Arrays.sort(strings);
        Arrays.sort(strings, Comparator.comparing(text -> text.substring(n, n + 1)));
        return strings;
    }

    public static String[] solution3(String[] strings, int n) {
        Arrays.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                if(s1.charAt(n) > s2.charAt(n)) return 1;
                else if(s1.charAt(n) == s2.charAt(n)) return s1.compareTo(s2);
                else if(s1.charAt(n) < s2.charAt(n)) return -1;
                else return 0;
            }
        });
        return strings;
    }
}
