package ch21;

public class ContinueTest {

	public static void main(String[] args) {

		int num;
		// 3의 배수만 출력
		for( num = 1; num <= 100; num++)
		{
			if( (num % 3) != 0) continue;
			
			System.out.println(num);
		}
		
	}

}
