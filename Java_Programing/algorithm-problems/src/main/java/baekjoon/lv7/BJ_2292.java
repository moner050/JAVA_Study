package baekjoon.lv7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_2292 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        int cnt = 0, beeHouse = 1;

        while(true)
        {
            if(num == beeHouse || num <= beeHouse)
            {
                cnt++;
                break;
            }
            if(num > beeHouse)beeHouse = beeHouse + (6 * ++cnt);
        }
        System.out.println(cnt);
    }
}
