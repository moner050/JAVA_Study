package ch03;

public class MyNumberTest {

	public static void main(String[] args) {

		// �Ű����� x�� y�� �ް� x�� y���� ũ�� x��, �ƴϸ� y�� ��ȯ.
		MyNumber myNumber = (x, y) -> x > y ? x : y;
		
		System.out.println(myNumber.getMax(10, 20));
	}
}
