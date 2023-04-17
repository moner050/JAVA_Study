package programmers.lv0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 배열의 원소만큼 추가하기
// https://school.programmers.co.kr/learn/courses/30/lessons/181861
public class AddAsMuchAsArrElement_181861 {
    public static void main(String[] args) {
        int[] arr = {5, 1, 4};

        System.out.println(Arrays.toString(solution(arr)));
    }

    public static int[] solution(int[] arr) {
        List<Integer> result = new ArrayList<>();

        for (int element : arr) {
            for (int i = 0; i < element; i++) {
                result.add(element);
            }
        }

        return result.stream().mapToInt(i -> i).toArray();
    }
}
