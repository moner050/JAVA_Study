import java.util.Scanner;
public class Grading {
	public static void main(String[] args) {
		// Scanner�� ��ü ����
		Scanner scan = new Scanner(System.in);
		
		char grade;
		
		// scan��ü�� �̿��� ���� �Է� �ޱ�
		System.out.print("������ �Է��ϼ���(0~100): ");
		int score = scan.nextInt();
		
		if(score >= 90) 		// �Է¹��� ������ 90�� �̻��̸� grade�� A
			grade = 'A';
		else if(score >= 80) 	// ������ 80 �̻� 90 �̸��̸� grade�� B
			grade = 'B';
		else if(score >= 70) 	// ������ 70 �̻� 80 �̸��̸� grade�� C
			grade = 'C';
		else if(score >= 60) 	// ������ 60 �̻� 70 �̸��̸� grade�� D
			grade = 'D';
		else 					// ������ 60 �̸��̸� grade�� F
			grade = 'F';
		
		// ���� ���
		System.out.println("������ "+ grade + "�Դϴ�.");
		
		// ��ĳ�� ����
		scan.close();
	
	}
}
