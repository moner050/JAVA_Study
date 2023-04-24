package programmers.lv0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 세 개의 구분자
// https://school.programmers.co.kr/learn/courses/30/lessons/181862
public class ThreeDelimiter_181862 {
    public static void main(String[] args) {
//        String myStr = "baconlettucetomato";
        String myStr = "abcd";

        System.out.println(Arrays.toString(solution(myStr)));
    }

    public static String[] solution(String myStr) {
        String[] temp = myStr.split("[a-c]");
        List<String> result = new ArrayList<>();

        for (String s : temp) {
            if (!s.equals("")) result.add(s);
        }

        if(result.isEmpty()) result.add("EMPTY");

        return result.toArray(String[]::new);
    }
}
