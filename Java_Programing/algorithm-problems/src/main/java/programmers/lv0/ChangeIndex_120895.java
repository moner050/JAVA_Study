package programmers.lv0;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

// 인덱스 바꾸기
// https://school.programmers.co.kr/learn/courses/30/lessons/120895
public class ChangeIndex_120895 {
    public static void main(String[] args) {
//        String my_string = "hello";
//        int num1 = 1, num2 = 2;
        String my_string = "I love you";
        int num1 = 3, num2 = 6;

        System.out.println(solution1(my_string, num1, num2));
        System.out.println(solution2(my_string, num1, num2));
    }

    public static String solution1(String my_string, int num1, int num2) {
        List<String> str = Arrays.stream(my_string.split("")).collect(Collectors.toList());
        String[] temp = {str.get(num1), str.get(num2)};

        str.remove(num1);
        str.add(num1, temp[1]);

        str.remove(num2);
        str.add(num2, temp[0]);

        return String.join("", str);
    }

    public static String solution2(String my_string, int num1, int num2) {
        List<String> str = Arrays.stream(my_string.split("")).collect(Collectors.toList());

        Collections.swap(str, num1, num2);

        return String.join("", str);
    }
}
