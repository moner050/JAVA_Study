package ch03;

import java.util.Scanner;
import java.util.Stack;

public class BJ_9012 {

    public static void foo(String s)
    {   // Stack 선언. 문자를 넣어줄것이기 때문에 Character.
        Stack<Character> stack = new Stack<>();

        int i = 0;
        // 문자의 길이만큼 반복
        while( i < s.length() )
        {   // c 에 s 의 문자열 한글자씩 넣기.
            char c = s.charAt(i);
            // ( 가 들어오면 push
            if(c == '(')
            {
                stack.push(c);
            }
            else
            {   // 스택의 사이즈가 0이면 No 출력 후 종료
                if(stack.size() < 1)
                {
                    System.out.println("NO");
                    return;
                }
                // 아니면 pop
                stack.pop();
            }
            i++;
        }
        // 만약 stack 의 사이즈가 0보다 크면 NO 출력
        if(stack.size() > 0) System.out.println("NO");
        else System.out.println("YES"); // 아니면 YES 출력

    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int T = scan.nextInt();

        for(int i = 0; i < T; i++)
        {
            foo(scan.next());
        }
    }
}
