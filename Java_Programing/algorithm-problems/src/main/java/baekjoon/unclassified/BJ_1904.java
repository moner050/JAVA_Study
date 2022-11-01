package baekjoon.unclassified;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_1904 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        long[] arr = new long[1000000 + 1];
        
        arr[1] = 1;
        arr[2] = 2;
        arr[3] = 3;
        arr[4] = 5;

        for (int i = 4; i <= 1000000; i++) {
            arr[i] = (arr[i - 1] + arr[i - 2]) % 15746;
        }

        System.out.println(arr[N]);
    }
}
