package programmers.lv1;

import java.util.Arrays;

// https://school.programmers.co.kr/learn/courses/30/lessons/12921
public class FindPrimeNum_12921 {
    public static void main(String[] args) {
        int n = 10;

        System.out.println(solution(n));
    }

    // 에라토스테네스의 체 이용해 소수 구하기
    public static int solution(int n) {
        int answer = 0;
        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);

        isPrime[0] = isPrime[1] = false;

        for (int i = 2; i * i <= n; i++) {
            if(isPrime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        for (boolean chk : isPrime) {
            if(chk) answer++;
        }

        return answer;
    }
}
