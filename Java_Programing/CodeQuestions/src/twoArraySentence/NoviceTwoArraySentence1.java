package twoArraySentence;

public class NoviceTwoArraySentence1 {

	public static void main(String[] args) {
		
		int[][] arr = new int[3][3];
		
		int k = 1;
		int sum = 0, fourSum = 0, fourCnt = 0;
		for (int i = 0; i < 3; i++) 
		{
			for (int j = 0; j < 3; j++) 
			{
				arr[i][j] = 10 * k;
				sum += arr[i][j];
				k += 1;
			}
		}

		// ���� 1) ��ü �� ���
		// ���� 1) 450
		System.out.println(sum);
		
		// ���� 2) 4�� ����� ���
		// ���� 2) 20 40 60 80
		for(int i = 0; i < 3; i++)
		{
			for (int j = 0; j < 3; j++) 
			{
				if(arr[i][j] % 4 == 0)
				{
					System.out.print(arr[i][j] + " ");
					fourSum += arr[i][j];
					fourCnt++;
				}
			}
		}
		System.out.println();
		
		// ���� 3) 4�� ����� �� ���
		// ���� 3) 200
		System.out.println(fourSum);

		// ���� 4) 4�� ����� ���� ���
		// ���� 4) 4
		System.out.println(fourCnt);

	}

}
