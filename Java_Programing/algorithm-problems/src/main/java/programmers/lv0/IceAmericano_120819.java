package programmers.lv0;

import java.util.Arrays;

// 아이스 아메리카노
// https://school.programmers.co.kr/learn/courses/30/lessons/120819
public class IceAmericano_120819 {
    public static void main(String[] args) {
//        int money = 5500;
        int money = 15000;

        System.out.println(Arrays.toString(solution1(money)));
        System.out.println(Arrays.toString(solution2(money)));
    }

    public static int[] solution1(int money) {
        int[] answer = new int[2];

        answer[0] = money / 5500;
        answer[1] = money % 5500;

        return answer;
    }

    public static int[] solution2(int money) {
        return new int[] {money / 5500, money % 5500};
    }
}
