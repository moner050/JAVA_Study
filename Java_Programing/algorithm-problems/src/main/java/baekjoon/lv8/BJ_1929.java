package baekjoon.lv8;

import java.io.*;

public class BJ_1929 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");

        int M = Integer.parseInt(input[0]);
        int N = Integer.parseInt(input[1]);

        // 에라토스테네스의 체 이용해보기
        boolean[] prime = new boolean[N + 1];

        for (int i = 2; i <= N; i++)
        {
            // prime[i]가 true 면 건너뛰기
            if(prime[i]) continue;

            if(i >= M) bw.write(i + "\n");

            for (int j = i + i; j <= N; j += i)
            {
                prime[j] = true;
            }
        }
        bw.close();
    }
}
