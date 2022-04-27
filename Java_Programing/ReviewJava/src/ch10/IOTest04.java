package ch10;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class IOTest04 {
    public static void main(String[] args) throws IOException {
        // 특정 파일과 연결된 입력스트림을 생성한다.
        FileReader reader = new FileReader("./src/ch10/IOTest04.java");
        BufferedReader buffReader = new BufferedReader(reader);

        int data = 0;
        // 더 이상 읽을 데이터가 없을 때까지 데이터를 읽고 출력하는 작업을 반복한다.
        long start = System.currentTimeMillis();
        while ((data = buffReader.read()) != -1)
        {
            System.out.print((char)data);
        }
        long end = System.currentTimeMillis();
        // 입력 스트림을 종료한다.
        reader.close();
        buffReader.close();

        System.out.println("소요된 시간 : " + (end - start) + "(ms)초");
    }
}
