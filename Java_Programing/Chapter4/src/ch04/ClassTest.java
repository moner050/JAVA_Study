package ch04;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ClassTest {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, 
	NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {

		// Ŭ������ ��������
		Class c1 = Class.forName("ch04.Person");
		
		// ��ȯ���� Object�̴� Person���� ĳ���� ����.
		Person person = (Person)c1.newInstance();
		
		person.setName("Lee");
		System.out.println(person);
		
		// �̹� �ν��Ͻ��� �ִ� �����̸� getClass()�� �����ü� �ִ�.
		Class c2 = person.getClass();
		Person p = (Person)c2.newInstance();
		System.out.println(p);
	
		
		// Local�� Person�� ������ �� ����� ���.
		Class[] parameterTypes = {String.class};
		Constructor cons = c2.getConstructor(parameterTypes);
		
		Object[] initargs = {"Kim"};
		Person kimPerson = (Person)cons.newInstance(initargs);
		System.out.println(kimPerson);
	}
}
