package ch03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BJ_17299 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();


        int A = Integer.parseInt(br.readLine());    // 몇번 입력할껀지 입력받기
        int[] temp = new int[1000000];              // 빈 배열 만들기
        int[] result = new int[A];                  // A 크기만큼의 배열 만들기

        // stream 이용하여 입력받고 띄어쓰기 기준으로 나눠서 intStream 으로 변환후 배열로 변환
        int[] num = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();                         // 배열로 변환

        // 빈 배열에 순서대로 입력받은 숫자들 넣어주기
        for(int n : num)
        {
            temp[n]++;
        }


        for(int i = 0; i < A; i++)
        {   // 스택이 비어있고
            while(!stack.isEmpty() && temp[num[i]] > temp[num[stack.peek()]])
            {
                result[stack.pop()] = num[i];
            }
            stack.push(i);
        }

        while(!stack.isEmpty())
        {
            result[stack.pop()] = -1;
        }

        for(int r : result)
        {
            sb.append(r + " ");
        }
        System.out.println(sb);



    }
}
