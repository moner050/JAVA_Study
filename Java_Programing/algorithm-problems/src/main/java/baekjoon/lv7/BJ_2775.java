package baekjoon.lv7;

import java.io.*;

public class BJ_2775 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[][] apt = new int[15][15];
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < 15; i++)
        {   // 아파트 각층 1호는 1을 넣어주고 0층 i호에 i를 넣어준다.
            apt[i][1] = 1;
            apt[0][i] = i;
        }

        for (int i = 1; i < 15; i++)
        {
            for (int j = 2; j < 15; j++)
            {   // 옆집 + 아랫집 = 사람수 충족(계약조항 만족)
                apt[i][j] = apt[i][j - 1] + apt[i - 1][j];
            }
        }

        for (int i = 0; i < T; i++)
        {   // k 와 n 을 입력받으면 해당 층에 몇명이 사는지 출력
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());
            bw.write(apt[k][n] + "\n");
            bw.flush();
        }
        br.close();
        bw.close();
    }
}