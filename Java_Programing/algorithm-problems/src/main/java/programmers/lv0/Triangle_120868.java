package programmers.lv0;

import java.util.Arrays;

// 삼각형의 완성조건
// https://school.programmers.co.kr/learn/courses/30/lessons/120868
public class Triangle_120868 {
    public static void main(String[] args) {
//        int[] sides = {1, 2};
        int[] sides = {3, 6};

        System.out.println(solution1(sides));
        System.out.println(solution2(sides));
    }

    public static int solution1(int[] sides) {
        int cnt = 0;
        int max = Arrays.stream(sides).max().orElse(0);
        int min = Arrays.stream(sides).min().orElse(0);

        for (int i = max - min + 1; i <= max; i++) {
            cnt++;
        }

        for (int i = max + 1; i < min + max; i++) {
            cnt++;
        }

        return cnt;
    }

    public static int solution2(int[] sides) {
        int cnt = 0;
        for (int i = (sides[0] > sides[1] ? sides[0] - sides[1] : sides[1] - sides[0]) + 1; i < sides[0] + sides[1]; i++) {
            cnt++;
        }
        return cnt;
    }
}
