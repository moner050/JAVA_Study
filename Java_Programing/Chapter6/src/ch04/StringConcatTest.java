package ch04;

public class StringConcatTest {

	public static void main(String[] args) {

		String s1 = "Hello";
		String s2 = "World";
		StringConcatImpl strImpl = new StringConcatImpl();
		
		// 일반적인 객체지향 클래스 사용방법
		strImpl.makeString("Hello", "World");
		
		// 람다식 사용방법
		StringConcat concat = (s, v) -> System.out.println(s + "," + v);
		concat.makeString(s1, s2);
		
		// 람다식 내부에는 익명클래스가 생성된다.
		StringConcat concat2 = new StringConcat() {
			// 익명 내부 클래스
			@Override
			public void makeString(String s1, String s2) {
				System.out.println(s1+","+s2);				
			}
		};
		concat2.makeString(s1, s2);
	}

}
