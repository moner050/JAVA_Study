package unclassified;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class BJ_13305 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        long[] length = new long[N];
        long[] oil = new long[N];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N - 1; i++) {
            length[i] = Long.parseLong(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            oil[i] = Long.parseLong(st.nextToken());
        }

        long minCost = length[0] * oil[0];
        long minOil = oil[0];

        for (int i = 1; i < N; i++) {
            if(minOil > oil[i]){
                minOil = oil[i];
            }
            minCost += (minOil * length[i]);
        }
        System.out.println(minCost);
    }
}
