package lv4;

import java.io.*;

public class BJ_2562 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] num = new int[9];
        int max = 0, idx = 0;

        for(int i = 0; i < 9; i++)
        {
            num[i] = Integer.parseInt(br.readLine());
            if(max < num[i])
            {
                max = num[i];
                idx = i+1;
            }
        }
        bw.write(max + "\n" + idx);
        bw.close();
    }
}
