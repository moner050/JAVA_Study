package for_Command;

import java.util.Scanner;

public class ContinueExample {

	public static void main(String[] args) {
		// Scanner�� ��ü ����
		Scanner scan = new Scanner(System.in);
		
		
		// scan ��ü�� �̿��� ���� �Է¹ޱ�.
		System.out.println("������ 5�� �Է��ϼ���");
		// ������ ���� sum = 0 ����
		int sum = 0;
		
		for(int i=0; i<5; i++) 
		{
			int n = scan.nextInt(); // Ű���忡�� ���� �Է�
			
			if(n<=0) 
			{
				continue; // ����� �ƴ� ��� ���� �ݺ����� ����
			}
			else 
			{
				sum += n; // ����� ��� ����
			}
		}
		System.out.println("����� ���� " + sum);
		
		// ��ĳ�� ����
		scan.close();
	}
}
