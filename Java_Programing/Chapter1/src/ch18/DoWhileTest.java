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
		}// input�� 0�� �ԷµǱ� ������ ��� �ݺ�
		while(input != 0);
		
		System.out.println(sum);
		
	}

}
