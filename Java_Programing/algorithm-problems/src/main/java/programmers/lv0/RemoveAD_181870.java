package programmers.lv0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// ad 제거하기
// https://school.programmers.co.kr/learn/courses/30/lessons/181870
public class RemoveAD_181870 {
    public static void main(String[] args) {
        String[] strArr = {"and","notad","abcd"};

        System.out.println(Arrays.toString(solution(strArr)));
    }

    public static String[] solution(String[] strArr) {
        List<String> result = new ArrayList<>();

        for (String str : strArr) {
            if(!str.contains("ad")) result.add(str);
        }

        return result.toArray(String[]::new);
    }
}
