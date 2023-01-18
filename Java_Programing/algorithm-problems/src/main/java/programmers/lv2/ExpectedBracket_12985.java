package programmers.lv2;

// 예상 대진표
// https://school.programmers.co.kr/learn/courses/30/lessons/12985
public class ExpectedBracket_12985 {
    public static void main(String[] args) {
        int n = 8, a = 4, b = 7;

        System.out.println(solution(n, a, b));
    }

    public static int solution(int n, int a, int b) {
        int cnt = 1;

        while(Math.abs(a - b) != 1 || a / 2 == b / 2) {
            a = nextNumber(a);
            b = nextNumber(b);
            cnt++;
        }

        return cnt;
    }

    public static int nextNumber(int num) {
        return num % 2 == 1 ? num / 2 + 1 : num / 2;
    }

}
