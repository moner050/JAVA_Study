import java.util.Scanner;
public class GradingSwitch {
	public static void main(String[] args) {
		// Scanner�� ��ü ����
		Scanner scan = new Scanner(System.in);
		
		char grade;
		
		// scan ��ü�� �̿��� ���� �Է¹ޱ�.
		System.out.print("������ �Է��ϼ���(0~100): ");
		int score = scan.nextInt();
		
		// �Է¹��� ���� ���� 10���� ������
		switch (score/10) 
		{
			case 10: 					// score = 100���̰ų�
			case 9: 					// score�� 90~99�� �̸�
				grade = 'A';			// ������ A
				break;
			case 8: 					// score�� 80~89�� �̸�
				grade = 'B';			// ������ B
				break;
			case 7: 					// score�� 70~79�� �̸�
				grade = 'C';			// ������ C
				break;
			case 6: 					// score�� 60~69�� �̸�
				grade = 'D';			// ������ D
				break;
			default: 					// score�� 59�� �����̸�
				grade = 'F';			// ������ F
		}
		System.out.println("������ "+grade+"�Դϴ�");
		
		// ��ĳ�� ����
		scan.close();		
	}
}
