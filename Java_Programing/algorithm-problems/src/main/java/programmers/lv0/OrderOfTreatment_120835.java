package programmers.lv0;

import java.util.*;
import java.util.stream.Collectors;

// 진료순서 정하기
// https://school.programmers.co.kr/learn/courses/30/lessons/120835
public class OrderOfTreatment_120835 {
    public static void main(String[] args) {
        int[] emergency = {3, 76, 24};

        System.out.println(Arrays.toString(solution1(emergency)));
        System.out.println(Arrays.toString(solution2(emergency)));
    }

    public static int[] solution1(int[] emergency) {
        List<Integer> list = Arrays.stream(emergency).boxed().sorted(Comparator.reverseOrder()).collect(Collectors.toList());

        List<Integer> result = new ArrayList<>();

        for (int e : emergency) {
            result.add(list.indexOf(e) + 1);
        }

        return result.stream().mapToInt(Integer::intValue).toArray();
    }

    public static int[] solution2(int[] emergency) {
        return Arrays.stream(emergency)
                .map(e -> Arrays.stream(emergency)
                        .boxed()
                        .sorted(Comparator.reverseOrder())
                        .collect(Collectors.toList()).indexOf(e) + 1)
                .toArray();
    }
}
