package baekjoon.unclassified;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_10942 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int S, E, end;
        int N = Integer.parseInt(br.readLine());
        int[] hongNum = new int[N + 1];
        int[][] dp = new int[N][N];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            hongNum[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < N; i++) {
            for (int start = 0; start < N - i; start++) {
                end = start + i;
                if(start == end){
                    dp[start][end] = 1;
                }else if(hongNum[start] == hongNum[end]){
                    if((start + 1) == end){
                        dp[start][end] = 1;
                    }else if(dp[start + 1][end - 1] == 1){
                        dp[start][end] = 1;
                    }
                }
            }
        }

        StringBuffer sb = new StringBuffer();
        int M = Integer.parseInt(br.readLine());
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            S = Integer.parseInt(st.nextToken());
            E = Integer.parseInt(st.nextToken());

            if(dp[S - 1][E - 1] == 1) sb.append("1\n");
            else sb.append("0\n");
        }

        System.out.println(sb);
    }
}
