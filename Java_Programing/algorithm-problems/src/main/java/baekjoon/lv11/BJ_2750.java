package baekjoon.lv11;

import java.io.*;
import java.util.Arrays;

public class BJ_2750 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        for (int i = 0; i < N; i++)
        {
            arr[i] = Integer.parseInt(br.readLine());
        }
        // 오름차순 정렬
        Arrays.sort(arr);

        for (int n : arr)
        {
            bw.write(n + "\n");
        }
        bw.close();
    }
}
