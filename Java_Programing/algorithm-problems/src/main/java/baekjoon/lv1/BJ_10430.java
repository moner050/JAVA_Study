package baekjoon.lv1;

import java.io.*;
import java.util.StringTokenizer;

public class BJ_10430 {
    public static void main(String[] args) throws IOException {
        /*
        (A+B)%C는 ((A%C) + (B%C))%C 와 같을까?
        (A×B)%C는 ((A%C) × (B%C))%C 와 같을까?
        세 수 A, B, C가 주어졌을 때, 위의 네 가지 값을 구하는 프로그램을 작성하시오.
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        int fResult = (A + B) % C;
        int fst =  ((A % C) + (B % C)) % C;
        int sResult = (A * B) % C;
        int scd = ((A % C) * (B % C)) % C;
        bw.write(fResult + "\n" + fst + "\n" + sResult + "\n" + scd);
        bw.close();

    }
}
