package exceptionSentence;

public class ExceptionTestCode {

	public static void main(String[] args) {
	
		
		int arr[] = new int[3];
		// �迭�� ������ ��� �ε��� ���� �����߻�
		try 
		{
			arr[100] = 100;
		}
		catch(ArrayIndexOutOfBoundsException e) 
		{
			e.printStackTrace();
		}
		
		
		int a = 10;
		//����ڸ� 0���� ������ �����߻�
		try 
		{
			int b = a/0;
		}
		catch(ArithmeticException e) 
		{
			e.printStackTrace();
		}
		
		
		String str = "aaa";
		// �޼ҵ��� �μ��� ���ڷ� �ٲ� �� ���� �� �����߻�
		try 
		{
			int num = Integer.parseInt(str);
		}
		catch(NumberFormatException e) 
		{
			e.printStackTrace();
		}
	}

}
