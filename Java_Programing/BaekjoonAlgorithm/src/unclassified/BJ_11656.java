package unclassified;

import java.io.*;
import java.util.Arrays;

public class BJ_11656 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String S = br.readLine();
        // 입력받은 문자열의 길이만큼 배열 만들기
        String[] sortArray = new String[S.length()];

        // 앞에서부터 한글자씩 잘라가면서 배열에 넣어주기.
        for (int i = 0; i < S.length(); i++)
        {
            sortArray[i] = S.substring(i, sortArray.length);
        }
        // a, b, c.... 알파벳 순서대로 정렬
        Arrays.sort(sortArray);

        // bw 에 정렬된 배열 담아주기
        for(String s : sortArray)
        {
            bw.write(s + "\n");
        }
        bw.close();
    }
}
