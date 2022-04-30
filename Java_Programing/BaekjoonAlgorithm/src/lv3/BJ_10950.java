package lv3;

import java.io.*;
import java.util.Arrays;

public class BJ_10950 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.

        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i++)
        {
            int[] temp = Arrays.stream(br.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            int sum = temp[0] + temp[1];

            bw.write(sum + "\n");
        }
        bw.close();

    }
}
