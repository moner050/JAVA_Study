package baekjoon.lv12;

import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class BJ_1620 {

    static HashMap<String, Integer> map = new HashMap<>();
    static int N, M;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // N 과 M 입력받기.
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        // 포켓몬의 이름을 담을 배열 생성
        String[] pocket = new String[N + 1];

        // 포켓몬 이름 입력받기.
        for (int i = 1; i <= N; i++) {
            String temp = br.readLine();
            map.put(temp, i);
            pocket[i] = temp;
        }

        // 포켓몬 이름 또는 인덱스가 주어지면 그에 맞는 출력 하게 설정.
        for (int i = 0; i < M; i++) {
            String input = br.readLine();
            // 만약 숫자(인덱스)가 입력되면 포켓몬 이름 출력
            if(isString(input)){
                int idx = Integer.parseInt(input);
                bw.write(pocket[idx] + "\n");
            }// 아니면 포켓몬 인덱스 출력
            else bw.write(map.get(input) + "\n");
        }
        br.close();
        bw.close();
    }

    // 문자열인지 아닌지 판단
    public static boolean isString(String s){
        try{
            Double.parseDouble(s);
            return true;
        }
        catch (NumberFormatException e){
            return false;
        }
    }
}
