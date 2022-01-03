package ch03;

public class StringTest {

	public static void main(String[] args) {

		String java = new String("java");
		String android = new String("android");
		
		
		// 주소가 달라짐
		System.out.println(System.identityHashCode(java));
		java = java.concat(android);
		
		System.out.println(System.identityHashCode(java));
	}

}
