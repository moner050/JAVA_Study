package lv8;

import java.io.*;
import java.util.StringTokenizer;

public class BJ_1978 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int check = 0, cnt = 0;
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < N; i++)
        {
            int num = Integer.parseInt(st.nextToken());

            for (int j = 1; j < num; j++)
            {
                if(num % j == 0) check++;
            }
            // 소수라면 cnt++
            if(check == 1) cnt++;
            check = 0;
        }
        bw.write(cnt + "");
        bw.close();
    }
}
