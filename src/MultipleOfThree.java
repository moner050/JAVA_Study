import java.util.Scanner;
public class MultipleOfThree {
	public static void main(String[] args) {
		// Scanner�� ��ü ����
		Scanner scan = new Scanner(System.in);
		
		// scan��ü�� �̿��� ���� �Է� �ޱ�
		System.out.print("���� �Է��ϼ��� : ");
		int num = scan.nextInt();
		
		// num�� 3���� ������ ��������
		if (num % 3 == 0)
		{
			System.out.println("3�� ����Դϴ�.");
		}
		else // �ƴϸ�
			System.out.println("3�� ����� �ƴմϴ�.");

		// ��ĳ�� ����
		scan.close();
	}
}
