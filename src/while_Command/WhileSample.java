package while_Command;

import java.util.Scanner;

public class WhileSample {

	public static void main(String[] args) {
		// Scanner�� ��ü ����
		Scanner scan = new Scanner(System.in);
		
		int cnt = 0;		// �Էµ� ������ ���� ī��Ʈ
		int sum = 0;		// ��
		
		// scan ��ü�� �̿��� �޴� �Է¹ޱ�.
		System.out.println("������ �Է��ϰ� �������� -1�� �Է��ϼ���.");
		
		int n = scan.nextInt();
		
		// n�� -1�� �ԷµǱ� �� ���� �ݺ�.
		while(n != -1)
		{
			sum += n;
			cnt++;
			n = scan.nextInt();
		}
		// �Էµ� ������ ������ 0����
		if(cnt == 0) System.out.println("�Էµ� ���� �����ϴ�.");
		else // ������ ������ 0������ ������
		{
			System.out.print("������ ������ " + cnt + "���̸� ");
			System.out.println("����� " + (double)sum/cnt + "�Դϴ�.");
		}
		
		// ��ĳ�� ����
		scan.close();
	}

}
