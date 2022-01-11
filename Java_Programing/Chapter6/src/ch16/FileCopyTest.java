package ch16;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class FileCopyTest {

	// ������ �о �����غ���
	public static void main(String[] args) {
		
		long millisecond = 0;
		
		// �׳� FileInputStream �� FileOutputStream �� �̿��Ͽ� ������ �����Ҷ��� �ð��� �����ɸ�����
		// BufferedInputStream �� BufferedOutputStream ���� ������Ʈ���� �̿��Ͽ� �� ������ ������ �� �ִ�.
		// ��� ��Ʈ�� : FileInputStream, FileOutputStream
		// ���� ��Ʈ�� : BufferedInputStream, BufferedOutputStream
		try( BufferedInputStream bis = new BufferedInputStream( new FileInputStream("a.zip"));
				BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("copy.zip")))
		{
			// �ɸ� �ð��� ������ �����ϱ����� ����ð� ���
			millisecond = System.currentTimeMillis();
			
			int i;
			while( (i = bis.read()) != -1 )
			{
				bos.write(i);
			}
			
			millisecond = System.currentTimeMillis() - millisecond;
			
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
		
		System.out.println(millisecond + " ms �ҿ�Ǿ����ϴ�.");
		
		Socket socket = new Socket();
		
		// �׳� InputStream�� byte�����θ� ó���Ǵ� stream�̿��� �ѱ����� ������ ���´�.
		// �׷��� �ѱ����� �������ʰ� ������ �ְ� InputStreamReader �� ���ΰ�
		// �� ������ ���� �� �ְ� BufferedReader�� �� �����ش�.
		BufferedReader br;
		try 
		{
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			br.readLine();
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
	}

}
