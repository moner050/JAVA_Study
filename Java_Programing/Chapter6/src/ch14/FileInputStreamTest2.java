package ch14;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest2 {

	public static void main(String[] args) {

		int i;
		// 파일의 끝까지 자료를 읽기.
		try(FileInputStream fis = new FileInputStream("input.txt"))
		{	// read()의 끝값의 반환값은 -1이니 -1을 반환하기 전까지 반복
			while((i = fis.read()) != -1)
			{
				System.out.print((char)i);
			}
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
	}

}
