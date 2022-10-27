package baekjoon.lv3;

import java.io.*;

public class BJ_8393 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int sum = 0;
        int n = Integer.parseInt(br.readLine());

        for (int i = 1; i <= n; i++)
        {
            sum += i;
        }
        bw.write(sum + "");
        bw.close();
    }
}
