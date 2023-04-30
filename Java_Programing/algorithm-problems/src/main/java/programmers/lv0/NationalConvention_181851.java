package programmers.lv0;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.IntStream;

// 전국 대회 선발 고사
// https://school.programmers.co.kr/learn/courses/30/lessons/181851
public class NationalConvention_181851 {
    public static void main(String[] args) {
        int[] rank = {3, 7, 2, 5, 4, 6, 1};
//        int[] rank = {1, 2, 3};
        boolean[] attendance = {false, true, true, true, true, false, false};

        System.out.println(solution1(rank, attendance));
        System.out.println(solution2(rank, attendance));
    }

    public static int solution1(int[] rank, boolean[] attendance) {
        int idx = 0;
        int[] top3 = new int[3];
        Map<Integer, Integer> tree = new TreeMap<>();

        for (int i = 0; i < rank.length; i++) {
            if(attendance[i]) tree.put(rank[i], i);
        }

        for (int n : tree.keySet()) {
            if(idx > 2) break;
            top3[idx++] = tree.get(n);
        }

        return 10000 * top3[0] + 100 * top3[1] + top3[2];
    }

    public static int solution2(int[] rank, boolean[] attendance) {
        return IntStream.range(0, rank.length)
                .filter(i -> attendance[i])
                .boxed()
                .sorted(Comparator.comparing(i -> rank[i]))
                .limit(3)
                .reduce((cur, next) -> cur * 100 + next)
                .get();
    }
}
