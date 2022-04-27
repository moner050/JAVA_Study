package ch10;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

public class PropertiesTest01 {
    public static void main(String[] args) throws IOException {
        // application.properties 파일 로딩
        FileReader prosReader = new FileReader("./application.properties");
        Properties props = new Properties();
        props.load(prosReader);
        String scoreFile = props.getProperty("application.scorefile");

        // File 객체를 이용하여 Scanner를 생성한다.
        File file = new File(scoreFile);
        Scanner scanner = new Scanner(file);

        // 파일의 내용을 라인 단위로 출력한다.
        System.out.println(file.getName() + "파일의 데이터 내용입니다.");
        while (scanner.hasNextLine())
        {
            System.out.println(scanner.nextLine());
        }

        // Scanner를 종료한다.
        scanner.close();
    }
}
