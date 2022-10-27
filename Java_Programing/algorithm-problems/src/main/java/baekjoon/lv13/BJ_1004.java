package baekjoon.lv13;

import java.io.*;
import java.util.StringTokenizer;

public class BJ_1004 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());


        for (int i = 0; i < T; i++) {

            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int startX = Integer.parseInt(st.nextToken());
            int startY = Integer.parseInt(st.nextToken());
            int endX = Integer.parseInt(st.nextToken());
            int endY = Integer.parseInt(st.nextToken());

            int cnt = 0;
            int n = Integer.parseInt(br.readLine());

            for (int j = 0; j < n; j++) {

                boolean check1 = false;
                boolean check2 = false;

                st = new StringTokenizer(br.readLine(), " ");
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                int r = Integer.parseInt(st.nextToken());

                if(Math.pow(startX - x, 2) + Math.pow(startY - y, 2) > Math.pow(r, 2)) check1 = true;
                if(Math.pow(endX - x, 2) + Math.pow(endY - y, 2) > Math.pow(r, 2)) check2 = true;

                if(check1 == true && check2 == false) cnt++;
                else if(check1 == false && check2 == true) cnt++;
            }
            bw.write(cnt + "\n");
        }

        br.close();
        bw.close();
    }
}
