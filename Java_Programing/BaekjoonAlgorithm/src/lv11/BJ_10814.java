package lv11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BJ_10814 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 몇회 입력받을지
        int N = Integer.parseInt(br.readLine());
        String[][] people = new String[N][2];

        // people 배열에 입력받은 값들을 넣어준다.
        for (int i = 0; i < N; i++)
        {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            people[i][0] = st.nextToken();
            people[i][1] = st.nextToken();
        }

        // 그리고 나이순으로 정렬시켜준다.
        Arrays.sort(people, (s1, s2) -> {
            return Integer.parseInt(s1[0]) - Integer.parseInt(s2[0]);
        });

        // people 배열을 bw에 쓰고 출력.
        for (int i = 0; i < N; i++) {
            bw.write(people[i][0] + " " + people[i][1] + "\n");
        }
        bw.close();

    }

}
