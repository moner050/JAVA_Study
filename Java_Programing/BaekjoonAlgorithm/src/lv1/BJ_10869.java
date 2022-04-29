package lv1;

import java.io.*;

public class BJ_10869 {
    public static void main(String[] args) throws IOException {
//        두 자연수 A와 B가 주어진다. 이때, A+B, A-B, A*B, A/B(몫), A%B(나머지)를 출력하는 프로그램을 작성하시오.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int plus = 0, minus = 0, multiplication = 0, division = 0, rest = 0;
        String[] AB = br.readLine().split(" ");

        plus = Integer.parseInt(AB[0]) + Integer.parseInt(AB[1]);
        minus = Integer.parseInt(AB[0]) - Integer.parseInt(AB[1]);
        multiplication = Integer.parseInt(AB[0]) * Integer.parseInt(AB[1]);
        division = Integer.parseInt(AB[0]) / Integer.parseInt(AB[1]);
        rest = Integer.parseInt(AB[0]) % Integer.parseInt(AB[1]);

        bw.write(plus + "\n" + minus + "\n" + multiplication + "\n" + division + "\n" + rest);
        bw.close();
    }
}
