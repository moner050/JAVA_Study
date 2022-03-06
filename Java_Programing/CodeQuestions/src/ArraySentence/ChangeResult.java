package ArraySentence;

import java.util.Scanner;

public class ChangeResult {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int[] arr = { 10, 20, 30, 40, 50 };

		// ���� 1) �ε��� 2���� �Է¹޾� �� ��ü�ϱ�
		// �� 1) �ε���1 �Է� : 1  , �ε���2 �Է� : 3
		// {10, 40, 30, 20, 50}
		int temp = 0;
		
		System.out.print("�ε���1 �Է� : ");
		int idx1 = scan.nextInt();
		System.out.print("�ε���2 �Է� : ");
		int idx2 = scan.nextInt();
		
		temp = arr[idx1];
		arr[idx1] = arr[idx2];
		arr[idx2] = temp;
		
		for(int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
		
		// ���� 2) �� 2���� �Է¹޾� �� ��ü�ϱ�
		// �� 2) ��1 �Է� : 40 , ��2 �Է� : 20
		// {10, 20, 30, 40, 50}
		int r1idx = 0, r2idx = 0;
		temp = 0;
		System.out.print("\n��1 �Է� : ");
		int result1 = scan.nextInt();
		System.out.print("��2 �Է� : ");
		int result2 = scan.nextInt();
		
		for(int i = 0; i < arr.length; i++)
		{
			if(result1 == arr[i]) {r1idx = i;}
			if(result2 == arr[i]) {r2idx = i;}
		}
		temp = arr[r1idx];
		arr[r1idx] = arr[r2idx];
		arr[r2idx] = temp;
		
		for(int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
		
		
		int[] hakbuns = { 1001, 1002, 1003, 1004, 1005 };
		int[] scores = { 87, 11, 45, 98, 23 };

		// ���� 3) �й� 2���� �Է¹޾� ���� ��ü�ϱ�
		// �� 3) �й�1 �Է� : 1002 , �й�2 �Է� : 1003
		// {87, 45, 11, 98, 23}
		int s1idx = 0, s2idx = 0;
		temp = 0;
		
		System.out.print("\n�й�1 �Է� : ");
		int sNum1 = scan.nextInt();
		System.out.print("�й�2 �Է� : ");
		int sNum2 = scan.nextInt();
		
		for(int i = 0; i < arr.length; i++)
		{
			if(sNum1 == hakbuns[i]) {s1idx = i;}
			if(sNum2 == hakbuns[i]) {s2idx = i;}
		}
		
		temp = scores[s1idx];
		scores[s1idx] = scores[s2idx];
		scores[s2idx] = temp;
		
		
		for(int i = 0; i < scores.length; i++)
		{
			System.out.print(scores[i] + " ");
		}
		
		scan.close();
	}

}
