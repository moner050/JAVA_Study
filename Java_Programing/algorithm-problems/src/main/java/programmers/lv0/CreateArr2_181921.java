package programmers.lv0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

// 배열 만들기 2
// https://school.programmers.co.kr/learn/courses/30/lessons/181921
public class CreateArr2_181921 {
    public static void main(String[] args) {
        int l = 5, r = 555;

        System.out.println(Arrays.toString(solution(l, r)));
    }

    public static int[] solution(int l, int r) {
        List<Integer> result = new ArrayList<>();

        for (int i = l; i <= r; i++) {
            if(checkNum(i)) result.add(i);
        }

        if(result.isEmpty()) return new int[]{-1};
        else return result.stream().sorted().mapToInt(Integer::intValue).toArray();
    }

    public static boolean checkNum(int num) {
        String regex = "[5,0]+";
        return Pattern.matches(regex, String.valueOf(num));
    }
}
