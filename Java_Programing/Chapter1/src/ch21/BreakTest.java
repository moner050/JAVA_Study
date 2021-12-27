package ch21;

public class BreakTest {

	public static void main(String[] args) {

		int sum = 0;
		int num;
		
		// 어디까지 더해야 100 이상인지
		for(num = 1; ;num++)
		{
			sum += num;
			if( sum >= 100)
				break;
		}
		System.out.println(sum);
		System.out.println(num);
	}
}
