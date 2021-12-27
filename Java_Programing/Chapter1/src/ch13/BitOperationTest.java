package ch13;

public class BitOperationTest {

	public static void main(String[] args) {

		int num1 = 5;		// 00000101
		int num2 = 10;		// 00001010
		
		System.out.println(num1 | num2);
		System.out.println(num1 & num2);
		System.out.println(num1 ^ num2);
		System.out.println(~num1);
		
		System.out.println(num1 << 2);
		System.out.println(num1);
		// 이렇게 하면 num1에 대입이 되어 바뀐다.
		System.out.println(num1 <<= 2);
		System.out.println(num1);
		System.out.println(num1 >> 1);
	}

}
