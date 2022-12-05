package programmers.lv1;

import java.util.*;

// https://school.programmers.co.kr/learn/courses/30/lessons/68644
public class SumTwoNumber_68644 {
    public static void main(String[] args) {
//        int[] numbers = {2, 1, 3, 4, 1};
        int[] numbers = {5, 0, 2, 7};

        System.out.println(Arrays.toString(solution1(numbers)));
        System.out.println(Arrays.toString(solution2(numbers)));
    }

    public static int[] solution1(int[] numbers) {
        HashMap<Integer, Integer> numList = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                numList.put(numbers[i] + numbers[j], numbers[i] + numbers[j]);
            }
        }

        ArrayList<Integer> answerList = new ArrayList<>(numList.keySet());
        Collections.sort(answerList);

        return answerList.stream().mapToInt(Integer::intValue).toArray();
    }

    public static int[] solution2(int[] numbers) {
        TreeSet<Integer> numList = new TreeSet<>();
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                numList.add(numbers[i] + numbers[j]);
            }
        }

        ArrayList<Integer> answerList = new ArrayList<>(numList);

        return answerList.stream().mapToInt(Integer::intValue).toArray();
    }
}
