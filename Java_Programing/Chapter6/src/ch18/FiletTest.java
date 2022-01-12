package ch18;

import java.io.File;
import java.io.IOException;

public class FiletTest {

	public static void main(String[] args) throws IOException {

		// FileŬ���� : ���� ������ �߻�ȭ�� Ŭ����
		// ����� ����� ���� ������ �̸�, ���, �б� ������� �Ӽ��� �� �� �ִ�.
		File file = new File("D:\\Programing\\JAVA_Study\\Java_Programing\\Chapter6\\newFile.txt");
		file.createNewFile();
		
		System.out.println(file.isFile());
		System.out.println(file.isDirectory());
		System.out.println(file.getName());
		System.out.println(file.getAbsolutePath());
		System.out.println(file.getPath());
		System.out.println(file.canRead());
		System.out.println(file.canWrite());
		
		file.delete();
	}	

}
