package lv4;

import java.io.*;
import java.util.Arrays;

public class BJ_1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        double sum = 0.0;

        double[] scores = Arrays.stream(br.readLine().split(" ")).mapToDouble(Double::parseDouble).toArray();
        double max = Arrays.stream(scores).max().getAsDouble();

        for(int i = 0; i < N; i++)
        {
            sum += ((scores[i]/max) * 100);
        }

        double avg = sum / (double)N;
        bw.write(avg + "");
        bw.close();
    }
}
