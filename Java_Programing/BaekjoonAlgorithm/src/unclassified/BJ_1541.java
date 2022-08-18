package unclassified;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_1541 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int sum = 1000000000;
        String[] input = br.readLine().split("-");

        for (int i = 0; i < input.length; i++) {
            int temp = 0;

            String[] numTemp = input[i].split("\\+");

            for (int j = 0; j < numTemp.length; j++) {
                temp += Integer.parseInt(numTemp[j]);
            }

            if(sum == 1000000000) sum = temp;
            else {
                sum -= temp;
            }
        }

        System.out.println(sum);

    }
}
