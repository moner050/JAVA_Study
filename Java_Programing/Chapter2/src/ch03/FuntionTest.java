package ch03;

public class FuntionTest {

	// ��ȯ���� �Ű������� �ִ� ��
	public static int addNum(int num1, int num2)
	{
		int result;
		result = num1 + num2;
		return result;
	}
	// ��ȯ���� ���� ��
	public static void sayHello(String greeting)
	{
		System.out.println(greeting);
	}
	// �Ű������� ���� ��
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
		
		// n1�� n2�� �� ��� �Լ�
		int total = addNum(n1, n2);
		System.out.println(total);
		
		// �λ� ��� �Լ�
		sayHello("�ȳ��ϼ���");
		
		// 1~100������ �� ��� �Լ�
		total = calcSum();
		System.out.println(total);
	}
}
