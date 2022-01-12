package ch18;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileTest {

	public static void main(String[] args) throws IOException {

		RandomAccessFile rf = new RandomAccessFile("random.txt", "rw");
		
		rf.writeInt(100);	
		// int�� 4byte�̴� �����ʹ� 4�� ����Ŵ
		System.out.println("pos: " + rf.getFilePointer());
		rf.writeDouble(3.14);	
		// double�� 8byte�̴� 12�� ����Ŵ
		System.out.println("pos: " + rf.getFilePointer());
		rf.writeUTF("�ȳ��ϼ���");	
		// �ѱ��� �ѱ��ڿ� 3byte�� ��Ƽ� 15byte + 2byte(Null) = 17byte�̴� 29�� ����Ŵ
		System.out.println("pos: " + rf.getFilePointer());
		
		// �������� ��ġ�� 0���� ����
		rf.seek(0);
		
		// ���� ������� �о������.
		int i = rf.readInt();
		double d = rf.readDouble();
		String str = rf.readUTF();
		
		System.out.println(i);
		System.out.println(d);
		System.out.println(str);
		
	}

}
