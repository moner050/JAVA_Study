package programmers.lv0;

import java.util.Arrays;

// 머쓱이보다 키 큰 사람
// https://school.programmers.co.kr/learn/courses/30/lessons/120585
public class TallerThen_120585 {
    public static void main(String[] args) {
//        int[] array = {149, 180, 192, 170};
//        int height = 167;
        int[] array = {180, 120, 140};
        int height = 190;

        System.out.println(solution(array, height));
    }

    public static int solution(int[] array, int height) {
        return (int) Arrays.stream(array).filter(i -> i > height).count();
    }
}
