package programmers.lv2;

// 점프와 순간 이동
// https://school.programmers.co.kr/learn/courses/30/lessons/12980
public class JumpAndTeleport_12980 {
    public static void main(String[] args) {
        int n = 6;
        System.out.println(solution(n));
    }

    public static int solution(int n) {
        return Integer.bitCount(n);
    }
}
