package ch05;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class BJ_1920 {

    public static void main(String[] args) {
        //input

        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        Set<Integer> A = new HashSet<>();
        for(int i = 0; i < N; i++)
        {
            int n = scan.nextInt();
            A.add(n);
        }

        StringBuilder result = new StringBuilder();

        int M = scan.nextInt();
        for(int i = 0; i < M; i++)
        {
            int m = scan.nextInt();
            // 만약 A에 m이 포함되어있다면 1, 아님 0
            if(A.contains(m)) result.append(1 + "\n");
            else result.append(0 + "\n");
        }

        System.out.println(result);
    }


}
