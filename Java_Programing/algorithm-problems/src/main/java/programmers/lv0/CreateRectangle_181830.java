package programmers.lv0;

import java.util.Arrays;

// 정사각형으로 만들기
// https://school.programmers.co.kr/learn/courses/30/lessons/181830
public class CreateRectangle_181830 {
    public static void main(String[] args) {
//        int[][] arr = {{572, 22, 37}, {287, 726, 384}, {85, 137, 292}, {487, 13, 876}};
        int[][] arr = {{57, 192, 534, 2}, {9, 345, 192, 999}};

        System.out.println(Arrays.deepToString(solution(arr)));
    }

    public static int[][] solution(int[][] arr) {
        int length = arr.length;
        int deepLength = arr[0].length;

        if(length > deepLength) {
            int[][] result = new int[length][length];

            for (int i = 0; i < length; i++) {
                for (int j = 0; j < deepLength; j++) {
                    result[i][j] = arr[i][j];
                }
                for (int j = deepLength; j < length; j++) {
                    result[i][j] = 0;
                }
            }

            return result;
        }
        else if(length < deepLength) {
            int[][] result = new int[deepLength][deepLength];

            for (int i = 0; i < length; i++) {
                System.arraycopy(arr[i], 0, result[i], 0, deepLength);
            }

            return result;
        }
        else return arr;
    }
}
