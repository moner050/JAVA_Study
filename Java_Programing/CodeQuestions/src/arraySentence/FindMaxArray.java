package arraySentence;

import java.util.Scanner;

public class FindMaxArray {
	/*
	 * # �ִ밪 ���ϱ�
	 * 1. ���� ū ���� ã�� �Է��Ѵ�.
	 * 2. �����̸� �ش� ���� 0���� �����Ѵ�.
	 * 3. arr�迭�� ��� ���� 0���� ����Ǹ� ���α׷��� ����ȴ�.
	 * ��)
	 * 11, 87, 42, 100, 24
	 * �Է� : 100
	 * 
	 * 11, 87, 42, 0, 24
	 * �Է� : 87
	 * 
	 * 11, 0, 42, 0, 24
	 */
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int[] arr = {11, 87, 42, 100, 24};
		
		while(true)
		{
			int cnt = 0;
			int max = 0;
			int maxIdx = 0;
			// �迭��� �� �ִ밪 ã��
			for(int i = 0; i < arr.length; i++)
			{
				if(max < arr[i]) 
				{
					max = arr[i];
					maxIdx = i;
				}
				
				if(arr[i] == 0)
				{
					cnt++;
				}
				System.out.print(arr[i] + " ");
			}
			
			if(cnt == 5) break;
			
			System.out.print("\n�迭 ���� ���� ū ���� ã���ÿ� : ");
			int ipMax = scan.nextInt();
			
			if(max == ipMax) { arr[maxIdx] = 0;}
			else continue;
		}
		
		scan.close();

	}

}
