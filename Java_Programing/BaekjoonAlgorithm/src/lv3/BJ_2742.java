package lv3;

import java.io.*;

public class BJ_2742 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        for(int i = N; i > 0; i--)
        {
            bw.write(i + "\n");
        }
        bw.close();
    }
}
