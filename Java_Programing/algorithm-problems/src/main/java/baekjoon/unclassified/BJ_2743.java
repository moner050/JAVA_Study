package baekjoon.unclassified;

import java.io.*;

public class BJ_2743 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // 문자열 입력받기
        String alphabet = br.readLine();
        // 길이 넣고 출력
        bw.write(alphabet.length() + "");
        bw.close();
        br.close();
    }
}
