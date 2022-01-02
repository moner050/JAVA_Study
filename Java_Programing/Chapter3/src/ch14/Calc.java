package ch14;

public interface Calc {

	double PI = 3.14;
	int ERROR = -999999;
	
	int add(int num1, int num2);
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
	
	// default�� �����ϴ� Ŭ�������� �����ǰ� �����ϴ�.
	default void description()
	{
		System.out.println("������ ��Ģ������ �����մϴ�.");
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
	
	
	// �������̽� ���� private�� �������̽� ���ο����� ����ϱ� ���ؼ� �����ϴ� �޼ҵ��̴�.
	private void myMethod()
	{
		System.out.println("MyMethod");
	}
	
	private static void myStaticMethod()
	{
		System.out.println("MyStaticMethod");
	}
}
