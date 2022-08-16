package unclassified;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BJ_2012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        long[] scores = new long[N];
        long angry = 0L;

        for (int i = 0; i < N; i++) {
            scores[i] = Long.parseLong(br.readLine());
        }

        Arrays.sort(scores);

        for (int i = 0; i < N; i++) {
            angry += Math.abs(scores[i] - (i + 1));
        }

        System.out.println(angry);
    }
}
