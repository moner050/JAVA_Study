package programmers.lv0;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// 가장 큰 수 찾기
// https://school.programmers.co.kr/learn/courses/30/lessons/120899
public class MaxValue_120899 {
    public static void main(String[] args) {
        int[] array = {1, 8, 3};

        System.out.println(Arrays.toString(solution1(array)));
        System.out.println(Arrays.toString(solution2(array)));
    }

    public static int[] solution1(int[] array) {
        int idx = 0;
        int max = Arrays.stream(array).max().orElse(0);
        for (int i = 0; i < array.length; i++) {
            if(array[i] == max) idx = i;
        }
        return new int[] {max, idx};
    }

    public static int[] solution2(int[] array) {
        List<Integer> list = Arrays.stream(array).boxed().collect(Collectors.toList());

        int max = list.stream().max(Integer::compareTo).orElse(0);
        int idx = list.indexOf(max);

        return new int[] {max, idx};
    }
}
