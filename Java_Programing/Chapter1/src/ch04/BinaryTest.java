package ch04;

public class BinaryTest {
	public static void main(String[] args) {
		
		int num = 10;
		// 앞에 0B를 붙히면 이건 2진수로 표현하겠다는 뜻 이다.
		int bNum = 0B1010;
		// 앞에 0 을 붙히면 이건 8진수로 표현하겠다는 뜻 이다.
		int oNum = 012;
		// 앞에 0X를 붙히면 이건 16진수로 표현하겠다는 뜻 이다.
		int xNum = 0XA;
		
		System.out.println(num);
		System.out.println(bNum);
		System.out.println(oNum);
		System.out.println(xNum);
	}
}
