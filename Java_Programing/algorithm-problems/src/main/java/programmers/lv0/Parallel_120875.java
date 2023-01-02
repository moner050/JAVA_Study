package programmers.lv0;

import java.util.HashSet;
import java.util.Set;

// 평행
// https://school.programmers.co.kr/learn/courses/30/lessons/120875
public class Parallel_120875 {
    public static void main(String[] args) {
//        int[][] dots = {{1, 4}, {9, 2}, {3, 8}, {11, 6}};
        int[][] dots = {{3, 5}, {4, 1}, {2, 4}, {5, 10}};
//        int[][] dots = {{3, 3}, {10, 10}, {6, 6}, {13, 13}};

        System.out.println(solution(dots));
    }

    public static int solution(int[][] dots) {
        Set<Double> set = new HashSet<>();

        for (int i = 0; i < dots.length; i++) {
            for (int j = i + 1; j < dots.length; j++) {
                double lean = ((double)dots[i][1] - dots[j][1]) / ((double)dots[i][0] - dots[j][0]);

                if(set.contains(lean)) return 1;
                set.add(lean);
            }
        }

        return 0;
    }
}

/*
01 23
02 13
03 12

1
 */