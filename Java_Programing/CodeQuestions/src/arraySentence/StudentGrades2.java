package arraySentence;

import java.util.Scanner;

public class StudentGrades2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// �ε��� 0 1 2 3 4
		int[] arr = { 87, 11, 45, 98, 23 };

		// ����1) �ε����� �Է¹޾� ���� ���
		// ����1) �ε��� �Է� : 1 ���� : 11��
		System.out.print("�ε��� �Է� : ");
		int ipIdx = scan.nextInt();
		System.out.println("���� : " + arr[ipIdx]);
		
		
		// ����2) ������ �Է¹޾� �ε��� ���
		// ����2) ���� �Է� : 11 �ε��� : 1
		System.out.print("���� �Է� : ");
		int grade = scan.nextInt();
		int idx = 0;
		
		for(int i = 0; i < arr.length; i++)
		{
			if(grade == arr[i]) {idx = i;}
		}
		System.out.println("�ε��� : " + idx);
		
		
		
		int[] hakbuns = { 1001, 1002, 1003, 1004, 1005 };
		int[] scores = { 87, 11, 45, 98, 23 };

		// ����3) �й��� �Է¹޾� ���� ���
		// ����3) �й� �Է� : 1003 ���� : 45��
		idx = 0;
		
		System.out.print("�й� �Է� : ");
		int ipHakbuns = scan.nextInt();
		
		for(int i = 0; i < hakbuns.length; i++)
		{
			if(hakbuns[i] == ipHakbuns) {idx = i;}
		}
		System.out.println("���� : " + scores[idx] + "��");
		
		
		scan.close();
	}

}
