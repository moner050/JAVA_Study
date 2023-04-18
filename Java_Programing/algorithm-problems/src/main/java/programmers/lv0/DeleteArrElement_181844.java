package programmers.lv0;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

// 배열의 원소 삭제하기
// https://school.programmers.co.kr/learn/courses/30/lessons/181844
public class DeleteArrElement_181844 {
    public static void main(String[] args) {
        int[] arr = {293, 1000, 395, 678, 94}, delete_list = {94, 777, 104, 1000, 1, 12};

        System.out.println(Arrays.toString(solution(arr, delete_list)));
    }

    public static int[] solution(int[] arr, int[] delete_list) {
        List<Integer> result = new LinkedList<>();

        for (int n : arr) {
            result.add(n);
        }

        for (int del : delete_list) {
            if(result.contains(del)) result.remove(result.indexOf(del));
        }

        return result.stream().mapToInt(Integer::intValue).toArray();

    }
}
