package ch10;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;

public class IOTest01 {
    public static void main(String[] args) {
        // 표준 입력 스트림
        InputStream input = System.in;

        // 표준 출력 스트림
        PrintStream output = System.out;

        System.out.println("메시지를 입력하세요.");

        // 모든 입출력 작업은 IOException 이 발생 가능하다.
        try
        {
            int data = 0;
            // 1바이트의 데이터를 읽고 출력하는 작업을 반복한다.
            // read() 메소드는 더 이상 읽을 데이터가 없는 경우 -1을 리턴한다.
            while((data = input.read()) != -1 )
            {
                output.print((char) data);
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        finally
        {
            // 입/출력 스트림 종료
            try
            {
                input.close();
                output.close();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }
        System.out.println("프로그램 종료");
    }
}
