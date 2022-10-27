package baekjoon.lv6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_2908 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int A = 0, B = 0;
        String[] input = br.readLine().split(" ");

        for (int i = 0; i < input.length; i++)
        {
            for (int j = input[i].length()-1; j >= 0; j--)
            {
                int mul = 1;
                if(j == 2) mul = 100;
                else if(j == 1) mul = 10;
                else if(j == 0) mul = 1;

                if(i == 0) A += mul * (Integer.parseInt(String.valueOf(input[i].charAt(j))));
                else  B += mul * (Integer.parseInt(String.valueOf(input[i].charAt(j))));
            }
        }

        if(A > B) System.out.println(A);
        else System.out.println(B);
    }
}
