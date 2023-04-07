package programmers.lv0;

// 주사위 게임 1
// https://school.programmers.co.kr/learn/courses/30/lessons/181839
public class DiceGame1_181839 {
    public static void main(String[] args) {
        int a = 3, b = 5;

        System.out.println(solution(a, b));
    }

    public static int solution(int a, int b) {
        int cnt = 0;
        cnt += check(a);
        cnt += check(b);

        if(cnt == 2) return (int) (Math.pow(a, 2) + Math.pow(b, 2));
        else if(cnt == 1) return 2 * (a + b);
        else return Math.abs(a - b);
    }

    public static int check(int num) {
        return num % 2;
    }
}

