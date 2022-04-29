package lv1;

import java.io.*;

public class BJ_1001 {
    public static void main(String[] args) throws IOException {
//        두 정수 A와 B를 입력받은 다음, A-B를 출력하는 프로그램을 작성하시오.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int Multiplication = 0;
        String[] AB = br.readLine().split(" ");

        Multiplication = Integer.parseInt(AB[0]) * Integer.parseInt(AB[1]);
        bw.write(Multiplication + "");
        bw.close();
    }
}
