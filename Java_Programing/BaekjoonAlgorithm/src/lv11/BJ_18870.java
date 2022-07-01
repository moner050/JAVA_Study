package lv11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class BJ_18870 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 몇회 입력할껀지 입력받기
        int N = Integer.parseInt(br.readLine());

        // 실제 좌표와 정렬할 좌표와 순서를 매길 좌표 설정
        int[] input = new int[N];
        int[] sortInput = new int[N];
        HashMap<Integer, Integer> inputMap = new HashMap<>();
        int cnt = 0;

        // 좌표 입력받기
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < N; i++)
        {   // 실제 좌표와 정렬할 좌표에 입력받은 좌표 넣어주기
            input[i] = sortInput[i] = Integer.parseInt(st.nextToken());
        }

        // sortInput 정렬시키기
        Arrays.sort(sortInput);

        for (int c : sortInput){
            // 만약 inputMap 에 c라는 키값을 가지고 있지 않으면 넣어주고 cnt 증가
            if(!inputMap.containsKey(c)) inputMap.put(c, cnt++);
        }

        for (int i : input){
            // 원본 배열의 key 값에 대한 value 가져와서 bw 에 쓰고 출력해주기
            int number = inputMap.get(i);
            bw.write(number + " ");
        }
        bw.close();
    }

}
