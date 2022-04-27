package ch03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class BJ_17298 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        Integer A = Integer.parseInt(br.readLine());
        int[] num = new int[A];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for(int i = 0; i < A; i++)
        {
            num[i] = Integer.parseInt(st.nextToken());
        }

        for(int i = 0; i < A; i++)
        {
            // 스택이 비어있지 않고 현재 num 의 숫자의 값이 num[stack.peek] 보다 클때까지
            while(!stack.isEmpty() && (num[i] > num[stack.peek()]) )
            {   // num 의 stack.pop
                num[stack.pop()] = num[i];
            }
            // 스택에 길이만큼의 인덱스를 push 해주기
            stack.push(i);
        }


        while(!stack.isEmpty())
        {
            num[stack.pop()] = -1;
        }

        for(int i = 0; i < A; i++)
        {
            sb.append(num[i] + " ");
        }

        System.out.println(sb.toString());
    }
}
