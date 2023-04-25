package programmers.lv0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 리스트 자르기
// https://school.programmers.co.kr/learn/courses/30/lessons/181897
public class SliceList_181897 {
    public static void main(String[] args) {
        int n = 3;
        int[] slicer = {1, 5, 2}, num_list = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        System.out.println(Arrays.toString(solution(n, slicer, num_list)));
    }

    public static int[] solution(int n, int[] slicer, int[] num_list) {
        List<Integer> result = new ArrayList<>();

        if(n == 1) {
            for (int i = 0; i <= slicer[1]; i++) {
                result.add(num_list[i]);
            }
        }
        else if(n == 2) {
            for (int i = slicer[0]; i < num_list.length; i++) {
                result.add(num_list[i]);
            }
        }
        else if(n == 3) {
            for (int i = slicer[0]; i <= slicer[1]; i++) {
                result.add(num_list[i]);
            }
        }
        else if(n == 4) {
            for (int i = slicer[0]; i <= slicer[1]; i += slicer[2]) {
                result.add(num_list[i]);
            }
        }

        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
