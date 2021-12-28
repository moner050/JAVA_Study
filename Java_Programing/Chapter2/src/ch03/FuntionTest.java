package ch03;

public class FuntionTest {

	// 반환값과 매개변수가 있는 것
	public static int addNum(int num1, int num2)
	{
		int result;
		result = num1 + num2;
		return result;
	}
	// 반환값이 없는 것
	public static void sayHello(String greeting)
	{
		System.out.println(greeting);
	}
	// 매개변수가 없는 것
	public static int calcSum()
	{
		int sum = 0;
		int i;
		for(i = 0; i <= 100; i++)
		{
			sum += i;
		}
		return sum;
	}
	
	public static void main(String[] args)
	{
		int n1 = 10;
		int n2 = 20;
		
		// n1과 n2의 합 출력 함수
		int total = addNum(n1, n2);
		System.out.println(total);
		
		// 인삿말 출력 함수
		sayHello("안녕하세요");
		
		// 1~100까지의 합 출력 함수
		total = calcSum();
		System.out.println(total);
	}
}
