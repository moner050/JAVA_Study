package baekjoon.lv11;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;

public class BJ_1181 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 몇개의 단어를 넣을지 설정
        int N = Integer.parseInt(br.readLine());
        String[] text = new String[N];

        // 문자열 입력받아 배열에 넣어주기
        for (int i = 0; i < N; i++)
        {
            text[i] = br.readLine();
        }

        // 문자열 중복 제거
        String[] distinctText = Arrays.stream(text).distinct().toArray(String[]::new);
        // 문자열 오름차순 및 사전순 정렬
        Arrays.sort(distinctText, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length() == o2.length()) return o1.compareTo(o2);
                else return o1.length() - o2.length();
            }
        });

        // 결과값 출력
        for (String s : distinctText){
            bw.write(s + "\n");
        }
        bw.close();
    }

}
