package programmers.lv1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// https://school.programmers.co.kr/learn/courses/30/lessons/12932
public class NumberReverseArray_12932 {
    public static void main(String[] args) {
        long n = 12345;
        for (int num : solution(n)) {
            System.out.print(num);
        }
    }

    public static int[] solution(long n) {
        String[] number = String.valueOf(n).split("");
        Integer[] arr = Arrays.stream(number).mapToInt(Integer::parseInt).boxed().toArray(Integer[]::new);

        List<Integer> listArr = Arrays.asList(arr);
        Collections.reverse(listArr);

        return listArr.stream().mapToInt(i -> i).toArray();
    }
}
