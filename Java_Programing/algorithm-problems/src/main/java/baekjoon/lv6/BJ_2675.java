package baekjoon.lv6;

import java.io.*;

public class BJ_2675 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++)
        {
            String[] input = br.readLine().split(" ");
            int n = Integer.parseInt(input[0]);

            for (int j = 0; j < input[1].length(); j++)
            {
                String temp = String.valueOf(input[1].charAt(j));
                for (int k = 0; k < n; k++)
                {
                    bw.write(temp + "");
                }
            }
            bw.write("\n");
        }
        bw.close();
    }
}
