package lv13;

import java.io.*;

public class BJ_3053 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int r = Integer.parseInt(br.readLine());

        double uclid = (r * r * Math.PI);
        double taxi = (2 * r * r);

        bw.write(uclid + "\n" + taxi);
        br.close();
        bw.close();
    }
}
