package baekjoon.unclassified;

import java.io.*;
import java.util.Stack;

public class BJ_1935 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 피연산자 개수 입력받기
        int N = Integer.parseInt(br.readLine());
        // 피연산자 개수만큼 배열 만들기
        int[] numArr = new int[N];
        // 연산후 값을 넣어줄 stack 생성
        Stack<Double> stack = new Stack<>();

        // 후위표기식 입력받기
        char[] answer = br.readLine().toCharArray();

        // 숫자 입력받기
        for (int i = 0; i < N; i++)
        {
            numArr[i] = Integer.parseInt(br.readLine());
        }

        for (int i = 0; i < answer.length; i++)
        {   // temp 에 입력받은 후위표기식 넣어주기
            char temp = answer[i];
            // 만약 temp 가 알파벳이면 스택에 숫자 넣어주기
            if(temp >= 'A' && temp <= 'Z') stack.push((double)numArr[temp - 'A']);
            else
            {   // 연산 기호라면 num1, num2 에 stack 에 넣어준 숫자를 pop 해주고
                double num2 = stack.pop();
                double num1 = stack.pop();
                // 연산 후 스택에 넣어주기.
                switch(temp)
                {
                    case '+' :
                        stack.push(num1 + num2);
                        break;
                    case '-' :
                        stack.push(num1 - num2);
                        break;
                    case '*' :
                        stack.push(num1 * num2);
                        break;
                    case '/' :
                        stack.push(num1 / num2);
                        break;
                }
            }
        }
        bw.write(String.format("%.2f", stack.pop()));
        bw.close();
    }
}
