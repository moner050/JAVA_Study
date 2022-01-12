package ch18;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileTest {

	public static void main(String[] args) throws IOException {

		RandomAccessFile rf = new RandomAccessFile("random.txt", "rw");
		
		rf.writeInt(100);	
		// int는 4byte이니 포인터는 4를 가르킴
		System.out.println("pos: " + rf.getFilePointer());
		rf.writeDouble(3.14);	
		// double은 8byte이니 12를 가르킴
		System.out.println("pos: " + rf.getFilePointer());
		rf.writeUTF("안녕하세요");	
		// 한글은 한글자에 3byte씩 잡아서 15byte + 2byte(Null) = 17byte이니 29를 가르킴
		System.out.println("pos: " + rf.getFilePointer());
		
		// 포인터의 위치를 0으로 지정
		rf.seek(0);
		
		// 넣은 순서대로 읽어줘야함.
		int i = rf.readInt();
		double d = rf.readDouble();
		String str = rf.readUTF();
		
		System.out.println(i);
		System.out.println(d);
		System.out.println(str);
		
	}

}
