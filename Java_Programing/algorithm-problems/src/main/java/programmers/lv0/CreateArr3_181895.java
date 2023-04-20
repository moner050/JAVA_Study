package programmers.lv0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 배열 만들기 3
// https://school.programmers.co.kr/learn/courses/30/lessons/181895
public class CreateArr3_181895 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[][] intervals = {{1, 3}, {0, 4}};

        System.out.println(Arrays.toString(solution(arr, intervals)));
    }

    public static int[] solution(int[] arr, int[][] intervals) {
        List<Integer> result = new ArrayList<>();

        for (int[] interval : intervals) {
            for (int j = interval[0]; j <= interval[1]; j++) {
                result.add(arr[j]);
            }
        }

        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
