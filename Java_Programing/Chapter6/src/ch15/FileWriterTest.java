package ch15;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {

	public static void main(String[] args) {

		try(FileWriter fw = new FileWriter("writer.txt"))
		{	// ���� �ϳ� ���
			fw.write('A');
			char buf[] = {'B', 'C', 'D', 'E', 'F', 'G'};
			
			// ���� �迭 ���
			fw.write(buf);
			// String ���
			fw.write("�ȳ��ϼ���. �� �����ϴ�.");
			// ���� �迭�� �Ϻθ� ���
			fw.write(buf, 1, 2);
			// ���ڸ� �״�� ���
			fw.write("65");
		
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
		System.out.println("��");
	}

}
