package lv14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BJ_5086 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true){
            int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

            boolean factor = false;
            boolean multiple = false;

            int num1 = arr[0];
            int num2 = arr[1];

            if(num1 == 0 && num2 == 0) break;

            if(num1 % num2 == 0) factor = true;
            else if(num2 % num1 == 0) multiple = true;

            if(factor && !multiple) System.out.println("multiple");
            else if(!factor && multiple) System.out.println("factor");
            else System.out.println("neither");
        }
    }
}
