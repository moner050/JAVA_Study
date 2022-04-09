package ch02.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BJ_11728 {

    public static void main(String[] args) {
        // input

        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int M = scan.nextInt();

        List<Integer> A = new ArrayList<>();
        for(int i = 0; i < N; i++)
        {
            int n = scan.nextInt();
            A.add(n);
        }

        List<Integer> B = new ArrayList<>();
        for(int i = 0; i < M; i++)
        {
            int m = scan.nextInt();
            B.add(m);
        }

/*        // logic
        List<Integer> result = new ArrayList<>();

        int i = 0, j = 0; // 배열 A, B 의 인덱스
        while(i < N && j < M)
        {
            int a = A.get(i);
            int b = B.get(j);

            if(a <= b)
            {
                result.add(a);
                i++;
            }
            else
            {
                result.add(b);
                j++;
            }
        }

        for(; i < N; i++)
        {
            result.add(A.get(i));
        }

        for(; j < M; j++)
        {
            result.add(B.get(j));
        }
        StringBuilder sb = new StringBuilder();

        for(int e : result)
        {
            sb.append(e + " ");
        }

        System.out.println(sb.toString());*/

        A.forEach(e -> System.out.println(e + " "));
        B.forEach(e -> System.out.println(e + " "));
    }
}
