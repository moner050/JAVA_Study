package baekjoon.lv8;

import java.io.*;

public class BJ_9020 {

    public static boolean[] prime = new boolean[10001];

    public static void get_prime()
    {   // 1 과 2 는 소수니 true
        prime[0] = true; prime[1] = true;

        for (int i = 2; i <= Math.sqrt(prime.length); i++)
        {   // prime 이 true 면 넘어가기.
            if(prime[i]) continue;

            for (int j = i + i; j < prime.length; j+=i)
            {   // i 의 배수는 전부 다 true
                prime[j] = true;
            }
        }
    }

    public static int[] gold_bach(int n)
    {
        int[] result = new int[2];
        int left_num = n / 2;
        int right_num = n / 2;

        while(true)
        {
            if(!prime[left_num] && !prime[right_num])
            {
                result[0] = left_num; result[1] = right_num;
                return result;
            }
            else
            {
                left_num--;
                right_num++;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 소수 구하기.
        get_prime();
        // 몇번 반복 할 것인지 입력 받기
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++)
        {
            int n = Integer.parseInt(br.readLine());
            int[] result = gold_bach(n);
            bw.write(result[0] + " " + result[1] + "\n");
            bw.flush();
        }
        bw.close();
    }
}
