package lv6;

import java.io.*;

public class BJ_10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String S = br.readLine();
        int[] chk = new int[26];
        boolean[] check = new boolean[26];
        char[] alphabet = new char[26];
        // a~z 까지 넣어주기
        for (int i = 0; i <= 25; i++)
        {
            alphabet[i] = (char)(i+97);
        }

        for (int i = 0; i < S.length(); i++)
        {
            for(int j = 0; j < alphabet.length; j++)
            {
                if(S.charAt(i) == alphabet[j])
                {
                    chk[j] = S.indexOf(S.charAt(i));
                    check[j] = true;
                }
                else
                {
                    if(chk[j] == 0 && check[j] == false) chk[j] = -1;
                }
            }
        }
        for (int i : chk)
        {
            bw.write(i + " ");
        }
        bw.close();
    }
}
