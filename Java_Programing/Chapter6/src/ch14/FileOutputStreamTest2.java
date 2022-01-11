package ch14;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest2 {

	public static void main(String[] args) throws FileNotFoundException{
		// FileOutputStream �� ���ϸ� �ڿ� true�� ������ ���� ���Ͽ� append�Ǿ ��ϵȴ�.
		FileOutputStream fos = new FileOutputStream("output2.txt", true);
		try(fos)
		{	// byte�迭�� A-Z���� �ְ� �迭�� �Ѳ����� ���Ͽ� �ֱ�.
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
