package ch14;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest1 {

	public static void main(String[] args) {

		FileInputStream fis = null;
		try 
		{
			// 파일의 끝까지 한바이트씩 자료 읽기
			fis = new FileInputStream("input.txt");
			System.out.println((char)fis.read());
			System.out.println((char)fis.read());
			System.out.println((char)fis.read());
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		finally
		{
			// close()할때도 오류가 발생할 수 있기 때문에 try-catch
			try 
			{
				fis.close();
			} 
			catch (IOException e) 
			{
				System.out.println(e);
			}
			catch (Exception e1)
			{
				System.out.println(e1);
			}
		}
		System.out.println("END");
		
	}

}
