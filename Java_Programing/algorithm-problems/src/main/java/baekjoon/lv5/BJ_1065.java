package baekjoon.lv5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_1065 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] temp = new int[4];
        int cnt = 0, idx = 0;

        for (int i = 1; i <= N; i++)
        {
            idx = 0;
            if(i < 100) cnt++;
            else
            {
                int num = i, gbg = 0;
                while(num != 0)
                {
                    gbg = num%10;
                    temp[idx++] = gbg;
                    num = num/10;
                }
                if(temp[0] - temp[1] == temp[1] - temp[2] && i < 1000) cnt++;
            }
        }
        System.out.println(cnt);
    }
}
