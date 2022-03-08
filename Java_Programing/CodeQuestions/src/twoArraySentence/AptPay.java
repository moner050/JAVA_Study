package twoArraySentence;

import java.util.Scanner;

public class AptPay {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[][] apt = {
				{101, 102, 103},	
				{201, 202, 203},	
				{301, 302, 303}	
			};
			
		int[][] pay = {
				{1000, 2100, 1300},	
				{4100, 2000, 1000},	
				{3000, 1600,  800}
			};
			
		// ���� 1) ������ ������ �� ���
		// ���� 1) 4400, 7100, 5400
		for(int i = 0; i < pay.length; i++)
		{
			int sum = 0;
			for(int j = 0; j < pay[i].length; j++)
			{
				sum += pay[i][j];
			}
			System.out.print(sum + " ");
		}
		System.out.println();
		
		// ���� 2) ȣ�� �Է��ϸ� ������ ���
		// ��    2) �Է� : 202	������ ��� : 2000
		int buildingIdx1 = 0, buildingIdx2 = 0;
		System.out.println("ȣ�� �Է��ϼ��� : ");
		int building = scan.nextInt();
		
		for(int i = 0; i < apt.length; i++)
		{
			for(int j = 0; j < apt[i].length; j++)
			{
				if(building == apt[i][j])
				{
					buildingIdx1 = i;
					buildingIdx2 = j;
				}
			}
		}
		System.out.printf("������ ��� : %d\n",pay[buildingIdx1][buildingIdx2]);
		
		
		// ���� 3) ������ ���� ���� ���� ��, ���� ���� �� ���
		// ���� 3) ���� ���� ���� ��(201), ���� ���� ���� ��(303)
		int maxPay = 0, minPay = 9999999;
		int maxIdx1 = 0, maxIdx2 = 0, minIdx1 = 0, minIdx2 = 0;
		
		for(int i = 0; i < apt.length; i++)
		{
			for(int j = 0; j < apt[i].length; j++)
			{
				if(maxPay < pay[i][j])
				{
					maxPay = pay[i][j];
					maxIdx1 = i;
					maxIdx2 = j;
				}
				if(minPay > pay[i][j])
				{
					minPay = pay[i][j];
					minIdx1 = i;
					minIdx2 = j;
				}
			}
		}
		
		System.out.printf("������ ���� ���� ���� ��(%d), ���� ���� ���� ��(%d)\n",apt[maxIdx1][maxIdx2], apt[minIdx1][minIdx2]);
		
		// ���� 4) ȣ 2���� �Է��ϸ� ������ ��ü
		int c1Idx1 = 0, c1Idx2 = 0, c2Idx1 = 0, c2Idx2 = 0; 
		System.out.print("������ �ٲ� ȣ�� �Է��ϼ��� : ");
		int change1 = scan.nextInt();
		System.out.print("������ �ٲ� ȣ�� �Է��ϼ��� : ");
		int change2 = scan.nextInt();
		
		for(int i = 0; i < apt.length; i++)
		{
			for(int j = 0; j < apt[i].length; j++)
			{
				if(change1 == apt[i][j])
				{
					c1Idx1 = i;
					c1Idx2 = j;
				}
				if(change2 == apt[i][j])
				{
					c2Idx1 = i;
					c2Idx2 = j;
				}
			}
		}
		
		int temp = pay[c1Idx1][c1Idx2];
		pay[c1Idx1][c1Idx2] = pay[c2Idx1][c2Idx2];
		pay[c2Idx1][c2Idx2] = temp;
		
		for(int i = 0; i < pay.length; i++)
		{
			for(int j = 0; j < pay[i].length; j++)
			{
				System.out.print(pay[i][j] + " ");
			}
			System.out.println();
		}
	}

}
