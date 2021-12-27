package ch06;

public class VariableTest {

	public static void main(String[] args) {
		
		// byte는 -128 ~ 127 까지 표현이 가능하다
		byte bnum = -128;
		System.out.println(bnum);
		
		// 4byte로 표현할 수 있는 범위를 넘어서 오류가 난다.
		//int num = 12345678900;
		
		// long형을 표현할때는 숫자 뒤에 L을 표현.
		// 크기가 작은 숫자라도 뒤에 L을 붙히면 자동으로 long 형으로 변환.
		long lNum = 12345678900L;
		System.out.println(lNum);
	}

}
