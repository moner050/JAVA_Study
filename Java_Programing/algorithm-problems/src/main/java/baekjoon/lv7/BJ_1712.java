package baekjoon.lv7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_1712 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int cnt = 1;

        // 고정비용
        int A = Integer.parseInt(st.nextToken());
        // 재료비, 인건비
        int B = Integer.parseInt(st.nextToken());
        // 가격
        int C = Integer.parseInt(st.nextToken());

        if(B >= C) System.out.println("-1");
        else System.out.println((int)(A/(C-B) + 1));
    }
}
