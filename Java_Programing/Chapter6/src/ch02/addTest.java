package ch02;

public class addTest {

	public static void main(String[] args) {

		// ���ٽ��� �������̽� �ڷ��� add ������ ����.
		Add add = (x, y) -> (x + y);
		
		// �������̽� �ڷ��� ������ �Լ� ȣ��.
		System.out.println(add.add(2, 3));
	}

}
