package ch16;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderTest {

	public static void main(String[] args) {

		// 기반 스트림에 보조 스트림을 감싸주는 방법
		// 기반 스트림 : FileInputStream
		// 보조 스트림 : InputStreamReader
		try(InputStreamReader isr = new InputStreamReader(new FileInputStream("reader.txt")))
		{
			int i;
			// 보조 스트림으로 읽는다.
			while( (i = isr.read()) != -1 )
			{
				System.out.print((char)i);
			}
		}
		catch(IOException e)
		{
			
		}
	}

}
