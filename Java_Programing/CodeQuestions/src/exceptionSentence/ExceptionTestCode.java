package exceptionSentence;

public class ExceptionTestCode {

	public static void main(String[] args) {
	
		
		int arr[] = new int[3];
		// 배열의 범위를 벗어난 인덱스 사용시 에러발생
		try 
		{
			arr[100] = 100;
		}
		catch(ArrayIndexOutOfBoundsException e) 
		{
			e.printStackTrace();
		}
		
		
		int a = 10;
		//어떤숫자를 0으로 나누면 에러발생
		try 
		{
			int b = a/0;
		}
		catch(ArithmeticException e) 
		{
			e.printStackTrace();
		}
		
		
		String str = "aaa";
		// 메소드의 인수를 숫자로 바꿀 수 없을 때 에러발생
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
