package ch13;

import java.util.Scanner;

public class ConitionTest {

	public static void main(String[] args) {

		int max;
		System.out.println("두 수를 입력 받아서 더 큰 수를 출력하세요\n");
		
		// 입력을 받기 위해서 Scanner 객체 생성
		Scanner scan = new Scanner(System.in);
		
		System.out.println("입력1 : ");
		int num1 = scan.nextInt();
		System.out.println("입력2 : ");
		int num2 = scan.nextInt();

		// num1 이 num2보다 크면 max에 num1을, 아니면 num2를 넣어준다.
		max = (num1 > num2) ? num1 : num2;
		System.out.println(max);
	}

}
