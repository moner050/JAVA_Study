package for_Command;

import java.util.Scanner;

public class ArrayLength {

	public static void main(String[] args) {
		// Scanner�� ��ü ����
		Scanner scan = new Scanner(System.in);
		
		int intArray[] = new int[5];								// �迭 ������ ����.
		int sum = 0;												// �迭�� �ִ� ���� ���� ���� ����.
		
		System.out.print(intArray.length + "���� ������ �Է��ϼ���>> ");
		
		for(int i = 0; i < intArray.length; i++)
		{
			intArray[i] = scan.nextInt();							// �迭�� ũ�⸸ŭ ���� �Է¹ޱ�.
		}
		
		for(int i = 0; i < intArray.length; i++)
		{
			sum += intArray[i];										// �迭�� ũ�⸸ŭ �迭�� �Էµ� ������ sum�� �����ֱ�.
		}
		
		System.out.println("��� : " + (double)sum/intArray.length);	// ��հ� ���.
		
		// ��ĳ�� ����
		scan.close();
	}
}
