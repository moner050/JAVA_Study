package baekjoon.lv4;

import java.io.*;
import java.util.Arrays;

public class BJ_10818 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        int[] temp = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] chkTemp = new int[N];

        for(int i = 0; i < N; i++)
        {
            chkTemp[i] = temp[i];
        }

        bw.write(Arrays.stream(chkTemp).min().getAsInt() + " ");
        bw.write(Arrays.stream(chkTemp).max().getAsInt() + "");

        bw.close();
    }
}
