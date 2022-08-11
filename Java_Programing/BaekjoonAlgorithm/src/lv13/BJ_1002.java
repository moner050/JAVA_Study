package lv13;

import java.io.*;
import java.util.StringTokenizer;

public class BJ_1002 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        int x1, y1, r1;
        int x2, y2, r2;

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            // 조규현
            x1 = Integer.parseInt(st.nextToken());
            y1 = Integer.parseInt(st.nextToken());
            r1 = Integer.parseInt(st.nextToken());

            // 백승환
            x2 = Integer.parseInt(st.nextToken());
            y2 = Integer.parseInt(st.nextToken());
            r2 = Integer.parseInt(st.nextToken());

            bw.write(tangent_point(x1, y1, r1, x2, y2, r2) + "\n");
        }

        br.close();
        bw.close();
    }

    public static int tangent_point(int x1, int y1, int r1, int x2, int y2, int r2){

        double distance = (int)(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        if(x1 == x2 && y1 == y2 && r1 == r2) return -1;         // 접점의 개수가 무한일때
        else if(distance > Math.pow(r1 + r2, 2)) return 0;      // 접점이 전혀 없을때
        else if(distance < Math.pow(r2 - r1, 2)) return 0;      // 접점이 전혀 없을때
        else if(distance == Math.pow(r2 - r1, 2)) return 1;     // 내접할때
        else if(distance == Math.pow(r1 + r2, 2)) return 1;     // 외접할때
        else return 2;
    }
}
