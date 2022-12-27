package programmers.lv0;

import java.util.Arrays;
import java.util.stream.Collectors;

// 가위 바위 보
// https://school.programmers.co.kr/learn/courses/30/lessons/120839
public class RockScissorsPaper_120839 {
    public static void main(String[] args) {
//        String rsp = "2";
        String rsp = "205";

        System.out.println(solution1(rsp));
        System.out.println(solution2(rsp));
    }

    public static String solution1(String rsp) {
        StringBuilder sb = new StringBuilder();
        for (char c : rsp.toCharArray()) {
            sb.append(c == '0' ? '5' : c == '2' ? '0' : '2');
        }
        return sb.toString();
    }

    public static String solution2(String rsp) {
        return Arrays.stream(rsp.split("")).map(str -> str.equals("0") ? "5" : str.equals("2") ? "0" : "2")
                .collect(Collectors.joining());
    }
}
