package programmers.lv0;

import java.util.Arrays;

// 글자 지우기
// https://school.programmers.co.kr/learn/courses/30/lessons/181900
public class RemoveString_181900 {
    public static void main(String[] args) {
        String my_string = "apporoograpemmemprs";
        int[] indices = {1, 16, 6, 15, 0, 10, 11, 3};

        System.out.println(solution(my_string, indices));
    }

    public static String solution(String my_string, int[] indices) {
        int cnt = 0;
        Arrays.sort(indices);
        StringBuilder sb = new StringBuilder(my_string);

        for (int idx : indices) {
            sb.deleteCharAt(idx-cnt);
            cnt++;
        }

        return sb.toString();
    }
}
