package lv4;

import java.io.*;

public class BJ_2577 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] idx = new int[10];
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());

        String result = Integer.toString(A * B * C);

        for(int i = 0; i < 10; i++)
        {
            for (int j = 0; j < result.length(); j++)
            {
                String temp = String.valueOf(result.charAt(j));
                if(temp.equals(String.valueOf(i))) idx[i]++;
            }
        }
        for(int n : idx)
        {
            bw.write(n + "\n");
        }
        bw.close();
    }
}
