package ch10;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesTest02 {
    public static void main(String[] args) throws IOException {
        // application.properties 파일 로딩
        FileReader prosReader = new FileReader("./application.properties");
        Properties props = new Properties();
        props.load(prosReader);
        String scoreFile = props.getProperty("application.scorefile");

        // 특정 파일과 연결된 입력스트림을 생성한다.
        File file = new File(scoreFile);
        FileReader reader = new FileReader(file);
        BufferedReader buffReader = new BufferedReader(reader);

        // 파일의 내용을 라인 단위로 출력한다.
        System.out.println(file.getName() + "파일의 데이터 내용입니다.");
        String data = null;
        while ((data = buffReader.readLine()) != null)
        {
            System.out.println(data.toString());
        }

        // 입력 스트림을 종료한다.
        reader.close();
        buffReader.close();
    }
}
