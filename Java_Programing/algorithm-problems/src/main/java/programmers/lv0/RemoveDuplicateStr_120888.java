package programmers.lv0;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// 중복된 문자 제거
// https://school.programmers.co.kr/learn/courses/30/lessons/120888
public class RemoveDuplicateStr_120888 {
    public static void main(String[] args) {
        String my_string = "people";

        System.out.println(solution1(my_string));
        System.out.println(solution2(my_string));
    }

    public static String solution1(String my_string) {
        List<String> strList = new ArrayList<>();

        for (String s : my_string.split("")) {
            if(!strList.contains(s)) strList.add(s);
        }

        return String.join("", strList);
    }

    public static String solution2(String my_string) {
        return my_string.chars()
                .mapToObj(Character::toString)
                .distinct()
                .collect(Collectors.joining());
    }
}
