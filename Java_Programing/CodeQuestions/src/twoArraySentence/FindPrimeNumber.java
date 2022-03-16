package twoArraySentence;

import java.util.Scanner;

public class FindPrimeNumber {

	public static void main(String[] args) {
		/*
		 * # 소수 찾기[3단계]
		 * 1. 숫자를 한 개 입력받는다.
		 * 2. 입력받은 숫자보다 큰 첫 번째 소수를 출력한다.
		 * 
		 * 예) Enter Number ? 1000
		 *    1000보다 큰 첫번재 소수는 1009
		 * 예) Enter Number ? 500
		 *    500보다 큰 첫번째 소수는 503
		 */
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter Number ? ");
		int number = scan.nextInt();
		
		int temp = number;
		
		while(true)
		{
			int cnt = 0;
			for(int i = 2; i < temp; i++)
			{
				if(temp % i == 0) cnt++;
			}
			
			if(cnt > 0) temp++;
			else
			{
				System.out.print(number + "보다 큰 첫번째 소수는 " + temp);
				break;
			}
		}
		scan.close();
	}

}
