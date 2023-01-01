package programmers.lv0;

import java.util.*;
import java.util.stream.Collectors;

// 등수 매기기
// https://school.programmers.co.kr/learn/courses/30/lessons/120882
public class Rank_120882 {
    public static void main(String[] args) {
//        int[][] score = {{80, 70}, {90, 50}, {40, 70}, {50, 80}};
//        int[][] score = {{80, 70}, {70, 80}, {30, 50}, {90, 100}, {100, 90}, {100, 100}, {10, 30}};
        int[][] score = {{1, 3}, {3, 1}, {2, 3}, {3, 2}, {1, 2}, {0, 0}};

        System.out.println(Arrays.toString(solution1(score)));
        System.out.println(Arrays.toString(solution2(score)));
    }

    public static int[] solution1(int[][] score) {
        double index = 1;
        List<Double> average = Arrays.stream(score).mapToDouble(num1 -> (double) Arrays.stream(num1).sum() / 2).boxed().collect(Collectors.toList());
        double[] sortAverage = average.stream().sorted(Comparator.reverseOrder()).mapToDouble(i -> i).toArray();

        Map<Double, Double> map = new HashMap<>();
        for (double avg : sortAverage) {
            if (!map.containsKey(avg)) map.put(avg, index++);
            else index++;
        }

        return average.stream().mapToInt(i -> map.get(i).intValue()).toArray();
    }

    public static int[] solution2(int[][] score) {

        return Arrays.stream(score)
                .map(num -> Arrays.stream(num)
                        .average()
                        .orElse(0))
                .mapToInt(d -> Arrays.stream(score)
                        .map(num -> Arrays.stream(num)
                                .average()
                                .orElse(0))
                        .sorted(Comparator.reverseOrder())
                        .collect(Collectors.toList())
                        .indexOf(d) + 1)
                .toArray();

    }
}
