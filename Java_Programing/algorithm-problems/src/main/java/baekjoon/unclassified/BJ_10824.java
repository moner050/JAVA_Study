package baekjoon.unclassified;

import java.io.*;

public class BJ_10824 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // input 에 띄어쓰기 기준으로 배열에 넣어준다
        String[] input = br.readLine().split(" ");

        // AB에 문자열 input[0]번과 input[1]번을 이어붙혀서 넣어준다.
        String AB = input[0] + input[1];
        // CD에 문자열 input[2]번과 input[3]번을 이어붙혀서 넣어준다.
        String CD = input[2] + input[3];

        // 그다음 long 형태로 형변환 후 더해준 다음 출력
        bw.write(Long.parseLong(AB) + Long.parseLong(CD) + "");
        bw.close();
    }
}
