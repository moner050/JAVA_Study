import java.util.Scanner;
public class NestedIf {
	public static void main(String[] args) {
		// Scanner�� ��ü ����
		Scanner scan = new Scanner(System.in);
		
		// scan��ü�� �̿��� ���� �Է� �ޱ�
		System.out.print("������ �Է��ϼ���(0~100): ");
		int score = scan.nextInt();
		
		// scan��ü�� �̿��� �г� �Է� �ޱ� 
		System.out.print("�г��� �Է��ϼ���(1~4): ");
		int year = scan.nextInt(); 

		if(score >= 60) 						// ������ 60�� �̻��̸�
		{
			if(year != 4)						// 4�г��� �ƴҶ�
			{
				System.out.println("�հ�!"); 		// �հ�
			}
			else if(score >= 70)				// 4�г��ε� 70�� �̻��̸�
			{
				System.out.println("�հ�!"); 		// �հ�
			}
			else								// 4�г��� 70�� �̸��̸�
				System.out.println("���հ�!"); 	// ���հ�
		}
		else 									// 60�� �̸��̸� ���հ�
			System.out.println("���հ�!");

		// ��ĳ�� ����
		scan.close();
	}
}
