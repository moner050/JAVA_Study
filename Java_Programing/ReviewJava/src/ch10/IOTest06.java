package ch10;

import java.io.FileOutputStream;
import java.io.IOException;

public class IOTest06 {
    public static void main(String[] args) throws IOException {
        // 특정 파일과 연결된 출력스트림을 생성한다.
        FileOutputStream fileOut = new FileOutputStream("./FOSdata01.txt");

        // 데이터를 파일에 출력한다.
        // 하나의 byte 출력
        fileOut.write(65);

        // byte 배열 출력
        byte[] data = {66, 67, 68};
        fileOut.write(data);

        // 한글 출력
        fileOut.write('한');
        fileOut.write('글');

        // 출력 스트림을 종료한다.
        fileOut.close();
        System.out.println("프로그램 종료");
    }
}
