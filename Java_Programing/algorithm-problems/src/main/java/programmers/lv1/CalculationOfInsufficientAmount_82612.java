package programmers.lv1;

// https://school.programmers.co.kr/learn/courses/30/lessons/82612
public class CalculationOfInsufficientAmount_82612 {
    public static void main(String[] args) {
        int price = 3, money = 20, count = 4;

        System.out.println(solution1(price, money, count));
        System.out.println(solution2(price, money, count));
    }

    public static long solution1(int price, long money, int count) {
        for (int i = 1; i <= count; i++) {
            money -= (long) price * i;
        }

        return money < 0 ? -1 * money : 0;
    }

    public static long solution2(long price, long money, long count) {
        return Math.max(price * (count * (count + 1) / 2) - money, 0);
    }
}
