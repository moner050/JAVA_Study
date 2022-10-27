package baekjoon.lv7;

import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class BJ_10757 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 띄어쓰기 기준으로 나눠준다.
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        // long  보다 큰 값을 넣어야 하므로 BigInteger 를 써줘서 넣어준다.
        BigInteger A = new BigInteger(st.nextToken());
        BigInteger B = new BigInteger(st.nextToken());

        // 그리고 출력
        bw.write(A.add(B) + "");
        bw.close();
        br.close();
    }
}
