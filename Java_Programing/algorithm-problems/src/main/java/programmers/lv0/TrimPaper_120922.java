package programmers.lv0;

// 종이 자르기
// https://school.programmers.co.kr/learn/courses/30/lessons/120922
public class TrimPaper_120922 {
    public static void main(String[] args) {
        int M = 2, N = 2;

        System.out.println(solution(M, N));
    }

    public static int solution(int M, int N) {
        return M * N - 1;
    }
}
