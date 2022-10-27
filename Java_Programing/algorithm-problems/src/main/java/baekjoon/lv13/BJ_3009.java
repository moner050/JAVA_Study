package baekjoon.lv13;

import java.io.*;
import java.util.Arrays;

public class BJ_3009 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] rec_1 = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] rec_2 = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] rec_3 = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        br.close();

        int x, y;

        if(rec_1[0] == rec_2[0]) x = rec_3[0];
        else if(rec_1[0] == rec_3[0]) x = rec_2[0];
        else x = rec_1[0];

        if(rec_1[1] == rec_2[1]) y = rec_3[1];
        else if(rec_1[1] == rec_3[1]) y = rec_2[1];
        else y = rec_1[1];

        bw.write(x + " " + y);
        bw.close();
    }
}
