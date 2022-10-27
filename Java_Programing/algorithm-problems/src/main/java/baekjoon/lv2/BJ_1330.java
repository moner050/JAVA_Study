package baekjoon.lv2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BJ_1330 {
    public static void main(String[] args) throws IOException {
//        두 정수 A와 B가 주어졌을 때, A와 B를 비교하는 프로그램을 작성하시오.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 띄어쓰기 기준으로 나눈 뒤 Integer 형태로 변환후 배열 재생성
        int[] arr = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        if(arr[0] > arr[1]) System.out.println(">");
        else if(arr[0] < arr[1]) System.out.println("<");
        else System.out.println("==");
    }
}
