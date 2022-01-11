package ch14;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest3 {

	public static void main(String[] args) {

		int i;
		// 바이트단위로 파일을 읽기
		try(FileInputStream fis = new FileInputStream("input2.txt"))
		{	
			byte[] bs = new byte[10];
			
			// offset을 1로 주면 bs[]의 크기가 10이니 9개를 읽는것이 최대이다.
			while( (i = fis.read(bs, 1, 9)) != -1 )
			{
				for(int j = 0 ; j < i; j++ )
				{
					System.out.print((char)bs[j]);
				}
				System.out.println(" : " + i + "바이트 읽음");
			}
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
	}
}

