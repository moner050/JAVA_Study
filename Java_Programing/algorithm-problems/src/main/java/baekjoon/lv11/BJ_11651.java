package baekjoon.lv11;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BJ_11651 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 점 N개 입력받고 2차원 배열 만들어주기
        int N = Integer.parseInt(br.readLine());
        int[][] numList = new int[N][2];

        // x와 y의 위치 입력받기.
        for (int i = 0; i < N; i++)
        {
            StringTokenizer num = new StringTokenizer(br.readLine(), " ");
            numList[i][0] = Integer.parseInt(num.nextToken());
            numList[i][1] = Integer.parseInt(num.nextToken());
        }

        // 두번째 원소가 같으면 첫번째 원소끼리 비교. 아니면 두번째 원소끼리 비교.
        Arrays.sort(numList, (e1, e2) -> {
            if(e1[1] == e2[1]) return e1[0] - e2[0];
            else return e1[1] - e2[1];
        });

        // 정렬된 좌표 write 후 출력
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 2; j++) {
                bw.write(numList[i][j] + " ");
            }
            bw.write("\n");
        }
        bw.close();
    }

}
