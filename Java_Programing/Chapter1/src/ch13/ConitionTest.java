package ch13;

import java.util.Scanner;

public class ConitionTest {

	public static void main(String[] args) {

		int max;
		System.out.println("�� ���� �Է� �޾Ƽ� �� ū ���� ����ϼ���\n");
		
		// �Է��� �ޱ� ���ؼ� Scanner ��ü ����
		Scanner scan = new Scanner(System.in);
		
		System.out.println("�Է�1 : ");
		int num1 = scan.nextInt();
		System.out.println("�Է�2 : ");
		int num2 = scan.nextInt();

		// num1 �� num2���� ũ�� max�� num1��, �ƴϸ� num2�� �־��ش�.
		max = (num1 > num2) ? num1 : num2;
		System.out.println(max);
	}

}
