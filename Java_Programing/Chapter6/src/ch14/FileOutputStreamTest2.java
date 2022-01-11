package ch14;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest2 {

	public static void main(String[] args) throws FileNotFoundException{
		// FileOutputStream 의 파일명 뒤에 true를 붙히면 기존 파일에 append되어서 기록된다.
		FileOutputStream fos = new FileOutputStream("output2.txt", true);
		try(fos)
		{	// byte배열에 A-Z까지 넣고 배열을 한꺼번에 파일에 넣기.
			byte[] bs = new byte[26];
			
			byte data = 65;
			
			for(int i = 0; i < bs.length; i++)
			{
				bs[i] = data++;
			}
			fos.write(bs);
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
		System.out.println("end");
	}

}
