package fileIOSentence;

import java.io.FileWriter;

public class FileIO1 {

	public static void main(String[] args) {
		
		// ���̺� ���� ����� 
		// 1) ���� ����          ==> FileWriter fw = new FileWriter("�����̸�"); 
		// 2) ���Ͽ� ���� ���� ==> fw.write("���������ϱ� ��������");
		// 3) ���ϴݱ�           ==> fw.close(); 
		
		String fileName = "fileIO1.txt";
		FileWriter fw = null; // try �ۿ��� ����� ���� ���� �ۿ� ������ �����.
		try 
		{
			fw = new FileWriter(fileName);
			fw.write("��ö��/10,�̿���/30,�ڸ���/50");
			fw.close();
		}
		catch(Exception e) 
		{
			e.printStackTrace();
		}
		
		// 1. Run : Ctrl + F11
		// 2. ������Ʈ ���� ��, 
		//    F5(Refresh)�� ������ ������ �޸��� ������ Ȯ���� �� �ִ�. 
		
		
	}

}
