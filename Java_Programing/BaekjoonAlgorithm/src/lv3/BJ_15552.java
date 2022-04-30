package lv3;

import java.io.*;
import java.util.Arrays;

public class BJ_15552 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i++)
        {
            int[] temp = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int sum = temp[0] + temp[1];

            bw.write(sum + "\n");
        }
        bw.close();
    }
}
