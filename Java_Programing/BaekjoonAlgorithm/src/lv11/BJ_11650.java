package lv11;

import java.io.*;
import java.util.Arrays;

public class BJ_11650 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[][] coordinate = new int[N][2];

        // 좌표 입력받고 넣어주기
        for (int i = 0; i < N; i++)
        {
            int[] temp = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            coordinate[i][0] = temp[0];
            coordinate[i][1] = temp[1];
        }

        //
        Arrays.sort(coordinate, (e1, e2) -> {
            if(e1[0] == e2[0]) return e1[1] - e2[1];
            else return e1[0] - e2[0];
        });


        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 2; j++) {
                bw.write(coordinate[i][j] + " ");
            }
            bw.write("\n");
        }

        bw.close();
    }
}
