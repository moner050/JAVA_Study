package lv10;

import java.io.*;
import java.util.Arrays;

public class BJ_1018 {
    // 체스판을 넣어줄 전역변수 배열 설정.
    public static boolean[][] rectangle;
    public static int min = 64;

    // 다시 칠할것이 몇개가 있는지 확인할 find 메서드
    public static void find(int x, int y)
    {
        int end_x = x + 8, end_y = y + 8;
        int cnt = 0;
        // 처음 칸이 흰색인지 검은색인지 넣어주기.
        boolean first = rectangle[x][y];

        for (int i = x; i < end_x; i++)
        {
            for (int j = y; j < end_y; j++)
            {   // 만약 처음 칸과 색이 같지 않으면 cnt++
                if (rectangle[i][j] != first) cnt++;
                // 그리고 체스판처럼 검사하게 색 반대로 설정.
                first = !first;
            }
            first = !first;
        }
        // cnt 에 cnt 와 64-cnt 중 더 작은 값을 넣어줌.
        cnt = Math.min(cnt, 64 - cnt);
        // 그다음 min 에 min 과 cnt 중 더 작은 값을 넣어준다.
        min = Math.min(min, cnt);
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // 체스판의 크기 입력받기
        int[] input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        // N 과 M 에 입력받은 행과 열 넣어주기.
        int N = input[0], M = input[1];
        // 경우의 수를 위해 각 행과 열에 -7 해준 값 넣어준 변수 선언.
        int N_row = N - 7, M_col = M - 7;

        rectangle = new boolean[N][M];

        for (int i = 0; i < N; i++)
        {   // 입력받은 문자열을 char 배열로 변환
            String S_temp = br.readLine();
            char[] C_temp = S_temp.toCharArray();
            // 흰색이면 true, 검은색이면 false
            for (int j = 0; j < M; j++)
            {
                if(C_temp[j] == 'W') rectangle[i][j] = true;
                else rectangle[i][j] = false;
            }
        }

        // 경우의 수를 대입하며 최소 개수 구하기.
        for (int i = 0; i < N_row; i++)
        {
            for (int j = 0; j < M_col; j++)
            {
                find(i,j);
            }
        }
        // 최솟값 출력
        bw.write(min + "");
        bw.close();
    }
}
