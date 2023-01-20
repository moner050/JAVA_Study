package programmers.lv2;

// 멀리 뛰기
// https://school.programmers.co.kr/learn/courses/30/lessons/12914
public class LongJump_12914 {
    public static void main(String[] args) {
        int n = 3;

        System.out.println(solution(n));
    }

    public static long solution(int n) {
        int left = 1, right = 1, result = -1;

        if(n == 1) return 1;
        else if(n == 2) return 2;
        else {
            for (int i = 3; i <= n + 1; i++) {
                result = left + right;
                left = right;
                right = result;
            }
        }

        return result;
    }
}
