package ch04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class BJ_10845 {

    /*
    정수를 저장하는 큐를 구현한 다음, 입력으로 주어지는 명령을 처리하는 프로그램을 작성하시오.

    명령은 총 여섯 가지이다.

    push X: 정수 X를 큐에 넣는 연산이다.
    pop: 큐에서 가장 앞에 있는 정수를 빼고, 그 수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
    size: 큐에 들어있는 정수의 개수를 출력한다.
    empty: 큐가 비어있으면 1, 아니면 0을 출력한다.
    front: 큐의 가장 앞에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
    back: 큐의 가장 뒤에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.

    첫째 줄에 주어지는 명령의 수 N (1 ≤ N ≤ 10,000)이 주어진다. 둘째 줄부터 N개의 줄에는 명령이 하나씩 주어진다.
    주어지는 정수는 1보다 크거나 같고, 100,000보다 작거나 같다. 문제에 나와있지 않은 명령이 주어지는 경우는 없다.
     */

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 몇번 수행할껀지 입력받기
        int N = Integer.parseInt(br.readLine());
        Queue<Integer> queue = new LinkedList<>();
        int last = 0;

        while(N-- > 0)
        {   // 커멘드 입력받기
            String[] cmds = br.readLine().split(" ");

            // push 가 입력되면
            if(cmds[0].equals("push"))
            {   // cmds 의 두번째 배열을 last 에 넣고
                last = Integer.valueOf(cmds[1]);
                // queue 에 넣기
                queue.offer(last);
            }
            else if(cmds[0].equals("pop"))  // pop 이 입력 되었는데
            {   // queue 가 비어있다면 -1 출력
                if(queue.isEmpty()) System.out.println("-1");
                // 아니면 제일 먼저 넣은 값 빼기.
                else System.out.println(queue.poll());
            }
            else if(cmds[0].equals("size")) System.out.println(queue.size()); // size 를 입력받으면 queue 의 사이즈 출력
            else if(cmds[0].equals("empty")) // empty 를 입력 받았는데
            {   // queue 가 비어있다면 1 출력
                if(queue.isEmpty()) System.out.println("1");
                // 아니면 0 출력
                else System.out.println("0");
            }
            else if(cmds[0].equals("front")) // front 를 입력 받았는데
            {   // queue 가 비어있다면 -1 출력
                if(queue.isEmpty()) System.out.println("-1");
                // 아니면 가장 앞에 있는 정수 출력
                else System.out.println(queue.peek());
            }
            else if(cmds[0].equals("back")) // back 를 입력 받았는데
            {   // queue 가 비어있다면 -1 출력
                if(queue.isEmpty()) System.out.println("-1");
                else  // 아니면 queue 의 가장 뒤에 있는 정수 출력
                {   // 가장 마지막에 push 한 값인 last 를 출력.
                    System.out.println(last);
                }
            }
        }
    }
}
