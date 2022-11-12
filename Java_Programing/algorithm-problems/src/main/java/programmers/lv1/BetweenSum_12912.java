package programmers.lv1;

// https://school.programmers.co.kr/learn/courses/30/lessons/12912
public class BetweenSum_12912 {
    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        System.out.println(solution(a, b));
    }
    public static long solution(int a, int b) {
        long answer = 0;
        int min = Math.min(a, b);
        int max = Math.max(a, b);

        for (int i = min; i <= max; i++) {
            answer += i;
        }
        return answer;
    }
}
