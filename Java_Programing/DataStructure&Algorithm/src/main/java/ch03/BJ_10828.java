package ch03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BJ_10828 {
    /*
    정수를 저장하는 스택을 구현한 다음, 입력으로 주어지는 명령을 처리하는 프로그램을 작성하시오.
    명령은 총 다섯 가지이다.

    push X: 정수 X를 스택에 넣는 연산이다.
    pop: 스택에서 가장 위에 있는 정수를 빼고, 그 수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
    size: 스택에 들어있는 정수의 개수를 출력한다.
    empty: 스택이 비어있으면 1, 아니면 0을 출력한다.
    top: 스택의 가장 위에 있는 정수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
    */

    public static void main(String[] args) throws IOException {
        Stack<Integer> stack = new Stack<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // int 형태로 파싱
        int N = Integer.parseInt(br.readLine());

        int i = 0;
        while( i < N )
        {
            String commands[] = br.readLine().split(" ");
            String command = commands[0];

            if(command.equals("push") && commands.length == 2)
            {
//                System.out.println("push -> "+commands[1]);
                stack.add(Integer.valueOf(commands[1]));
            }
            if(command.equals("pop"))
            {
                if(stack.isEmpty()) System.out.println(-1);
                else System.out.println(stack.pop());
            }
            if(command.equals("size"))
            {
                System.out.println(stack.size());
            }
            if(command.equals("empty"))
            {
                if(stack.isEmpty()) System.out.println(1);
                else System.out.println(0);
            }
            if(command.equals("top"))
            {
                if(stack.isEmpty()) System.out.println(-1);
                else System.out.println(stack.peek());
            }
            i++;
        }
    }
}
