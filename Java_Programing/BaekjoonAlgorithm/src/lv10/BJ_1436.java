package lv10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BJ_1436 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int N = Integer.parseInt(br.readLine());
    int lastNum = 666, cnt = 1;

    while(cnt != N)
    {
        lastNum++;
        if(String.valueOf(lastNum).contains("666")) cnt++;
    }

    bw.write(lastNum + "");
    bw.close();
  }
}
