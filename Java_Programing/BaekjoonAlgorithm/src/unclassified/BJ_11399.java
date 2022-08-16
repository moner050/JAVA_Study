package unclassified;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BJ_11399 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int min = 0;
        int N = Integer.parseInt(br.readLine());
        int[] minutes = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).sorted().toArray();

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < i + 1; j++) {
                min += minutes[j];
            }
        }

        System.out.println(min);
    }
}
