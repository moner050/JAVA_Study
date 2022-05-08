package lv7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_10250 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++)
        {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int room = 0;
            int H = Integer.parseInt(st.nextToken());
            int W = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());

            if(N % H == 0) room = (H * 100) + (N / H);
            else room = ((N % H) * 100) + ((N / H) + 1);

            System.out.println(room);
        }
    }
}
