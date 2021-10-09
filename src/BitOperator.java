
public class BitOperator {

	public static void main(String[] args) {
		
		short a = (short)0x55ff;						// 0101 0101 1111 1111
		short b = (short)0x00ff;						// 0000 0000 1111 1111
		
		// 비트 논리 연산
		System.out.println("[비트 연산 결과]");
		System.out.printf("%04x\n", (short)(a & b)); 	// 비트 AND
		System.out.printf("%04x\n", (short)(a | b)); 	// 비트 OR
		System.out.printf("%04x\n", (short)(a ^ b)); 	// 비트 XOR
		System.out.printf("%04x\n", (short)(~a)); 		// 비트 NOT
		
		byte c = 20; 									// 0x14		->		0001 0100
		byte d = -8; 									// 0xf8		->		1111 1000
		
		// 비트 시프트 연산
		System.out.println("[시프트 연산 결과]");
		System.out.println(c << 2); 					// c를 2비트 왼쪽 시프트				00 0101 0000
		System.out.println(c >> 2); 					// c를 2비트 오른쪽 시프트. 0 삽입		0000 0101
		System.out.println(d >> 2); 					// d를 2비트 오른쪽 시프트. 1 삽입		1111 1000 ↓
														// 								1111 1111 1111 1111 1111 1111 1111 1110
		
		System.out.printf("%x\n", (d >>> 2)); 			// d를 2비트 오른쪽 시프트. 0 삽입		1111 1111 1111 1111 1111 1111 1111 1000 ↓
														//								0011 1111 1111 1111 1111 1111 1111 1110 ↓
														//								3	 f	  f	   f	f	 f	  f	   e
	}

}
