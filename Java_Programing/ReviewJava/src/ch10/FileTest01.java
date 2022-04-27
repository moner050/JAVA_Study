package ch10;

import java.io.File;
import java.io.IOException;

public class FileTest01 {
    public static void main(String[] args) throws IOException {
        // 현재 프로젝트(Chapter12)에 temp라는 디렉토리 객체 생성
        File directory = new File("./temp");
        directory.mkdir();

        // temp 디렉토리에 temp_file.txt 파일 생성
        File file = new File(directory, "temp_file.txt");
        file.createNewFile();

        // 생성된 File 객체가 디렉토리인지 파일인지 체크
        if(directory.isDirectory())  System.out.println(directory.getName() + "은 디렉토리입니다.");

        if(file.isFile())
        {
            System.out.println(file.getName() + "은 파일입니다.");
            System.out.println("파일의 경로 : " + file.getPath());
            System.out.println("파일의 크기 : " + file.length() + "(bytes)");
            System.out.println("쓰기 가능한가? : " + file.canWrite());
            System.out.println("읽기 가능한가? : " + file.canRead());
        }

        // temp_file.txt 파일을 삭제한다.
        if(file.delete()) System.out.println(file.getName() + "파일 삭제 성공!");

        // temp 디렉토리를 삭제한다.
        if(directory.delete())  System.out.println(directory.getName() + "디렉토리 삭제 성공!");

    }
}
