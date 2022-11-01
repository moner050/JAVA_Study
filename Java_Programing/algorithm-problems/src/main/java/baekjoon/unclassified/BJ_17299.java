package baekjoon.unclassified;

import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class BJ_17299 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Stack<Integer> stack = new Stack<>();

        // 수열의 크기 입력받기
        int A = Integer.parseInt(br.readLine());
        // 수열의 크기만큼 배열 생성
        int[] temp = new int[A];
        // 수열의 값이 몇번 나왔나 체크할 배열 생성
        int[] check = new int[1000001];

        // 수열의 원소 값 입력받기
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        // 배열에 수열 넣어주기
        for (int i = 0; i < temp.length; i++)
        {
            temp[i] = Integer.parseInt(st.nextToken());
        }

        for(int n : temp)
        {   // 입력받은 원소의 숫자 인덱스 증가시키기
            check[n]++;
        }

        for (int i = 0; i < A; i++)
        {   // 스택이 비어있지 않고 스택에 최근에 넣어준 인덱스의 check 값이 현재 인덱스의 check 값보다 작으면
            while(!stack.isEmpty() && check[temp[stack.peek()]] < check[temp[i]])
            {   // temp 의 스택에 최근에 넣어준 순서대로의 인덱스에 temp[i] 를 넣어준다.
                temp[stack.pop()] = temp[i];
            }
            // 스택에 인덱스 push
            stack.push(i);
        }

        // 남아있는 stack 의 값을 pop 시켜서 해당 인덱스 -1로 지정해주기
        while(!stack.isEmpty())
        {
            temp[stack.pop()] = -1;
        }

        // temp 에 있는 값 bw 에 넣어주기.
        for (int i = 0; i < temp.length; i++)
        {
            bw.write(temp[i] + " ");
        }
        // 출력
        bw.close();
    }
}
