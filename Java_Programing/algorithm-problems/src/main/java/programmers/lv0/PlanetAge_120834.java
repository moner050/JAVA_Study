package programmers.lv0;

import java.util.stream.Collectors;

// 외계행성의 나이
// https://school.programmers.co.kr/learn/courses/30/lessons/120834
public class PlanetAge_120834 {
    public static void main(String[] args) {
        int age = 23;
        System.out.println(solution1(age));
        System.out.println(solution2(age));
    }

    public static String solution1(int age) {
        StringBuilder sb = new StringBuilder();

        for (char c : String.valueOf(age).toCharArray()) {
            sb.append((char)(c + 49));
        }

        return sb.toString();
    }

    public static String solution2(int age) {
        return String.valueOf(age).chars().mapToObj(operand -> String.valueOf((char) (operand + 49))).collect(Collectors.joining());
    }
}
