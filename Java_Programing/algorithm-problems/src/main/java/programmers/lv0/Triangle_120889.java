package programmers.lv0;

import java.util.Arrays;

// 삼각형의 완성조건
// https://school.programmers.co.kr/learn/courses/30/lessons/120889
public class Triangle_120889 {
    public static void main(String[] args) {
//        int[] sides = {1, 2 ,3};
        int[] sides = {3, 6, 2};
//        int[] sides = {199, 72, 222};
        System.out.println(solution(sides));
    }

    public static int solution(int[] sides) {
        Arrays.sort(sides);
        return sides[2] < (sides[1] + sides[0]) ? 1 : 2;
    }
}
