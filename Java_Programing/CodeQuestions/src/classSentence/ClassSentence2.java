package classSentence;

import java.util.Scanner;

class Ex04 {
	int[] hakbuns = { 1001, 1002, 1003, 1004, 1005 };
	int[] scores = new int[5];
}

public class ClassSentence2 {

	public static void main(String[] args) {
		
		Ex04 school = new Ex04();
		Scanner scan = new Scanner(System.in);
		
		int[] temp = {87, 11, 92, 14, 47};
		
		// ����1) scores�迭�� 1~100�� ������ ������ 5�� ����
		// �� 1) 87, 11, 92, 14, 47
		for(int i = 0; i < school.scores.length; i++)
		{
			school.scores[i] = temp[i];
			System.out.print(school.scores[i] + " ");
		}
		
		// ����2) �������� ������ ��� ���
		// �� 2) ����(251) ���(50.2)
		int sum = 0;
		double avg = 0.0;
		for(int i = 0; i < school.scores.length; i++)
		{
			sum += school.scores[i];
		}
		avg = (double)sum / (double)school.scores.length;
		System.out.printf("\n���� : (%d) ��� : (%.1f)\n",sum, avg);

		// ����3) ������ 60�� �̻��̸� �հ�. �հݻ� �� ���
		// �� 3) 2��
		int cnt = 0;
		for(int i = 0; i < school.scores.length; i++)
		{
			if(school.scores[i] >= 60) cnt++;
		}
		System.out.println(cnt + "��");
		

		// ����4) �ε����� �Է¹޾� ���� ���
		// ����4) �ε��� �Է� : 1 ���� : 11��
		System.out.print("�ε��� �Է� : ");
		int ipIdx = scan.nextInt();
		System.out.printf("���� : %d��\n",school.scores[ipIdx]);
		
		// ����5) ������ �Է¹޾� �ε��� ���
		// ����5) ���� �Է� : 11 �ε��� : 1
		int idx = 0;
		System.out.print("���� �Է� : ");
		int ipScore = scan.nextInt();
		for(int i = 0; i < school.scores.length; i++)
		{
			if(ipScore == school.scores[i]) idx = i;
		}
		System.out.println("�ε��� : " + idx);
		// ����6) �й��� �Է¹޾� ���� ���
		// ����6) �й� �Է� : 1003 ���� : 92��
		idx = 0;
		System.out.print("�й� �Է� : ");
		int ipHakbun = scan.nextInt();
		for(int i = 0; i < school.hakbuns.length; i++)
		{
			if(ipHakbun == school.hakbuns[i]) idx = i;
		}
		System.out.println("���� : " + school.scores[idx]);
		
		// ����7) �й��� �Է¹޾� ���� ���
		// ��, �����й� �Է� �� ����ó��
		// �� 7)
		// �й� �Է� : 1002 ���� : 11��
		// �й� �Է� : 1000 �ش��й��� �������� �ʽ��ϴ�.
		idx = -1;
		System.out.print("�й� �Է� : ");
		ipHakbun = scan.nextInt();
		for(int i = 0; i < school.hakbuns.length; i++)
		{
			if(ipHakbun == school.hakbuns[i]) idx = i;
		}
		if(idx == -1) System.out.println("�ش� �й��� �������� �ʽ��ϴ�.");
		else System.out.println("���� : " + school.scores[idx]);
		
		
		// ����8) 1���л��� �й��� ���� ���
		// ����8) 1003��(92��)
		int maxIdx = 0, maxScore = 0;
		for(int i = 0; i < school.scores.length; i++)
		{
			if(maxScore < school.scores[i]) 
			{
				maxScore = school.scores[i];
				maxIdx = i;
			}
		}
		System.out.println(school.hakbuns[maxIdx] + "��(" + maxScore + ")");
	}

}
