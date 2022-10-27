package baekjoon.lv5;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class BJ_4673 {
    public static int selfNum(int num)
    {
        int sum = num;
        while(num != 0)
        {   // num 에다가 첫째자리수를 차례대로 더해주고
            sum += (num % 10);
            num /= 10;
        }
        // 값 리턴시켜주기
        return sum;
    }

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        boolean[] chk = new boolean[10001];

        for(int i = 1; i <= 10000; i++)
        {   // selfNum 함수를 통해 나온 값을 num 에 넣어주기
            int num = selfNum(i);
            // 만약 num 이 10000 초과하면 제외하게 true 로 설정
            if(num < 10001) chk[num] = true;
        }

        for(int i = 1; i <= 10000; i++)
        {   // 만약 chk[i] 가 true 가 아니면 bw 에 써주기
            if(!chk[i]) bw.write(i + "\n");
        }
        // 출력
        bw.close();
    }
}
