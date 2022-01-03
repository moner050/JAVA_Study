package ch03;

public class StringBuilderTest {

	public static void main(String[] args) {

		String java = new String("java");
		String android = new String("android");
		
		StringBuilder buffer = new StringBuilder(java);
		System.out.println(System.identityHashCode(buffer));
		// buffer에 android 문자열 추가
		buffer.append(android);
		// 추가해줘도 메모리주소 값은 변동없음
		System.out.println(System.identityHashCode(buffer));
		
		// test에 buffer를 toString한 값을 넣어줌.
		String test = buffer.toString();
		System.out.println(test);
	}

}
