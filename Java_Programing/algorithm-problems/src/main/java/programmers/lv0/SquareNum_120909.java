package programmers.lv0;

// 제곱수 판별하기
// https://school.programmers.co.kr/learn/courses/30/lessons/120909
public class SquareNum_120909 {
    public static void main(String[] args) {
//        int n = 144;
        int n = 976;
        System.out.println(solution(n));
    }

    public static int solution(int n) {
        return n % Math.sqrt(n) == 0 ? 1 : 2;
    }
}
