package lv6;

import java.io.*;

public class BJ_1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr = new int[26];
        String input = br.readLine();

        for (int i = 0; i < input.length(); i++)
        {   // 만약 입력받은 값이 소문자 a~z 사이라면 -97
            if('a' <= input.charAt(i) && 'z' >= input.charAt(i))
            {
                arr[input.charAt(i) - 97]++;
            } // 대문자라면 65를 빼주기
            else arr[input.charAt(i) - 65]++;
        }

        int max = -1;
        char c = '?';

        for (int i = 0; i < arr.length; i++)
        {   // 일단 값이 있는것의 max 값을 설정해주고
            if(arr[i] > max)
            {
                max = arr[i];
                // 대문자로 바꿔주기
                c = (char) (i + 65);
            }// 만약 최대값의 개수와 똑같은 인덱스가 있다면 ?로 전환
            else if(arr[i] == max) c = '?';
        }
        bw.write(c + "");
        bw.close();
    }
}
