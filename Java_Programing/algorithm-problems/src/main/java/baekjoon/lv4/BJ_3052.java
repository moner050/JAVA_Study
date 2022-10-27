package baekjoon.lv4;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class BJ_3052 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < 10; i++)
        {
            int num = Integer.parseInt(br.readLine());
            list.add(num % 42);
        }
        // 리스트 중복제거
        List<Integer> sortList = list.stream().distinct().collect(Collectors.toList());

        bw.write(sortList.size() + "");
        bw.close();
    }
}
