package ch08;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileExceptionHandling {

	public static void main(String[] args) {

		// 일반적인 try-catch-finally문
		/*
		FileInputStream fis = null;
		try 
		{
			fis = new FileInputStream("a.txt");
			System.out.println("수행이 완료되었습니다.");
		} 
		catch (FileNotFoundException e) 
		{
			System.out.println(e);
			return;
		}
		finally
		{
			if(fis != null)
			{
				try
				{
					fis.close();
				}
				catch(IOException e)
				{
					e.printStackTrace();
				}
			}
			System.out.println("finally end");
		}
		*/
		
		// try-with-resource문
		try(FileInputStream fis = new FileInputStream("a.txt"))
		{
			System.out.println("read");
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		
		
		System.out.println("End");
	}
}
