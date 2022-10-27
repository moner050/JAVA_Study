package baekjoon.lv13;

import java.io.*;
import java.util.Arrays;

public class BJ_4153 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] triangles;

        while(true){
            triangles = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).sorted().toArray();

            int x = triangles[0], y = triangles[1], z = triangles[2];

            if(x == 0 && y == 0 && z == 0) break;

            if((z * z) == ((x * x) + (y * y))) bw.write("right\n");
            else bw.write("wrong\n");

            bw.flush();
        }

        br.close();
        bw.close();

    }
}
