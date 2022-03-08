package twoArraySentence;

public class NoviceTwoArraySentence3 {

	public static void main(String[] args)
	{
		int[][] arr = {
				{101, 102, 103, 104},
				{201, 202, 203, 204},
				{301, 302, 303, 304}
			}; 
			
			int[] garo = new int[3];
			int[] sero = new int[4];
			
		// 문제 1) 가로 합 출력
		// 정답 1) 410, 810, 1210
		for(int i = 0; i < 3; i++)
		{
			int sum = 0;
			for(int j = 0; j < 4; j++)
			{
				sum += arr[i][j];
			}
			garo[i] = sum;
		}
		for(int num : garo)
		{
			System.out.print(num + " ");
		}
		
		System.out.println();
			
		// 문제 2) 세로 합 출력
		// 정답 2) 603, 606, 609, 612
		for(int i = 0; i < 4; i++)
		{
			int sum = 0;
			for(int j = 0; j < 3; j++)
			{
				sum += arr[j][i];
			}
			sero[i] = sum;
		}
		for(int num : sero)
		{
			System.out.print(num + " ");
		}
		
	}
	
}
