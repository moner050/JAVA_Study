package baekjoon.unclassified;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_1543 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String text = br.readLine();
        String input = br.readLine();

        int textLength = text.length();

        text = text.replace(input, "");
        System.out.println((textLength - text.length()) / input.length());
    }
}
