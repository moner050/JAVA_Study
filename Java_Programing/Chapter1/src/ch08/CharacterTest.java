package ch08;

public class CharacterTest {

	public static void main(String[] args) {

		// �����ڿ� ���ڸ� ���� ���� ���� �ڵ������ �ƴϴ�.
		char ch1 = 'A';
		System.out.println(ch1);
		// �ڷ��� ch1�� ������ ���������� ��������ȯ �� ���
		System.out.println((int)ch1);
		
		char ch2 = 66;
		System.out.println(ch2);
		// ���ڸ� �ᵵ char�� ������ֱ� ������ ���� ����ȯ�� �ϱ� ���� �Ĵ� �Ȱ���.
		System.out.println((char)ch2);
		
		int ch3 = 67;
		System.out.println(ch3);
		// int���� ch3�� char������ ��������ȯ �� ���
		System.out.println((char)ch3);
		
		// �����ڵ带 �����ҷ��� \\u�� �տ� ����ȴ�. 
		char han = '��';
		char ch = '\uD55C';
		
		System.out.println(han);
		System.out.println(ch);
	}
}
