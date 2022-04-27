package ch10;

import java.io.*;

public class IOTest08 {
    public static void main(String[] args) throws IOException {
        // 특정 파일과 연결된 입/출력스트림을 생성한다.
        FileReader reader = new FileReader("./score_data.txt");
        BufferedReader buffReader = new BufferedReader(reader);

        FileWriter writer = new FileWriter("./stat_data.txt");
        BufferedWriter buffWriter = new BufferedWriter(writer);

        String data = null;
        int totalCount = 0;

        while ((data = buffReader.readLine()) != null)
        {
            String[] scoreList = data.split(",");
            int sum = 0;
            for(String score : scoreList)
            {
                sum += Integer.parseInt(score);
                totalCount++;
            }
            buffWriter.write(data + ",\t 총점 = " + sum + "\n");
        }

        buffWriter.write("시험에 응시한 학생 수 : " + totalCount);
        buffWriter.flush();

        // 입/출력 스트림 종료
        reader.close();
        buffReader.close();

        writer.close();
        buffReader.close();
        System.out.println("입/출력 프로그램 종료");
    }
}
