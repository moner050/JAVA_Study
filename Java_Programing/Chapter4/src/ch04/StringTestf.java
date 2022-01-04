package ch04;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class StringTestf {

	public static void main(String[] args) throws ClassNotFoundException {

		// ���ÿ� Object�� ������, remote�� �ִ� Object�� Class�� Invocation ��ų�� �����.
		// �����ε��� �Ϸ��� Ŭ���� ������ Ǯ�������� ��Ȯ�� ����� �Ѵ�.
		Class c = Class.forName("java.lang.String");
		
		Constructor[] cons = c.getConstructors();
		
		// java.lang.String �� ����Ʈ���͵��� ���
		for(Constructor co : cons)
		{
			System.out.println(co);
		}
		// java.lang.String �� �޼ҵ带 ���
		Method[] m = c.getMethods();
		for( Method mth : m )
		{
			System.out.println(mth);
		}
	}

}
