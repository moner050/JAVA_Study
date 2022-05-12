package lv8;

import java.io.*;

public class BJ_2581 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        int sum = 0, check = 0, min = 9999;

        for (int i = M; i <= N; i++)
        {
            for (int j = 1; j < i; j++)
            {   // 만약 체크가 1보다 크면 j = i
                if(check > 1) j = i;
                // 만약 i 가 j 로 나누어 떨어진다면 체크 증가
                if(i % j == 0) check++;
            }
            // 만약 check 가 1이면 (소수이면)
            if(check == 1)
            {   // 소수를 sum 에 더해주고
                sum += i;
                // 만약 min 이 i(소수)보다 크면 min 에 i 를 넣어준다
                if(min > i) min = i;
            }
            // 그다음 check 0 으로 초기화
            check = 0;
        }
        // 만약 min 이 초기 설정값 그대로라면 -1 출력, 아니면 소수의 합과 제일작은 소수 출력
        if(min == 9999) bw.write("-1");
        else bw.write(sum + "\n" + min);
        bw.close();
    }
}
