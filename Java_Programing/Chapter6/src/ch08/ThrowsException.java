package ch08;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException {

	// 여기서 핸들링을 하지 않고 이 메서드를 쓰는 쪽에서 핸들링을 하겠다 선언.
	public Class loadClass(String fileName, String className) throws ClassNotFoundException, FileNotFoundException
	{
		// fileName을 받아 파일을 열고
		FileInputStream fis = new FileInputStream(fileName);
		// 클래스를 동적으로 로드시킬것이다.
		Class c = Class.forName(className);
		return c;
	}
	
	
	
	public static void main(String[] args) {

		ThrowsException test = new ThrowsException();
		
		try 
		{
			test.loadClass("a.txt", "java.lang.String");
		} 
		catch (ClassNotFoundException | FileNotFoundException e) 
		{
			System.out.println(e);
		}
		catch( Exception e)
		{
			System.out.println(e);
		}
		System.out.println("End");
	}

}
