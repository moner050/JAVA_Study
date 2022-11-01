package baekjoon.unclassified;

import java.io.*;

public class BJ_9095 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            bw.write(recursion(Integer.parseInt(br.readLine())) + "\n");
        }
        br.close();
        bw.close();
    }

    static int recursion(int num){
        if(num == 1) return 1;
        else if(num == 2) return 2;
        else if(num == 3) return 4;

        return recursion(num - 1) + recursion(num - 2) + recursion(num - 3);
    }
}


