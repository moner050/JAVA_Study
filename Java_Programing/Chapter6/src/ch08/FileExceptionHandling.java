package ch08;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileExceptionHandling {

	public static void main(String[] args) {

		// �Ϲ����� try-catch-finally��
		/*
		FileInputStream fis = null;
		try 
		{
			fis = new FileInputStream("a.txt");
			System.out.println("������ �Ϸ�Ǿ����ϴ�.");
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
		
		// try-with-resource��
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
