package ch13;

import java.io.IOException;
import java.io.InputStreamReader;

public class SystemInTest1 {

	public static void main(String[] args) {

		System.out.println("���ĺ��� ���� [Enter]�� ��������");

		int i;
		try 
		{	// System.in.read() �� ��ȯ���� �������̴�. 1byte���ۿ� ���о ���̸� �ʰ��ϸ� �������� ���´�.
			// �׷��� ���� ��Ʈ���� InputStreamReader �� �̿��ؼ� ���� ���ڿ��� ���� �� �ִ�.
			InputStreamReader irs = new InputStreamReader(System.in);
			while((i = irs.read()) != '\n')
			{
				System.out.print((char)i);
			}
		}
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}

}
