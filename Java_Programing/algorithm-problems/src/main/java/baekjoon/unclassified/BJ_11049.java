package baekjoon.unclassified;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_11049 {
    static int N, r, c;
    static int[][] dp, map;

    public static void main(String[] args) throws IOException {
        StringTokenizer st;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        dp = new int[N][N];
        map = new int[N][2];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            r = Integer.parseInt(st.nextToken());
            c = Integer.parseInt(st.nextToken());

            map[i][0] = r;
            map[i][1] = c;
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if(i == j) dp[i][j] = 0;
                else dp[i][j] = Integer.MAX_VALUE;
            }
        }

        for (int i = 1; i < N; i++) {
            for (int j = 0; i + j < N; j++) {
                calculate(j, i + j);
            }
        }

        System.out.println(dp[0][N - 1]);

    }

    public static void calculate(int start, int end){
        for (int i = start; i < end; i++) {
            int temp = dp[start][i] + dp[i + 1][end] + map[start][0] * map[i][1] * map[end][1];
            dp[start][end] = Math.min(dp[start][end], temp);
        }
    }
}
