package lv9;

import java.io.*;

public class BJ_2447 {

    public static void star(String[][] arr, int x, int y, int N)
    {
        // 재귀로 들어온 N 이 1 이면 별 삽입.
        if(N == 1)
        {
            arr[x][y] = "*";
            return;
        }

        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {   // i 와 j 가 1이 아닐때
                if(!(i == 1 && j == 1)) star(arr, x + i * (N / 3), y + j * ( N / 3 ), N / 3);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        String[][] arr = new String[N][N];
        // 일단 배열에 빈칸 채워두기
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr[i].length; j++)
            {
                arr[i][j] = " ";
            }
        }
        // star 함수 실행
        star(arr,0,0, N);

        // 2차원 배열 write 에 서서 출력하기.
        for (String[] strArr : arr)
        {
            for (String str : strArr)
            {
                bw.write(str + "");
            }
            bw.write("\n");
        }
        bw.close();

    }
}
