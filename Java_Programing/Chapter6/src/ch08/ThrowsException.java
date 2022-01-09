package ch08;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException {

	// ���⼭ �ڵ鸵�� ���� �ʰ� �� �޼��带 ���� �ʿ��� �ڵ鸵�� �ϰڴ� ����.
	public Class loadClass(String fileName, String className) throws ClassNotFoundException, FileNotFoundException
	{
		// fileName�� �޾� ������ ����
		FileInputStream fis = new FileInputStream(fileName);
		// Ŭ������ �������� �ε��ų���̴�.
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
