package unclassified;

import java.io.*;

public class BJ_10808 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] check_int = new int[26];
        char[] alphabet = new char[26];

        // 알파벳 넣어주기
        for (int i = 0; i < alphabet.length; i++)
        {
            alphabet[i] = (char)(i+97);
        }

        // 입력받기
        char[] S = br.readLine().toCharArray();

        // 알파벳 있나 검사하기
        for (int i = 0; i < S.length; i++)
        {
            for (int j = 0; j < alphabet.length; j++)
            {   // 검사 후 있으면 check_int 의 해당 인덱스 값을 증가시켜줌
                if(S[i] == alphabet[j]) check_int[j]++;
            }
        }

        // 출력
        for (int n : check_int)
        {
            bw.write(n + " ");
        }
        bw.close();
        br.close();
    }
}
