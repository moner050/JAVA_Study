package programmers.lv0;

import java.util.Arrays;
import java.util.stream.LongStream;

// 배열 뒤집기
// https://school.programmers.co.kr/learn/courses/30/lessons/120821
public class ReverseArray_120821 {
    public static void main(String[] args) {
        int[] num_list = {1, 2, 3, 4, 5};

        System.out.println(Arrays.toString(solution1(num_list)));
        System.out.println(Arrays.toString(solution2(num_list)));
    }

    public static int[] solution1(int[] num_list) {
        int idx = 0;
        int[] temp = new int[num_list.length];
        for (int i = num_list.length - 1; i >= 0; i--) {
            temp[idx++] = num_list[i];
        }
        return temp;
    }

    public static int[] solution2(int[] num_list) {
        return LongStream.range(1, num_list.length + 1)
                .mapToInt(i -> num_list[ num_list.length - (int) i])
                .toArray();
    }
}
