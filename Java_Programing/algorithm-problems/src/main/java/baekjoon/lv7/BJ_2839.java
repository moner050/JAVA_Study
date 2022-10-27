package baekjoon.lv7;

import java.io.*;

public class BJ_2839 {
    public static int sugar(int N)
    {
        if(N == 4 || N == 7) return -1;
        else if(N % 5 == 0) return N / 5;
        else if(N % 5 == 1 || N % 5 == 3) return (N / 5) + 1;
        else if(N % 5 == 2 || N % 5 == 4) return (N / 5) + 2;
        else return 0;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        bw.write(sugar(N) + "");
        bw.close();
    }
}
