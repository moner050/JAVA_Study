package programmers.lv1;

import java.util.HashMap;

// https://school.programmers.co.kr/learn/courses/30/lessons/81301
public class NumStringAndWord_81301 {
    public static void main(String[] args) {
//        String s = "one4seveneight";
//        String s = "23four5six7";
//        String s = "2three45sixseven";
        String s = "123";

        System.out.println(solution(s));
//        System.out.println(s.replace("one", "1"));
    }

    public static int solution(String s) {
        HashMap<Integer, String> text = new HashMap<>();

        text.put(0, "zero");
        text.put(1, "one");
        text.put(2, "two");
        text.put(3, "three");
        text.put(4, "four");
        text.put(5, "five");
        text.put(6, "six");
        text.put(7, "seven");
        text.put(8, "eight");
        text.put(9, "nine");

        for (int i = 0; i < 10; i++) {
            s = s.replace(text.get(i), String.valueOf(i));
        }

        return Integer.parseInt(s);
    }
}
