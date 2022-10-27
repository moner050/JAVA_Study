package baekjoon.lv3;

import java.io.*;
import java.util.StringTokenizer;

public class BJ_10951 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        String temp;

        while( (temp = br.readLine()) != null )
        {
            StringTokenizer st = new StringTokenizer(temp, " ");

            int fst = Integer.parseInt(st.nextToken());
            int scd = Integer.parseInt(st.nextToken());
            sb.append(fst+scd + "\n");
        }
        bw.write(sb + "");
        bw.close();
    }
}
