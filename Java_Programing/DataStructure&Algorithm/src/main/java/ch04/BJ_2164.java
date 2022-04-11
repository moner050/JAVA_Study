package ch04;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BJ_2164 {

    public static void main(String[] args) {
        // input
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();

        Queue<Integer> queue = new LinkedList<>();

        for(int i = 0; i < N; i++)
        {
            queue.add(i + 1);
        }

        int cnt = 1;
        while(queue.size() != 1)
        {
            int q = queue.poll();
            if(cnt % 2 == 0) queue.offer(q);

            System.out.println(cnt + "->" + queue);
            cnt++;
        }

        System.out.println(queue.peek());
    }
}
