package baekjoon.lv6;

import java.io.*;

public class BJ_10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] check_int = new int[26];
        boolean[] check_bool = new boolean[26];
        char[] alphabet = new char[26];

        for(int i = 0; i < alphabet.length; i++)
        {   // 알파벳 넣어주기
            alphabet[i] = (char)(i+97);
        }

        // 입력받기
        String S = br.readLine();

        for (int i = 0; i < S.length(); i++)
        {
            for (int j = 0; j < alphabet.length; j++)
            {   // 만약 문자가 알파벳 배열에 있는 문자와 같으면
                if(S.charAt(i) == alphabet[j])
                {   // check_int 에 비교한 문자가 등장하는 인덱스의 위치를 넣어주고
                    check_int[j] = S.indexOf(S.charAt(i));
                    // check_bool 에 해당 알파벳과 같은 위치인 인덱스를 true
                    check_bool[j] = true;
                }
                else// 만약 문자가 알파벳 배열에 있는 문자와 다른데
                {   // 해당 인덱스의 check_int 가 0 이고 한번도 나온적 없는 문자라면 check_int 를 -1 처리.
                    if(check_int[j] == 0 && check_bool[j] == false) check_int[j] = -1;
                }
            }
        }

        // 알파벳 개수 출력하기
        for (int n : check_int)
        {
            bw.write(n + " ");
        }
        bw.close();
        br.close();
    }
}
