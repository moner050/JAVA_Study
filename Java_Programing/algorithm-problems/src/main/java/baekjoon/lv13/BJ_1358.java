package baekjoon.lv13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_1358 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int cnt = 0;
        int W = Integer.parseInt(st.nextToken());
        int H = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());
        int Y = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());

        int radius = H / 2;

        for (int i = 0; i < P; i++) {
            st = new StringTokenizer(br.readLine(), " ");

            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            // 직사각형 내부에 있을 경우, 양쪽 원 내부에 있을경우
            if((X <= x && x <= (X+W) && Y <= y && y <= (Y+H))
                    || getDistance(x, y, X, (Y + radius)) <= radius
                    || getDistance(x, y, (X+W), (Y + radius)) <= radius){
                cnt++;
            }
        }
        System.out.println(cnt);
    }

    static double getDistance(int x1, int y1, int x2, int y2){
        return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2 , 2));
    }
}
