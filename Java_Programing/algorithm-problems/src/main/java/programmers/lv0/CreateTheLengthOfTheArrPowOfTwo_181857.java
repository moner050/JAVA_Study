package programmers.lv0;

import java.util.Arrays;

// 배열의 길이를 2의 거듭제곱으로 만들기
// https://school.programmers.co.kr/learn/courses/30/lessons/181857
public class CreateTheLengthOfTheArrPowOfTwo_181857 {
    public static void main(String[] args) {
//        int[] arr = {1, 2, 3, 4, 5, 6};
        int[] arr = {1, 2, 3, 4};

        System.out.println(Arrays.toString(solution(arr)));
    }

    public static int[] solution(int[] arr) {
        int length = arr.length, pointLength = 0;

        if(length == 1) return arr;

        // 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024
        for (int i = 1; i <= 10; i++) {
            if(length == Math.pow(2, i)) {
                pointLength = 0;
                break;
            }
            else if(length < Math.pow(2, i)) {
                pointLength = (int) Math.pow(2, i) - length;
                break;
            }
        }

        int[] result = new int[pointLength + length];

        System.arraycopy(arr, 0, result, 0, length);
        if(pointLength > 0) {
            for (int i = length; i < length + pointLength; i++) {
                result[i] = 0;
            }
        }

        return result;
    }
}
