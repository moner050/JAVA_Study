package ConditionalSentence;

import java.util.Scanner;

public class Validation {
	/*
	 * # ���� ��ȿ�� �˻�
	 * 1. ������ �Է¹޴´�.
	 * 2. ������  60�� �̻��̸� �հ�, 60�� �̸��̸� ���հ��̴�.
	 * 3. ��, �Է¹��� ������ 
	 *    �����̰ų� 100���� �ʰ��ϸ�, ���� �޼����� ����Ѵ�.
	 *    ��) ������  �߸� �Է��߽��ϴ�.
	*/
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("������ �Է����ּ��� : ");
		int IpScore = scan.nextInt();
		
		if((IpScore < 0) || (IpScore > 100))
		{
			System.out.println("������ �߸� �Է��ϼ̽��ϴ�.");
		}
		else
		{
			if(IpScore >= 60)
			{
				System.out.println("�հ��Դϴ�.");
			}
			else
			{
				System.out.println("���հ��Դϴ�.");
			}
		}
		
		scan.close();
	}
}
