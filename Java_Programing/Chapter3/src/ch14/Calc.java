package ch14;

public interface Calc {

	double PI = 3.14;
	int ERROR = -999999;
	
	int add(int num1, int num2);
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
	
	// default는 구현하는 클래스에서 재정의가 가능하다.
	default void description()
	{
		System.out.println("정수의 사칙연산을 제공합니다.");
	}
	
	static int total(int[] arr)
	{
		int total = 0;
		for(int num : arr)
		{
			total += num;
		}
		myStaticMethod();
		return total;
	}
	
	
	// 인터페이스 내에 private는 인터페이스 내부에서만 사용하기 위해서 구현하는 메소드이다.
	private void myMethod()
	{
		System.out.println("MyMethod");
	}
	
	private static void myStaticMethod()
	{
		System.out.println("MyStaticMethod");
	}
}
