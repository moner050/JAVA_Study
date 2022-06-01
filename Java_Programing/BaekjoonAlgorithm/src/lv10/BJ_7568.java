package lv10;

import java.io.*;
import java.util.Arrays;

public class BJ_7568 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 전체 사람 수 입력받기
        int N = Integer.parseInt(br.readLine());
        // 사람 키와 몸무게를 받을 이차원 배열 생성
        int[][] people = new int[N][2];

        for (int i = 0; i < N; i++)
        {
            // 입력 받기
            int[] input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            // 이차원 배열에 키와 몸무게 넣어주기
            people[i][0] = input[0];
            people[i][1] = input[1];
        }

        for (int i = 0; i < N; i++)
        {
            int rank = 1;

            for (int j = 0; j < N; j++)
            {   // 같은사람은 패스
                if(i == j) continue;
                // 만약 i 사람의 키와 몸무게가 j 사람보다 작으면 등수 올라가기
                if(people[i][0] < people[j][0] && people[i][1] < people[j][1]) rank++;
            }
            // 그다음 등수 write
            bw.write(rank + " ");
        }
        // 등수 출력
        bw.close();
    }
}
