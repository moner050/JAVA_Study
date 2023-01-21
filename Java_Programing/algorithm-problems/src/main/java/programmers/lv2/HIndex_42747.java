package programmers.lv2;

import java.util.Arrays;

// H-Index
// https://school.programmers.co.kr/learn/courses/30/lessons/42747
public class HIndex_42747 {
    public static void main(String[] args) {
        int[] citations = {3, 0, 6, 1, 5};

        System.out.println(solution1(citations));
        System.out.println(solution2(citations));
    }

    public static int solution1(int[] citations) {
        int index = 0;
        int[] arr = new int[citations.length];
        Arrays.sort(citations);

        for (int i = citations.length - 1; i >= 0; i--) {
            arr[index++] = citations[i];
        }

        index = 0;
        for (int i = 0; i < citations.length; i++) {
            if(arr[i] != 0 && i + 1 <= arr[i]) {
                index = i + 1;
            }
        }

        return index;
    }

    public static int solution2(int[] citations) {
        Arrays.sort(citations);

        int max = 0;
        for (int i = citations.length - 1; i >= 0; i--) {
            int min = (int) Math.min(citations[i], citations.length - i);
            if(max < min) max = min;
        }

        return max;
    }
}
