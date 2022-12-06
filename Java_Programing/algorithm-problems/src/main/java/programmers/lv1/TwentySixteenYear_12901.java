package programmers.lv1;

import java.time.LocalDate;

// https://school.programmers.co.kr/learn/courses/30/lessons/12901
public class TwentySixteenYear_12901 {
    public static void main(String[] args) {
        int a = 5, b = 24;

        System.out.println(solution1(a, b));
        System.out.println(solution2(a, b));
    }

    public static String solution1(int a, int b) {
        return LocalDate.of(2016, a, b).getDayOfWeek().toString().substring(0, 3);
    }

    public static String solution2(int a, int b) {
        int[] days = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] month = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};

        int date = 0;

        for (int i = 0; i < a - 1; i++) {
            date += days[i];
        }
        date += b - 1;
        return month[date % 7];
    }
}
