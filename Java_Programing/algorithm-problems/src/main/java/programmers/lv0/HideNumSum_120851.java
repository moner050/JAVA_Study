package programmers.lv0;

import java.util.Arrays;

// 숨어있는 숫자의 덧셈 1
// https://school.programmers.co.kr/learn/courses/30/lessons/120851
public class HideNumSum_120851 {
    public static void main(String[] args) {
//        String my_string = "aAb1B2cC34oOp";
        String my_string = "1a2b3c4d123";

        System.out.println(solution(my_string));
    }

    public static int solution(String my_string) {
        my_string = my_string.replaceAll("[a-zA-Z]", "");
        return Arrays.stream(my_string.split("")).mapToInt(Integer::parseInt).sum();
    }
}
