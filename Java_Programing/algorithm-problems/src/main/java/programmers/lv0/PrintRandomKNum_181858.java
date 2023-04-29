package programmers.lv0;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// 무작위로 K개의 수 뽑기
// https://school.programmers.co.kr/learn/courses/30/lessons/181858
public class PrintRandomKNum_181858 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 1, 2, 2, 3};
//        int[] arr = {0, 1, 1, 1, 1};
        int k = 3;
//        int k = 4;

        System.out.println(Arrays.toString(solution(arr, k)));
    }

    public static int[] solution(int[] arr, int k) {
        int[] result = new int[k];
        List<Integer> list = Arrays.stream(arr).boxed().distinct().collect(Collectors.toList());

        for (int i = 0; i < k; i++) {
            if(list.size() - 1 >= i) result[i] = list.get(i);
            else result[i] = -1;
        }

        return result;
    }
}
