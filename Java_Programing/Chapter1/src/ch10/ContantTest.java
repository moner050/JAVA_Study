package ch10;

public class ContantTest {

	public static void main(String[] args) {

		final int MAX_NUM = 100;
		final int MIN_NUM;
		
		MIN_NUM = 0;
		// 이미 값이 지정된 상수는 나중에 변경 불가능하다.
//		MAX_NUM = 20;
		
		System.out.println(MAX_NUM);
		System.out.println(MIN_NUM);
	}

}
