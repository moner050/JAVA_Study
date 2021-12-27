package ch12;

public class LogicalTest {

	public static void main(String[] args) {

		int num1 = 10;
		int i = 2;
		
		// 단락 회로 평가
		// 앞의 항이 false이면 뒷쪽 항은 연산을 하지 않는다.
		boolean value = ( (num1 = num1 + 10) < 10) && ( (i = i + 2) < 10);
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);
		
		value = ( (num1 = num1 + 10) < 10) || ( (i = i + 2) < 10);
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);
		
	}

}
