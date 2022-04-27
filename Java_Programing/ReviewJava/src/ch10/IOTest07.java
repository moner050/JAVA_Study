package ch10;

import java.io.FileWriter;
import java.io.IOException;

public class IOTest07 {
    public static void main(String[] args) throws IOException {
        // 특정 파일과 연결된 출력스트림을 생성한다.
        FileWriter writer = new FileWriter("./FWdata01.txt");

        // 데이터를 파일에 출력한다.
        // 하나의 byte 출력
        writer.write(65);

        // byte 배열 출력
        char[] data = {66, 67, 68};
        writer.write(data);

        // 한글 출력
        writer.write("대");
        writer.write('장');

        // 문자열 출력
        writer.write("킹갓");

        // 출력 스트림을 종료한다.
        writer.close();
        System.out.println("프로그램 종료");
    }
}
