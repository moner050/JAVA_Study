package lv12;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.StringTokenizer;

public class BJ_14425 {

    static HashMap<String, Integer> map = new HashMap<>();
    static int N, M;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int cnt = 0;

        // N 과 M 입력받기.
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        // map 에 N 번만큼 key 값을 넣어준다.
        for (int i = 0; i < N; i++) {
            map.put(br.readLine(), 1);
        }

        // 문자열을 입력 받고 map 에 key 값과 같은 문자열이 있으면 cnt 증가
        for (int i = 0; i < M; i++) {
            String text = br.readLine();
            if(map.get(text) != null) cnt++;
        }
        
        // cnt 쓰고 출력
        bw.write(cnt + "");
        bw.close();
    }
}
