public class AssignmentIncDecOperator {
	public static void main(String[] args) {
		// a, b, c ���� ����
		int a=3, b=3, c=3;
		// ���� ������
		// a=a+3 = 6
		a += 3;
		// b=b*3 = 9
		b *= 3;
		// c=c%2 = 1
		c %= 2; 												
		
		System.out.println("a=" + a + ", b=" + b + ", c=" + c);	// a=6, b=9, c=1
	
		// ���� d�� 3���� ����
		int d=3;
		
		// ���� ������
		// �������� ������
		a = d++; 												
		System.out.println("a=" + a + ", d=" + d);				// a=3, d=4
		// �������� ������
		a = ++d;
		System.out.println("a=" + a + ", d=" + d);				// a=5, d=5
		// �������� ������
		a = d--; 		
		System.out.println("a=" + a + ", d=" + d);				// a=5, d=4
		// �������� ������
		a = --d; 		
		System.out.println("a=" + a + ", d=" + d);				// d=3, a=3
	}
}
