import java.util.Scanner;
public class SuccessOrFail {
	public static void main(String[] args) {
		// Scanner�� ��ü ����
		Scanner scan = new Scanner(System.in);
		
		// scan��ü�� �̿��� ���� �Է� �ޱ�
		System.out.print("������ �Է��ϼ���: ");
		int score = scan.nextInt();
		
		// ���� �Է¹��� ������ 80���� �����ϰų� �� �̻��̸�
		if(score >= 80)
		{
			System.out.println("�����մϴ�! �հ��Դϴ�.");
		}
		else	// �ƴϸ�
		{
			System.out.println("���հ��Դϴ�.");
		}
		// ��ĳ�� ����
		scan.close();
	}
}
