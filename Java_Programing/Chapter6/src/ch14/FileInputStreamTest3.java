package ch14;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest3 {

	public static void main(String[] args) {

		int i;
		// ����Ʈ������ ������ �б�
		try(FileInputStream fis = new FileInputStream("input2.txt"))
		{	
			byte[] bs = new byte[10];
			
			// offset�� 1�� �ָ� bs[]�� ũ�Ⱑ 10�̴� 9���� �д°��� �ִ��̴�.
			while( (i = fis.read(bs, 1, 9)) != -1 )
			{
				for(int j = 0 ; j < i; j++ )
				{
					System.out.print((char)bs[j]);
				}
				System.out.println(" : " + i + "����Ʈ ����");
			}
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
	}
}

