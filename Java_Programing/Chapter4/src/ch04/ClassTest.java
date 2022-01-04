package ch04;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ClassTest {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, 
	NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {

		// 클래스를 가져오기
		Class c1 = Class.forName("ch04.Person");
		
		// 반환값이 Object이니 Person으로 캐스팅 해줌.
		Person person = (Person)c1.newInstance();
		
		person.setName("Lee");
		System.out.println(person);
		
		// 이미 인스턴스가 있는 상태이면 getClass()로 가져올수 있다.
		Class c2 = person.getClass();
		Person p = (Person)c2.newInstance();
		System.out.println(p);
	
		
		// Local에 Person이 없을때 이 방법을 사용.
		Class[] parameterTypes = {String.class};
		Constructor cons = c2.getConstructor(parameterTypes);
		
		Object[] initargs = {"Kim"};
		Person kimPerson = (Person)cons.newInstance(initargs);
		System.out.println(kimPerson);
	}
}
