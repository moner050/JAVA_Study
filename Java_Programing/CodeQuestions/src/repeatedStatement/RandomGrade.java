package repeatedStatement;

import java.util.Random;

public class RandomGrade {
	/*
	 * # �����л�
	 * 1. 10ȸ �ݺ��� �Ѵ�.
	 * 2. 1~100 ������ ���� ���ڸ� �����Ѵ�.(�л��� ����)
	 * 3. ������ 60�� �̻��̸� �հݻ��̴�.
	 * ---------------------------------------
	 * . ������(10��)�� ������ ����� ����Ѵ�.
	 * . �հ��� ���� ����Ѵ�.
	 * . 1�� �л��� ��ȣ�� ������ ����Ѵ�.
	*/
	public static void main(String[] args) {

		Random ran = new Random();
		
		int accepted = 0;
		int totalScore = 0;
		double average = 0.0;
		
		int maxScore = 0;
		int maxNum = 0;
		
		int i = 1;
		while(i <= 10)
		{
			int score = ran.nextInt(100) + 1;
			totalScore += score;
			if(score >= 60)
			{
				accepted++;
			}

			if(maxScore < score)
			{
				maxScore = score;
				maxNum = i;
			}
			i++;
		}
		
		average = totalScore / 10.0;
		System.out.println("������ ���� : " + totalScore + ", ������� : " + average);
		System.out.println("�հ��ڼ� : " + accepted);
		System.out.println("1�� �л� ��ȣ : " + maxNum + "��, 1�� �л� ���� : " + maxScore + "��");
		
	}

}
