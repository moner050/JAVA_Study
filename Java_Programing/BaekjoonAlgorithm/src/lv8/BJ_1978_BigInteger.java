package lv8;

import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class BJ_1978_BigInteger {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int cnt = 0;

        for (int i = 0; i < N; i++)
        {
            BigInteger num = BigInteger.valueOf(Integer.parseInt(st.nextToken()));
            if(num.isProbablePrime(10)) cnt++;
        }
        bw.write(cnt + "");
        bw.close();
    }
}
