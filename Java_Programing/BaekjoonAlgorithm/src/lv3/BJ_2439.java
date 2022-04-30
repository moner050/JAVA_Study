package lv3;

import java.io.*;

public class BJ_2439 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        for (int i = 1; i <= N; i++)
        {
            for(int j = N; j > i; j--)
            {
                bw.write(' ');
            }
            for(int k = 1; k <= i; k++)
            {
                bw.write('*');
            }
            bw.write("\n");
            bw.flush();
        }
        bw.close();
    }
}
