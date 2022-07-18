package lv12;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.StringTokenizer;

public class BJ_10816 {

    static HashMap<Integer, Integer> map = new HashMap<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 상근이의 숫자카드 개수 구하기
        int N = Integer.parseInt(br.readLine());

        // 상근이의 숫자카드 입력 받고 map 에 넣어주기
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            int key = Integer.parseInt(st.nextToken());

            map.put(key, map.getOrDefault(key, 0) + 1);
        }

        // 숫자카드가 적혀있는 정수 개수
        int M = Integer.parseInt(br.readLine());

        // 숫자카드 입력 받고 map 에서 key 값이 있으면 개수 넣어주고 없으면 0 넣어주기
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < M; i++) {
            int key = Integer.parseInt(st.nextToken());

            bw.write(map.getOrDefault(key, 0) + " ");
        }

        br.close();
        bw.close();
    }


}
