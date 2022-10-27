package baekjoon.lv12;

import java.io.*;
import java.util.HashSet;
import java.util.StringTokenizer;

public class BJ_1269 {
    static int cnt = 0;
    static HashSet<Integer> mapA = new HashSet<>();
    static HashSet<Integer> mapB = new HashSet<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < A; i++) {
            mapA.add(Integer.parseInt(st.nextToken()));
        }

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < B; i++) {
            mapB.add(Integer.parseInt(st.nextToken()));
        }

        for (int a : mapA){
            if(!mapB.contains(a)) cnt++;
        }

        for (int b : mapB){
            if(!mapA.contains(b)) cnt++;
        }

        bw.write(cnt + "");
        br.close();
        bw.close();
    }
}
