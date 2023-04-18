package programmers.lv0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 콜라츠 수열 만들기
// https://school.programmers.co.kr/learn/courses/30/lessons/181919
public class CreateCollatzSequence_181919 {
    public static void main(String[] args) {
        int n = 10;

        System.out.println(Arrays.toString(solution(n)));
    }

    public static int[] solution(int n) {
        List<Integer> result = new ArrayList<>();

        result.add(n);

        while(n != 1) {
            if(n % 2 == 0) n /= 2;
            else n = (3 * n) + 1;

            result.add(n);
        }

        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
