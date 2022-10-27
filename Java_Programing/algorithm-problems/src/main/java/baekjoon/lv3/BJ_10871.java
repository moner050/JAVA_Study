package baekjoon.lv3;

import java.io.*;
import java.util.Arrays;

public class BJ_10871 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] temp = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int N = temp[0];
        int X = temp[1];

        int[] innerTemp = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        for(int i = 0; i < N; i++)
        {
            if(innerTemp[i] < X) bw.write(innerTemp[i] + " ");
        }

        bw.close();

    }
}
