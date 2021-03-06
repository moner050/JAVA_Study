package ch15;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {

	public static void main(String[] args) {

		try(FileWriter fw = new FileWriter("writer.txt"))
		{	// 문자 하나 출력
			fw.write('A');
			char buf[] = {'B', 'C', 'D', 'E', 'F', 'G'};
			
			// 문자 배열 출력
			fw.write(buf);
			// String 출력
			fw.write("안녕하세요. 잘 써집니다.");
			// 문자 배열의 일부만 출력
			fw.write(buf, 1, 2);
			// 숫자를 그대로 출력
			fw.write("65");
		
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
		System.out.println("끝");
	}

}
