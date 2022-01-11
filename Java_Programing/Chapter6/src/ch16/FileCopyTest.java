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

	// 파일을 읽어서 복사해보기
	public static void main(String[] args) {
		
		long millisecond = 0;
		
		// 그냥 FileInputStream 과 FileOutputStream 을 이용하여 파일을 복사할때는 시간이 오래걸리지만
		// BufferedInputStream 과 BufferedOutputStream 같은 보조스트림을 이용하여 더 빠르게 복사할 수 있다.
		// 기반 스트림 : FileInputStream, FileOutputStream
		// 보조 스트림 : BufferedInputStream, BufferedOutputStream
		try( BufferedInputStream bis = new BufferedInputStream( new FileInputStream("a.zip"));
				BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("copy.zip")))
		{
			// 걸린 시간이 얼마인지 측정하기위해 현재시간 기록
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
		
		System.out.println(millisecond + " ms 소요되었습니다.");
		
		Socket socket = new Socket();
		
		// 그냥 InputStream은 byte단위로만 처리되는 stream이여서 한국말은 깨져서 나온다.
		// 그래서 한국말도 깨지지않고 읽을수 있게 InputStreamReader 로 감싸고
		// 더 빠르게 읽을 수 있게 BufferedReader로 더 감싸준다.
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
