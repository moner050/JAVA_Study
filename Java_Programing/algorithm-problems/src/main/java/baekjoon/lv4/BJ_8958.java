package baekjoon.lv4;

import java.io.*;

public class BJ_8958 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++)
        {
            int cnt = 0, plus = 0;
            String ox = br.readLine();
            for (int j = 0; j < ox.length(); j++)
            {
                if(ox.charAt(j) == 'O')
                {
                    cnt++;
                    plus += cnt;
                }
                else cnt = 0;
            }
            bw.write(plus + "\n");
        }
        bw.close();
    }
}
