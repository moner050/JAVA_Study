package baekjoon.unclassified;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BJ_13458 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 시험장의 개수
        int N = Integer.parseInt(br.readLine());
        // 각 시험장에 있는 응시자의 수
        int[] A = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        long result = 0L;

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        // 총 감독관이 한 시험장에서 감시할 수 있는 응시자의 수
        int B = Integer.parseInt(st.nextToken());
        // 부 감독관이 한 시험장에서 감시할 수 있는 응시자의 수
        int C = Integer.parseInt(st.nextToken());

        for (int i = 0; i < N; i++) {
            int temp = A[i];

            temp -= B;
            result++;

            if(temp < 0){
                continue;
            }
            else{
                result += (temp / C);
                if(temp % C > 0) result++;
            }
        }
        System.out.println(result);
    }
}
