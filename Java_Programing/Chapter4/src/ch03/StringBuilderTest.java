package ch03;

public class StringBuilderTest {

	public static void main(String[] args) {

		String java = new String("java");
		String android = new String("android");
		
		StringBuilder buffer = new StringBuilder(java);
		System.out.println(System.identityHashCode(buffer));
		// buffer�� android ���ڿ� �߰�
		buffer.append(android);
		// �߰����൵ �޸��ּ� ���� ��������
		System.out.println(System.identityHashCode(buffer));
		
		// test�� buffer�� toString�� ���� �־���.
		String test = buffer.toString();
		System.out.println(test);
	}

}
