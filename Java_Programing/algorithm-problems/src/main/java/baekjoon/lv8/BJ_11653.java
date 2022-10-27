package baekjoon.lv8;

import java.io.*;

public class BJ_11653 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        // 소인수 분해를 하기 위한 숫자 선언.
        int num = 2;

        while(N != 0)
        {
            // 입력받은 숫자가 1이면 바로 종료.(아무것도 출력 안함.)
            if(N == 1) break;

            // 만약 N 이 num 으로 나누어 떨어지지 않는다면 num 을 증가시킨다.
            if(N % num != 0) num++;
            // 만약 N 이 num 으로 나누어 떨어진다면
            else if (N % num == 0)
            {   // N 에 num 을 나누어 준 뒤 몫을 N 에 넣어준다.
                N /= num;
                // 그리고 bw 에 넣어준 다음
                bw.write(num + "\n");
                // 다시 num 을 2로 초기화 시킨다.
                num = 2;
            }
        }
        // while 문이 끝나면 출력
        bw.close();
    }
}
