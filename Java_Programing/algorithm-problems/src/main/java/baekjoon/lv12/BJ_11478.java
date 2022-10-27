package baekjoon.lv12;

import java.io.*;
import java.util.HashSet;

public class BJ_11478 {
    static HashSet<String> set = new HashSet<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String temp = "";
        String input = br.readLine();

        for (int i = 0; i < input.length(); i++) {
            temp = "";
            for (int j = i; j < input.length(); j++) {
                temp += input.substring(j, j+1);
                set.add(temp);
            }
        }

        bw.write(set.size() + "");

        br.close();
        bw.close();
    }
}
