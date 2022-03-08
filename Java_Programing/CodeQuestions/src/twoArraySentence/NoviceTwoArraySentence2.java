package twoArraySentence;

import java.util.Scanner;

public class NoviceTwoArraySentence2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[][] arr = new int[3][3];
		
		int k = 1;
		for(int i=0; i<3; i++) 
		{
			for(int j=0; j<3; j++) 
			{
				arr[i][j] = 10 * k;
				k += 1;
			}
		}
		
		// ���� 1) �ε��� 2���� �Է¹޾� �� ���
		// ��    1) �ε���1 �Է� : 1	�ε���2 �Է� : 2
		//		   �� ��� : 60 
		System.out.print("�ε��� 1 �Է� : ");
		int idx1 = scan.nextInt();
		System.out.print("�ε��� 2 �Է� : ");
		int idx2 = scan.nextInt();
		System.out.println(arr[idx1][idx2]);
		
		
		// ���� 2) ���� �Է¹޾� �ε��� 2�� ���
		// ��    2) �� �Է� : 60
		//		   �ε���1 ��� : 1	�ε���2 ��� : 2
		int outIdx1 = 0, outIdx2 = 0;
		System.out.print("�� �Է� : ");
		int value = scan.nextInt();
		
		for(int i=0; i<3; i++) 
		{
			for(int j=0; j<3; j++) 
			{
				if(value == arr[i][j])
				{
					outIdx1 = i;
					outIdx2 = j;
				}
			}
		}
		
		System.out.printf("�ε���1 ��� : %d\t�ε���2 ��� : %d\n",outIdx1, outIdx2);
		
		
		// ���� 3) ���� ū ���� �ε��� 2�� ���
		// ���� 3) 2 2
		int maxValue = 0;
		int maxIdx1 = 0, maxIdx2 = 0;
		
		for(int i=0; i<3; i++) 
		{
			for(int j=0; j<3; j++) 
			{
				if(maxValue < arr[i][j])
				{
					maxIdx1 = i;
					maxIdx2 = j;
				}
			}
		}
		System.out.printf("���� ū ���� �ε��� %d  %d\n",maxIdx1, maxIdx2);
		
		
		// ���� 4) �� 2���� �Է¹޾� �� ��ü
		int changeIdx1 = 0, changeIdx2 = 0;
		int changeIdx11 = 0, changeIdx22 = 0;
		System.out.print("��1 �Է� : ");
		int ipValue1 = scan.nextInt();
		System.out.print("��2 �Է� : ");
		int ipValue2 = scan.nextInt();

		for(int i=0; i<3; i++) 
		{
			for(int j=0; j<3; j++) 
			{
				if(ipValue1 == arr[i][j])
				{
					changeIdx1 = i;
					changeIdx2 = j;
				}
				if(ipValue2 == arr[i][j])
				{
					changeIdx11 = i;
					changeIdx22 = j;
				}
			}
		}
		int temp = arr[changeIdx1][changeIdx2];
		arr[changeIdx1][changeIdx2] = arr[changeIdx11][changeIdx22];
		arr[changeIdx11][changeIdx22] = temp;
		
		for(int i=0; i<3; i++) 
		{
			for(int j=0; j<3; j++) 
			{
				System.out.print(arr[i][j] + " ");
			}
		}
		System.out.println();
		
		scan.close();
	}

}
