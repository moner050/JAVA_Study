package lv6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_1316 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int cnt = 0;

        for (int i = 0; i < N; i++)
        {
            boolean check = true;
            boolean[] chk = new boolean[26];
            String text = br.readLine();

            for (int j = 0; j < text.length(); j++)
            {
                int index = text.charAt(j) - 97;
                if(chk[index])
                {
                    if(text.charAt(j) != text.charAt(j-1))
                    {
                        check = false;
                        break;
                    }
                }
                else chk[index] = true;
            }
            if(check) cnt++;
        }
        System.out.println(cnt);
    }
}
