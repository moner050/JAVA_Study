package programmers.lv1;

// https://school.programmers.co.kr/learn/courses/30/lessons/12912
public class BetweenSum_12912 {
    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        System.out.println(solution1(a, b));
        System.out.println(solution2(a, b));
    }

    public static long solution1(int a, int b) {
        long answer = 0;
        int min = Math.min(a, b);
        int max = Math.max(a, b);

        for (int i = min; i <= max; i++) {
            answer += i;
        }
        return answer;
    }

    public static long solution2(int a, int b) {
        long min = Math.min(a, b);
        long max = Math.max(a, b);

        return (max - min + 1) * (min + max) / 2;
    }
}
