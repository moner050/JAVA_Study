package ch03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_9093 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        // 무지성 3중 for 문으로 글자 반대로 출력하기
        for(int i = 0; i < T; i++)
        {
            String reverse = "";
            String comment = br.readLine();
            String comments[] = comment.split(" ");

            for(int j = 0; j < comments.length; j++)
            {
                for(int k = comments[j].length() - 1; k >= 0; k--)
                {
                    reverse += comments[j].charAt(k);
                }
                reverse += " ";
            }
            System.out.println(reverse);
        }
    }

}
