package ch18;

import java.util.Scanner;

public class DoWhileTest {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int input;
		int sum = 0;
		
		do
		{
			input = scan.nextInt();
			sum += input;
		}// input에 0이 입력되기 전까지 계속 반복
		while(input != 0);
		
		System.out.println(sum);
		
	}

}
