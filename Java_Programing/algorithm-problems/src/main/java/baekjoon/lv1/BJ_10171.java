package baekjoon.lv1;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class BJ_10171 {
    public static void main(String[] args) throws IOException {
     /*
        아래 예제와 같이 고양이를 출력하시오.
        \    /\
         )  ( ')
        (  /  )
         \(__)|
      */
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write("\\    /\\\n"
                    + " )  ( \')\n"
                    + "(  /  )\n"
                    + " \\(__)|");
        bw.close();
    }
}
