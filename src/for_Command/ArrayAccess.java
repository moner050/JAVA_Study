package for_Command;

import java.util.Scanner;

public class ArrayAccess {

	public static void main(String[] args) {
		// Scanner�� ��ü ����
		Scanner scan = new Scanner(System.in);
		
		int intArray[] = new int[5];					// �迭 ����
		int max = 0;									// ���� ū ���� ������ ���� ����.
		
		System.out.println("��� 5���� �Է��ϼ���.");
		for(int i = 0; i < 5; i++)
		{
			intArray[i] = scan.nextInt();				// scan ��ü�� �̿��� ���� �Է¹޾� �迭[i]�� �ֱ�
			if(intArray[i] > max)						// �迭�� ����� ���� max���� ũ��
			{
				max = intArray[i];						// max�� �迭�� �� ����.
			}
		}
		System.out.println("���� ū ����" + max + "�Դϴ�.");
		
		// ��ĳ�� ����.
		scan.close();
	}
}
