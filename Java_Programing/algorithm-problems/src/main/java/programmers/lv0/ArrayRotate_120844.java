package programmers.lv0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// 배열 회전시키기
// https://school.programmers.co.kr/learn/courses/30/lessons/120844
public class ArrayRotate_120844 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};
        String direction = "right";

        System.out.println(Arrays.toString(solution1(numbers, direction)));
        System.out.println(Arrays.toString(solution2(numbers, direction)));
    }

    public static int[] solution1(int[] numbers, String direction) {
        List<Integer> numList = new ArrayList<>();
        if(direction.equals("right")) {
            numList.add(numbers[numbers.length-1]);
            for (int i = 0; i < numbers.length - 1; i++) {
                numList.add(numbers[i]);
            }
        }
        else {
            for (int i = 1; i < numbers.length; i++) {
                numList.add(numbers[i]);
            }
            numList.add(numbers[0]);
        }
        return numList.stream().mapToInt(Integer::intValue).toArray();
    }

    public static int[] solution2(int[] numbers, String direction) {
        List<Integer> numList = Arrays.stream(numbers).boxed().collect(Collectors.toList());
        if(direction.equals("right")) {
            numList.add(0, numList.get(numList.size() - 1));
            numList.remove(numList.size() - 1);
        }
        else {
            numList.add(numList.get(0));
            numList.remove(0);
        }
        return numList.stream().mapToInt(Integer::intValue).toArray();
    }
}
