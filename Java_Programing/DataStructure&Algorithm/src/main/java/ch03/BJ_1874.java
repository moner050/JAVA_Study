package ch03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BJ_1874 {
    /*
    스택 (stack)은 기본적인 자료구조 중 하나로, 컴퓨터 프로그램을 작성할 때 자주 이용되는 개념이다.
    스택은 자료를 넣는 (push) 입구와 자료를 뽑는 (pop) 입구가 같아
    제일 나중에 들어간 자료가 제일 먼저 나오는 (LIFO, Last in First out) 특성을 가지고 있다.
    1부터 n까지의 수를 스택에 넣었다가 뽑아 늘어놓음으로써, 하나의 수열을 만들 수 있다.
    이때, 스택에 push하는 순서는 반드시 오름차순을 지키도록 한다고 하자.
    임의의 수열이 주어졌을 때 스택을 이용해 그 수열을 만들 수 있는지 없는지,
    있다면 어떤 순서로 push와 pop 연산을 수행해야 하는지를 알아낼 수 있다. 이를 계산하는 프로그램을 작성하라.
     */

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int chkNum = 1;

        int N = Integer.parseInt(br.readLine());

        int numList[] = new int[N];
        boolean chk = true;

        for(int i = 0; i < N; i++)
        {   // 일단 numList 의 i 번째에 숫자를 집어넣고
            numList[i] = Integer.parseInt(br.readLine());

            // chk 가 true 일때 배열의 숫자를 검사.
            if(chk)
            {   // 임의로 설정해둔 chkNum 이 numList[i]보다 작거나 같으면
                if(chkNum <= numList[i])
                {   // chkNum 이 numList[i]보다 작거나 같을때 까지
                    while(chkNum <= numList[i])
                    {   // stack 에 chkNum 을 후치연산 하면서 push 하고 sb에 문자열 추가
                        stack.push(chkNum++);
                        sb.append("+ \n");
                    }
                }

                // 만약 스택이 비었다면 검사종료.
                if(stack.isEmpty()) chk = false;
                else // 비어있지 않다면
                {   // stack 에 맨 위에 있는 숫자가 numList[i]보다 크거나 같을때까지
                    while(stack.peek() >= numList[i])
                    {   // stack에서 pop 을 해서 빼주고 sb에 문자열 추가
                        stack.pop();
                        sb.append("- \n");
                        // 만약 스택이 비었다면 종료.
                        if(stack.isEmpty()) break;
                    }
                }
            }
        }
        // chk가 true가 아니면 sb출력
        if(chk) System.out.println(sb.toString());
        else System.out.println("NO");      // 아님 NO 출력



    }

}
