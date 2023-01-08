package programmers.lv2;

// 숫자의 표현
// https://school.programmers.co.kr/learn/courses/30/lessons/12924
public class RepresentationOfNumbers_12924 {
    public static void main(String[] args) {
        int n = 15;

        System.out.println(solution1(n));
        System.out.println(solution2(n));
    }

    public static int solution1(int n) {
        int result = 0;

        for (int i = 1; i <= n; i++) {
            int tempNum = i;
            for (int j = i + 1; j <= n; j++) {
                tempNum += j;
                if(tempNum == n || tempNum > n) break;
            }
            if(tempNum == n) result++;
        }

        return result;
    }

    public static int solution2(int n) {
        int result = 0;

        for (int i = 1; i <= n; i += 2) {
            if(n % i == 0) result++;
        }

        return result;
    }
}
