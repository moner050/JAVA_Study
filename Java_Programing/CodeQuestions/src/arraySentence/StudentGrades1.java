package arraySentence;

import java.util.Random;

public class StudentGrades1 {

	public static void main(String[] args) {
		
		Random ran = new Random();
		
		int[] arr = new int[5];
		int total = 0;
		double avg = 0.0;
		int cnt = 0;

		// ����1) arr�迭�� 1~100�� ������ ������ 5�� ����
		// ��   1) 87, 11, 92, 14, 47
		for(int i = 0; i < 5; i++)
		{
			int ranNum = ran.nextInt(100)+1;
			arr[i] = ranNum;
			System.out.print(arr[i] + " ");
			
			if(arr[i] >= 60) {cnt++;}
			total += arr[i];
		}
		
		// ����2) �������� ������ ��� ���
		// ��   2) ����(251) ���(50.2)
		avg = total / (double)arr.length;
		System.out.println("\n����(" + total +") ���(" + avg + ")");
		
		
		// ����3) ������ 60�� �̻��̸� �հ�. �հݻ� �� ���
		// ��   3) 2��
		System.out.println("�հݻ� �� : " + cnt + "��");
	}

}
