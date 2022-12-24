package programmers.lv0;

// 피자 나눠먹기
// https://school.programmers.co.kr/learn/courses/30/lessons/120814
public class SharePizza_120814 {
    public static void main(String[] args) {
//        int n = 7;
//        int n = 1;
        int n = 15;

        System.out.println(solution1(n));
        System.out.println(solution2(n));
    }
    public static int solution1(int n) {
        int answer = n / 7;
        if (n % 7 > 0) answer++;
        return answer;
    }

    public static int solution2(int n) {
        return (n % 7 == 0) ? n / 7 : n / 7 + 1;
    }
}
