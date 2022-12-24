package programmers.lv0;

// 피자 나눠먹기
// https://school.programmers.co.kr/learn/courses/30/lessons/120816
public class SharePizza_120816 {
    public static void main(String[] args) {
//        int slice = 7, n = 10;
        int slice = 4, n = 12;

        System.out.println(solution(slice, n));
    }
    public static int solution(int slice, int n) {
        return (n % slice == 0) ? n / slice : n / slice + 1;
    }
}
