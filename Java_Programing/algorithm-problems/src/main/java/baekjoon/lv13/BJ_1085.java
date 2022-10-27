package baekjoon.lv13;

import java.io.*;
import java.util.StringTokenizer;

public class BJ_1085 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int x, y, w, h;
        x = Integer.parseInt(st.nextToken());
        y = Integer.parseInt(st.nextToken());
        w = Integer.parseInt(st.nextToken());
        h = Integer.parseInt(st.nextToken());

        int x_min = Math.min(x, w-x);
        int y_min = Math.min(y, h-y);

        bw.write(Math.min(x_min, y_min) + "");

        br.close();
        bw.close();
    }
}
