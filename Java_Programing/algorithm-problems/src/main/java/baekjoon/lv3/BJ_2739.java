package baekjoon.lv3;

import java.io.*;

public class BJ_2739 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        for(int i = 1; i < 10; i++)
        {
            bw.write(N +" * " + i + " = " + (N*i) + "\n");
        }

        bw.close();
    }
}
