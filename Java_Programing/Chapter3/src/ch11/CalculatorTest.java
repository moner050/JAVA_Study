package ch11;

public class CalculatorTest {

	public static void main(String[] args) {

		int num1 = 10;
		int num2 = 2;
		// 인터페이스를 구현한 Calc, 인터페이스 타입 = CompleteCalc
		// Calc에 있는 메소드만 사용가능.
		Calc calc = new CompleteCalc();
		System.out.println(calc.add(num1, num2));
		System.out.println(calc.substract(num1, num2));
		System.out.println(calc.times(num1, num2));
		System.out.println(calc.divide(num1, num2));
		
		
	}

}
