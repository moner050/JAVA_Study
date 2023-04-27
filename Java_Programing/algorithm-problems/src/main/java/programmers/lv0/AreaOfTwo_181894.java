package programmers.lv0;

import java.util.Arrays;

// 2의 영역
// https://school.programmers.co.kr/learn/courses/30/lessons/181894
public class AreaOfTwo_181894 {
    public static void main(String[] args) {
//        int[] arr = {1, 2, 1, 4, 5, 2, 9};
        int[] arr = {1, 2, 1, 2, 1, 10, 2, 1};

        System.out.println(Arrays.toString(solution(arr)));
    }

    public static int[] solution(int[] arr) {
        int idx1 = -1, idx2 = -1;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 2) {
                idx1 = i;
                break;
            }
        }

        for (int i = arr.length - 1; i >= 0; i--) {
            if(arr[i] == 2) {
                idx2 = i;
                break;
            }
        }

        if(idx1 == -1 && idx2 == -1) return new int[]{-1};
        else {
            if(idx1 == idx2) {
                return new int[]{arr[idx1]};
            }
            else{
                int[] result = new int[idx2 - idx1 + 1];
                for (int i = idx1, idx = 0; i <= idx2; i++, idx++) {
                    result[idx] = arr[i];
                }
                return result;
            }
        }
    }
}
