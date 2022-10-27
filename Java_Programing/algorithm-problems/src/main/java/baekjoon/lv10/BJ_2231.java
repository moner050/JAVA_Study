package baekjoon.lv10;

import java.io.*;
import java.util.stream.Stream;

// 리펙토링 필요함.
public class BJ_2231 {
    // 숫자를 한자리씩 끊어서 배열에 넣어주고 리턴
    public static int[] numList(int num)
    {
        int[] arrNum = Stream.of(String.valueOf(num).split("")).mapToInt(Integer::parseInt).toArray();
        return arrNum;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // 자연수 입력 받기
        int N = Integer.parseInt(br.readLine());
        boolean check = false;

        for (int i = 2; i < N; i++)
        { // N 까지 하나씩 입력받고
            int temp = i;
            // num 배열에 한자리씩 끊어서 넣어주기.
            int[] num = numList(i);
            // temp 에 num 배열에 있는 값들 다 더하기.
            for (int n : num)
            {
                temp += n;
            }
            // 만약 다 더한 값이 N 과 같다면 write 후 for 문 종료.
            if(temp == N)
            {
                bw.write(i + "");
                check = true;
                break;
            }
        }
        // 만약 생성자가 없다면 0을 write 하고 출력.
        if(!check) bw.write(0 + "");
        bw.close();
    }
}
