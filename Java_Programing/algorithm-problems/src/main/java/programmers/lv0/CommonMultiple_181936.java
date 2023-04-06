package programmers.lv0;

// 공배수
// https://school.programmers.co.kr/learn/courses/30/lessons/181936
public class CommonMultiple_181936 {
    public static void main(String[] args) {
        int number = 60, n = 2, m = 3;

        System.out.println(solution(number, n, m));
    }

    public static int solution(int number, int n, int m) {
        return number % n == 0 && number % m == 0 ? 1 : 0;
    }
}
