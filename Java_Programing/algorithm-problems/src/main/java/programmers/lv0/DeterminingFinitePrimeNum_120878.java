package programmers.lv0;

// 유한소수 판별하기
// https://school.programmers.co.kr/learn/courses/30/lessons/120878
public class DeterminingFinitePrimeNum_120878 {
    public static void main(String[] args) {
//        int a = 7, b = 20;
//        int a = 11, b = 22;
        int a = 12, b = 21;

        System.out.println(solution(a, b));
    }

    public static int solution(int a, int b) {
        double num = (double)a / (double)b;

        return String.valueOf(num).length() > 8 ? 2 : 1;
    }

}
