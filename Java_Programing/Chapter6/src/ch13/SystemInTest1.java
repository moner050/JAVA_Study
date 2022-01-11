package ch13;

import java.io.IOException;
import java.io.InputStreamReader;

public class SystemInTest1 {

	public static void main(String[] args) {

		System.out.println("알파벳을 쓰고 [Enter]를 누르세요");

		int i;
		try 
		{	// System.in.read() 의 반환값은 정수형이다. 1byte씩밖에 못읽어서 길이를 초과하면 깨진값이 나온다.
			// 그래서 보조 스트림인 InputStreamReader 을 이용해서 여러 문자열을 받을 수 있다.
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
