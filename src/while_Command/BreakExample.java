package while_Command;

import java.util.Scanner;

public class BreakExample {

	public static void main(String[] args) {
		// Scanner�� ��ü ����
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("exit �� �Է��ϸ� �����մϴ�.");
		
		while(true) 
		{
			System.out.print(">> ");
			// scan ��ü�� �̿��� ���� �Է¹ޱ�.
			String text = scan.nextLine();
			// exit�� �Է¹����� while�� ����.
			if(text.equals("exit"))
			{
				break;
			}
			else
			{
				continue;
			}
		}
		System.out.println("�����մϴ�.");
		
		// ��ĳ�� ����.
		scan.close();
	}
}
