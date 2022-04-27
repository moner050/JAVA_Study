package ch10;

import java.io.FileReader;
import java.io.IOException;

public class IOTest03 {
    public static void main(String[] args) throws IOException {
        // 특정 파일과 연결된 입력스트림을 생성한다.
        FileReader fileIn = new FileReader("data.txt");

        int data = 0;
        // 더 이상 읽을 데이터가 없을 때까지 데이터를 읽고 출력하는 작업을 반복한다.
        while ((data = fileIn.read()) != -1)
        {
            System.out.print((char) data);
        }

        // 입력 스트림을 종료한다.
        fileIn.close();
    }
}
