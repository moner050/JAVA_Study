package programmers.lv0;

// n의 배수
// https://school.programmers.co.kr/learn/courses/30/lessons/181937
public class MultipleOfN_181937 {
    public static void main(String[] args) {
        int num = 98, n = 2;

        System.out.println(solution(num ,n));
    }

    public static int solution(int num, int n) {
        return num % n == 0 ? 1 : 0;
    }
}
