package lv3;

import java.io.*;

public class BJ_1110 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
//        int result = 0, cnt = 0, goal = num;
//        int newNum = 0;
//
//        while(true)
//        {
//            result = (num / 10) + (num % 10);
//            newNum = ((num % 10) * 10) + (result % 10);
//            cnt++;
//            num = newNum;
//            if(newNum == goal) break;
//        }
//
//        bw.write(cnt + "");
//        bw.close();

        // 메모리는 이게 덜 차지한다.
        int ten = 0, one = 0, cnt = 0, goal = 0;
        int newNum = 0;

        while(goal != num)
        {
            if(cnt == 0)
            {
                ten = num/10;
                one = num%10;
            }
            else
            {
                ten = goal / 10;
                one = goal % 10;
            }
            newNum = ((one * 10) + (ten+one)) % 10;
            goal = (one * 10) + newNum;
            cnt++;
        }
        if(cnt == 0) cnt++;
        bw.write(cnt + "");
        bw.close();
    }
}
