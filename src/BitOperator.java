
public class BitOperator {

	public static void main(String[] args) {
		
		short a = (short)0x55ff;						// 0101 0101 1111 1111
		short b = (short)0x00ff;						// 0000 0000 1111 1111
		
		// ��Ʈ �� ����
		System.out.println("[��Ʈ ���� ���]");
		System.out.printf("%04x\n", (short)(a & b)); 	// ��Ʈ AND
		System.out.printf("%04x\n", (short)(a | b)); 	// ��Ʈ OR
		System.out.printf("%04x\n", (short)(a ^ b)); 	// ��Ʈ XOR
		System.out.printf("%04x\n", (short)(~a)); 		// ��Ʈ NOT
		
		byte c = 20; 									// 0x14		->		0001 0100
		byte d = -8; 									// 0xf8		->		1111 1000
		
		// ��Ʈ ����Ʈ ����
		System.out.println("[����Ʈ ���� ���]");
		System.out.println(c << 2); 					// c�� 2��Ʈ ���� ����Ʈ				00 0101 0000
		System.out.println(c >> 2); 					// c�� 2��Ʈ ������ ����Ʈ. 0 ����		0000 0101
		System.out.println(d >> 2); 					// d�� 2��Ʈ ������ ����Ʈ. 1 ����		1111 1000 ��
														// 								1111 1111 1111 1111 1111 1111 1111 1110
		
		System.out.printf("%x\n", (d >>> 2)); 			// d�� 2��Ʈ ������ ����Ʈ. 0 ����		1111 1111 1111 1111 1111 1111 1111 1000 ��
														//								0011 1111 1111 1111 1111 1111 1111 1110 ��
														//								3	 f	  f	   f	f	 f	  f	   e
	}

}
