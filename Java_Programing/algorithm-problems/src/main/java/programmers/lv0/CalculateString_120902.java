package programmers.lv0;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// 문자열 계산하기
// https://school.programmers.co.kr/learn/courses/30/lessons/120902
public class CalculateString_120902 {
    public static void main(String[] args) {
        String my_string = "3 + 4";

        System.out.println(solution1(my_string));
        System.out.println(solution2(my_string));
    }

    public static int solution1(String my_string) {
        int idx = 1;
        my_string = my_string.replaceAll(" ", "");
        List<Integer> numList = Arrays.stream(my_string.split("[^0-9]")).mapToInt(Integer::parseInt).boxed().collect(Collectors.toList());
        List<String> signList = Arrays.stream(my_string.replaceAll("[0-9]", "").split("")).collect(Collectors.toList());

        int resultNum = numList.get(0);
        for (String s : signList) {
            switch (s) {
                case "+" :
                    resultNum += numList.get(idx++);
                    break;
                case "-" :
                    resultNum -= numList.get(idx++);
                    break;
            }
        }

        return resultNum;
    }

    public static int solution2(String my_string) {
        return Arrays.stream(my_string.replaceAll("- ", "-")
                        .replaceAll("[+] ", "")
                        .trim()
                        .split(" "))
                .mapToInt(Integer::parseInt)
                .sum();
    }
}
