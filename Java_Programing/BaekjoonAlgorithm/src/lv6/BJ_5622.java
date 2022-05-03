package lv6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_5622 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] dial = {"ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ"};
        String[] input = br.readLine().split("");
        int time = 0, total = 0;

        for (int i = 0; i < dial.length; i++)
        {
            String[] text = dial[i].split("");
            for(String chk : input)
            {
                for (int j = 0; j < dial[i].length(); j++)
                {
                    if(chk.equals(text[j])) time = (i+3);
                }
                total += time;
                time = 0;
            }
        }
        System.out.println(total);
    }
}
