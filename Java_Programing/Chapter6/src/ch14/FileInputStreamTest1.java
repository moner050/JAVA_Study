package ch14;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest1 {

	public static void main(String[] args) {

		FileInputStream fis = null;
		try 
		{
			// ������ ������ �ѹ���Ʈ�� �ڷ� �б�
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
			// close()�Ҷ��� ������ �߻��� �� �ֱ� ������ try-catch
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
