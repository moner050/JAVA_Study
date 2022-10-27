package baekjoon.lv8;

import java.io.*;

public class BJ_4948 {

    public static int findPrimeNum2(int n)
    {
        // 몇개인지 세는 cnt 와 매개변수의 2배인 m 을 선언
        int cnt = 0, m = n*2;
        boolean[] prime = new boolean[m + 1];
        // 만약 1이 입력된다면 1을 리턴
        if(n == 1) return ++cnt;

        for (int i = 2; i <= m; i++)
        {
            // prime[i] 가 true 면 건너뛰기
            if(prime[i]) continue;
            // 만약 i 가 n 보다 크다면 cnt 증가
            if(i > n) cnt++;

            // 자신의 배수 다 true 처리 해주기
            for (int j = i + i; j <= m; j += i)
            {
                prime[j] = true;
            }
        }
        return cnt;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while(true)
        {
            int n = Integer.parseInt(br.readLine());

            if(n == 0) break;

            bw.write(findPrimeNum2(n) + "\n");
            bw.flush();
        }
    }
}
