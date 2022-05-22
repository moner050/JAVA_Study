package lv9;

import java.io.*;

public class BJ_11729 {
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void hanoi(int N, int start, int mid, int to) throws IOException {
        if(N == 1)
        {
            bw.write(start + " " + to + "\n");
            return;
        }

        hanoi(N - 1, start, to, mid);
        bw.write(start + " " + to + "\n");
        hanoi(N - 1, mid, start, to);

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        bw.write((int) (Math.pow(2, N) - 1) + "\n");

        hanoi(N, 1, 2, 3);
        bw.close();
    }
}
