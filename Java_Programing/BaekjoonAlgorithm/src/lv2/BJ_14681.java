package lv2;

import java.io.*;

public class BJ_14681 {
    public static void main(String[] args) throws IOException {
        /*
        예를 들어, 좌표가 (12, 5)인 점 A는 x좌표와 y좌표가 모두 양수이므로 제1사분면에 속한다.
        점 B는 x좌표가 음수이고 y좌표가 양수이므로 제2사분면에 속한다.
        점의 좌표를 입력받아 그 점이 어느 사분면에 속하는지 알아내는 프로그램을 작성하시오.
        단, x좌표와 y좌표는 모두 양수나 음수라고 가정한다.
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int x = Integer.parseInt(br.readLine());
        int y = Integer.parseInt(br.readLine());

        if(x > 0)
        {
            if(y > 0) bw.write("1");
            else bw.write("4");
        }
        else
        {
            if(y > 0) bw.write("2");
            else bw.write("3");
        }

        bw.close();
    }
}
