package baekjoon.lv6;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BJ_1152 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int cnt = 0;
        String input = br.readLine();

        Pattern pattern = Pattern.compile("([\\uAC00-\\uD7A3a-zA-Z0-9가-힣])+");
        Matcher matcher = pattern.matcher(input);

        while(matcher.find())
        {
            matcher.group();
            cnt++;
        }
        bw.write(cnt + "");
        bw.close();
    }
}
