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
            // 스택이 비어있지 않고 현재 num 의 숫자의 값이 num[stack.peek] 보다 크기 전까지
            while(!stack.isEmpty() && (num[i] > num[stack.peek()]) )
            {   // num[stack.pop] 에 num[i] 넣어주기 (큰 수 넣어주기)
                num[stack.pop()] = num[i];
            }
            // 스택에 길이만큼의 인덱스를 push 해주기 (자연스럽게 마지막 인덱스 넣어줌.)
            stack.push(i);
        }

        // 그다음 스택에 남아있는 인덱스값을 이용해 num 에 -1 넣어주기
        while(!stack.isEmpty())
        {
            num[stack.pop()] = -1;
        }
        // sb 에 추가 후 출력해주기
        for(int i = 0; i < A; i++)
        {
            sb.append(num[i] + " ");
        }

        System.out.println(sb.toString());
    }
}
