package programmers.lv0;

// 양꼬치
// https://school.programmers.co.kr/learn/courses/30/lessons/120830
public class LambSkewers_120830 {
    public static void main(String[] args) {
//        int n = 10, k = 3;
        int n = 64, k = 6;

        System.out.println(solution(n, k));
    }

    public static int solution(int n, int k) {
        return (n * 12000) + ((k - (n / 10)) * 2000);
    }
}
