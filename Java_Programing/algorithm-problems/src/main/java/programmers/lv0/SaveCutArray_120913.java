package programmers.lv0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

// 잘라서 배열로 저장하기
// https://school.programmers.co.kr/learn/courses/30/lessons/120913
public class SaveCutArray_120913 {
    public static void main(String[] args) {
        String my_str = "abc1Addfggg4556b";
        int n = 6;

        System.out.println(Arrays.toString(solution1(my_str, n)));
        System.out.println(Arrays.toString(solution2(my_str, n)));
    }

    public static String[] solution1(String my_str, int n) {
        StringBuilder sb = new StringBuilder();
        List<String> list = new ArrayList<>();

        for (int i = 0; i < my_str.length(); i++) {
            if((i+1) % n == 0) {
                sb.append(my_str.charAt(i));
                list.add(sb.toString());
                sb = new StringBuilder();
            }
            else {
                sb.append(my_str.charAt(i));
            }
        }

        if(sb.length() != 0) {
            list.add(sb.toString());
        }

        return list.toArray(new String[0]);
    }

    public static String[] solution2(String my_str, int n) {
        return IntStream.range(0, my_str.length() / n + (my_str.length() % n > 0 ? 1 : 0))
                .mapToObj(i -> i == my_str.length() / n ? my_str.substring(i * n) : my_str.substring(i * n, (i + 1) * n))
                .toArray(String[]::new);
    }
}
