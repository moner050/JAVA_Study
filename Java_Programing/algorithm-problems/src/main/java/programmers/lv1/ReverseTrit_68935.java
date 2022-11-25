package programmers.lv1;

// https://school.programmers.co.kr/learn/courses/30/lessons/68935
public class ReverseTrit_68935 {
    public static void main(String[] args) {
        int n = 45;

        System.out.println(solution(n));
    }

    public static int solution(int n) {
        StringBuilder sb = new StringBuilder();

        while(n != 0) {
            sb.append(n % 3);
            n /= 3;
        }
        return Integer.parseInt(sb.toString(), 3);
    }
}
