package programmers.lv0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 빈 배열에 추가, 삭제하기
// https://school.programmers.co.kr/learn/courses/30/lessons/181860
public class AddRemoveAtArr_181860 {
    public static void main(String[] args) {
        int[] arr = {3, 2, 4, 1, 3};
        boolean[] flag = {true, false, true, false, false};

        System.out.println(Arrays.toString(solution(arr, flag)));
    }

    public static int[] solution(int[] arr, boolean[] flag) {
        List<Integer> x = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if(flag[i]) {
                for (int j = 0; j < arr[i]*2; j++) {
                    x.add(arr[i]);
                }
            }
            else {
                for (int j = 0; j < arr[i]; j++) {
                    x.remove(x.size() - 1);
                }
            }
        }

        return x.stream().mapToInt(Integer::intValue).toArray();
    }
}
