
public class LogicalOperator {

	public static void main(String[] args) {
		
		// �� ����
		System.out.println('a' > 'b');					// 'a' = 97, 'b' = 98  false
		System.out.println(3 >= 2);						// 3�� 2���� ũ�ų� ������   true
		System.out.println(-1 < 0);						// -1�� 0���� ������ 	   true
		System.out.println(3.45 <= 2);					// 3.45�� 2���� ����������  false
		System.out.println(3 == 2);						// 3�� 2�� ����������	   false
		System.out.println(3 != 2);						// 3�� 2�� ���� ������	   true
		System.out.println(!(3 != 2));					// true �� �ݴ��		   false

		// �� ����� �� ���� ����
		System.out.println((3 > 2) && (3 > 4));			// true AND false :    false
		System.out.println((3 != 2) || (-1 > 0));		// true OR 	false :	   true
		System.out.println((3 != 2) ^ (-1 > 0));		// true XOR false	   true
	}
}
