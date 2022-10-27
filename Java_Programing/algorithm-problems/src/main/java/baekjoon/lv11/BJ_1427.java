package baekjoon.lv11;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;

public class BJ_1427 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 입력받아 한자리씩 배열에 넣어주기.
        int[] numList = Arrays.stream(br.readLine().split("")).mapToInt(Integer::parseInt).toArray();

        // reverseOrder 사용을 위해 primitive Type 을 Wrapper 클래스로 박싱
        Integer[] reverseNumList = Arrays.stream(numList).boxed().toArray(Integer[]::new);

        // reverseOrder 를 이용해 내림차순으로 정렬
        Arrays.sort(reverseNumList, Comparator.reverseOrder());

        // 쓰고 출력해주기
        for (int n : reverseNumList){
            bw.write(n + "");
        }

        bw.close();
    }
}
