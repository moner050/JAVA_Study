package baekjoon.lv4;

import java.io.*;
import java.util.Arrays;

public class BJ_4344 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int C = Integer.parseInt(br.readLine());

        for(int i = 0; i < C; i++)
        {
            int cnt = 0;
            double sum = 0.0, avg = 0.0, stdDoubleAvg = 0.0;
            // 학생 정보를 받아오기.
            double[] studentInfo = Arrays.stream(br.readLine().split(" ")).mapToDouble(Double::parseDouble).toArray();
            int num = (int)studentInfo[0];

            // 학생들의 점수를 더한다음
            for (int j = 1; j < studentInfo.length; j++)
            {
                sum += studentInfo[j];
            }
            // 학생 전체의 평균을 구하고
            avg = sum / (double)num;
            // 학생 전체보다 평균이 높은사람을 센다음
            for (int j = 1; j < studentInfo.length; j++)
            {
                if(studentInfo[j] > avg) cnt++;
            }
            // 평균이 높은사람 / 학생 전체 * 100 을 해서 평균을 낸다.
            stdDoubleAvg = ((double)cnt /(double)num) * 100.0;

            // 그리고 소수점 3째자리까지 출력을 위해 String.format 사용
            String stdAvg = String.format("%.3f", stdDoubleAvg);
            bw.write(stdAvg + "%\n");
        }
        bw.close();
    }
}
