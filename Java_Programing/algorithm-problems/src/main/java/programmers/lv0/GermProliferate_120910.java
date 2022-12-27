package programmers.lv0;

// 세균 증식
// https://school.programmers.co.kr/learn/courses/30/lessons/120910
public class GermProliferate_120910 {
    public static void main(String[] args) {
//        int n = 2, t = 10;
        int n = 7, t = 15;
        System.out.println(solution(n, t));
    }
    public static int solution(int n, int t) {
        int result = n;
        for (int i = 0; i < t; i++) {
            result *= 2;
        }
        return result;
    }
}
