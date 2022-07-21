package lv12;

import java.io.*;
import java.util.*;

public class BJ_1764 {

    static HashMap<String, String> map = new HashMap<>();
    static int N, M;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        List<String> arr = new ArrayList<>();
        int cnt = 0;

        for (int i = 0; i < N; i++) {
            String text = br.readLine();
            map.put(text, text);
        }

        for (int i = 0; i < M; i++) {
            String unknown = br.readLine();
            if(unknown.equals(map.get(unknown))){
                arr.add(unknown);
                cnt++;
            }
        }

        Collections.sort(arr);

        bw.write(cnt + "\n");

        for(String s : arr){
            bw.write(s + "\n");
        }

        br.close();
        bw.close();
    }
}
