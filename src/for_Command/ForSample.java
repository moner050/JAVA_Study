package for_Command;

public class ForSample {

	public static void main(String[] args) {
		
		// 정수형 변수 sum = 0 선언.
		int sum = 0;
		
		// 1~10까지 반복
		for(int i = 1; i<=10; i++)
		{
			// for문이 끝날때까지 sum에 i를 더해준다. 
			sum += i;
			// 1~9 출력
			System.out.print(i);
			
			// i가 1이상 9이하일때 까지만 + 출력.
			if(i <= 9)
			{
				System.out.print("+");
			}
			else	// i가 10이면 1~10을 더한 값을 출력.
			{
				System.out.print(" = ");
				System.out.print(sum);
			}
		}
	}
}
