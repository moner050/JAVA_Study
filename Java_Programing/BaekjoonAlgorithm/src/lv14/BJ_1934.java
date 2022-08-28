package lv14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_1934 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            int min = gcd(A, B);
            int total_min = (A * B) / min;

            System.out.println(total_min);
        }
    }

    public static int gcd(int a, int b){

        while(b != 0){
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }

}
