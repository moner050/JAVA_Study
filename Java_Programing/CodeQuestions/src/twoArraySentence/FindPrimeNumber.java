package twoArraySentence;

import java.util.Scanner;

public class FindPrimeNumber {

	public static void main(String[] args) {
		/*
		 * # �Ҽ� ã��[3�ܰ�]
		 * 1. ���ڸ� �� �� �Է¹޴´�.
		 * 2. �Է¹��� ���ں��� ū ù ��° �Ҽ��� ����Ѵ�.
		 * 
		 * ��) Enter Number ? 1000
		 *    1000���� ū ù���� �Ҽ��� 1009
		 * ��) Enter Number ? 500
		 *    500���� ū ù��° �Ҽ��� 503
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
				System.out.print(number + "���� ū ù��° �Ҽ��� " + temp);
				break;
			}
		}
		scan.close();
	}

}
