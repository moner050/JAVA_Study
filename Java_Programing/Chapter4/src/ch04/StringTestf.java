package ch04;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class StringTestf {

	public static void main(String[] args) throws ClassNotFoundException {

		// 로컬에 Object가 없을때, remote에 있는 Object나 Class를 Invocation 시킬때 사용함.
		// 동적로딩을 하려면 클래스 네임을 풀네임으로 정확히 적어야 한다.
		Class c = Class.forName("java.lang.String");
		
		Constructor[] cons = c.getConstructors();
		
		// java.lang.String 의 컨스트럭터들을 출력
		for(Constructor co : cons)
		{
			System.out.println(co);
		}
		// java.lang.String 의 메소드를 출력
		Method[] m = c.getMethods();
		for( Method mth : m )
		{
			System.out.println(mth);
		}
	}

}
