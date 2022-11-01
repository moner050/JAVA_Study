package baekjoon.unclassified;

import java.io.*;

public class BJ_10820 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while(true)
        {
            String input = br.readLine();

            if(input == null) break;

            int lower = 0, upper = 0, number = 0, space = 0;

            for (int i = 0; i < input.length(); i++)
            {
                if(Character.isLowerCase(input.charAt(i))) lower++;
                else if(Character.isUpperCase(input.charAt(i))) upper++;
                else if(Character.isSpaceChar(input.charAt(i))) space++;
                else number++;
            }
            bw.write(lower + " " + upper + " " + number + " " + space + "\n");
            bw.flush();
        }
        bw.close();
        br.close();
    }
}
