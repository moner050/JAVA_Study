package lv6;

import java.io.*;

public class BJ_11720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int sum = 0;
        String M = br.readLine();

        for (int i = 0; i < N; i++)
        {
            sum += Integer.parseInt(String.valueOf(M.charAt(i)));
        }
        bw.write(sum + "");
        bw.close();
    }
}
