package lv3;

import java.io.*;
import java.util.Arrays;

public class BJ_10952 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true)
        {
            int[] temp = Arrays.stream(br.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            if(temp[0] == 0 && temp[1] == 0) break;

            bw.write(temp[0]+temp[1] + "\n");
            bw.flush();
        }
        bw.close();
    }
}
