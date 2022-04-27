package ch10;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class IOTest05 {
    public static void main(String[] args) throws IOException {
        // 특정 파일과 연결된 입력스트림을 생성한다.
        FileReader reader = new FileReader("./score_data.txt");
        BufferedReader buffReader = new BufferedReader(reader);

        String data = null;
        int totalCount = 0;

        while ((data = buffReader.readLine()) != null)
        {
            String[] scoreList = data.split(",");
            int sum = 0;
            for(String score : scoreList)
            {
                sum += Integer.parseInt(score);
            }
            System.out.println(data + ",\t 총점 = " + sum);
            totalCount++;
        }
        System.out.println("시험에 응시한 학생 수 : " + totalCount);

        // 입력 스트림을 종료한다.
        reader.close();
        buffReader.close();
    }
}
