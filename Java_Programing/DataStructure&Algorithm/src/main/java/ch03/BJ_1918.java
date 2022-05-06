package ch03;

import java.io.*;
import java.util.Stack;

public class BJ_1918 {

    // 우선순위
    public static int priority(char c)
    {
        switch (c)
        {
            case '*' : case '/' :
                return 2;
            case '+' : case '-' :
                return 1;
            case '(' : case ')' :
                return 0;
        }
        return -1;
    }


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        char[] input = br.readLine().toCharArray();
        Stack<Character> formula = new Stack<>();

        for (int i = 0; i < input.length; i++)
        {
            // 한글자 받아오기
            char c = input[i];
            // 우선순위 가져오기
            int pr = priority(input[i]);

            switch(c)
            {
                case '+': case '-': case '*': case '/':
                    // 현재 글자가 연산자라면 스택이 비어있지 않고, 스택에 맨 위에 있는 글자의 우선순위가
                    // 현재 글자의 우선순위보다 크거나 같을 때 까지 sb 에 스택 맨 위에 있는 글자 넣어주기
                    while(!formula.isEmpty() && priority(formula.peek()) >= pr)
                    {
                        sb.append(formula.pop());
                    }
                    // 받아온 글자를 스택에 push
                    formula.push(c);
                    break;
                case '(' :
                    // 현재 글자가 여는 괄호라면 일단 push
                    formula.push(c);
                    break;
                case ')' :
                    // 현재 글자가 닫는 괄호라면 스택의 맨 위에 글자가 ( 가 아니고,
                    // 스택이 비어있지 않을 때 까지 sb 에 pop 시켜주기
                    while(!formula.isEmpty() && formula.peek() != '(')
                    {
                        sb.append(formula.pop());
                    }
                    // 그러면 스택의 맨 마지막에 ( 가 남을테니 ( 를 삭제시켜주기
                    formula.pop();
                    break;
                default:
                    // 현재 글자가 그냥 알파벳이라면 sb 에 넣어주기
                    sb.append(c);
            }
        }

        // 스택에 남아있는 특수기호들 모조리 sb 에 넣어주고 출력
        while(!formula.isEmpty())
        {
            sb.append(formula.pop());
        }
        bw.write(sb + "");
        bw.close();
    }
}
