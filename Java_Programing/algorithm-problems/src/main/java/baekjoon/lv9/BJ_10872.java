package baekjoon.lv9;

import java.io.*;

public class BJ_10872 {

    public static int factorial(int n)
    {
        if(n == 0) return 1;
        return n *  factorial(n - 1);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        bw.write(factorial(N) + "");
        bw.close();
    }
}
