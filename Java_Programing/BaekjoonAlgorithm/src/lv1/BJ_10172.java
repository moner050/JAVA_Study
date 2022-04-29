package lv1;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class BJ_10172 {
    public static void main(String[] args) throws IOException {
        /*
            아래 예제와 같이 개를 출력하시오.
            |\_/|
            |q p|   /}
            ( 0 )"""\
            |"^"`    |
            ||_/=\\__|
         */
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write("|\\_/|\n"
                   + "|q p|   /}\n"
                   + "( 0 )\"\"\"\\\n"
                   + "|\"^\"`    |\n"
                   + "||_/=\\\\__|");
        bw.close();
    }
}
