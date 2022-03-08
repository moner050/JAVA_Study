package arraySentence;

public class DESFind {
	/*
	 * # 정렬하기
	 * 1. 인덱스 0번이 나머지를 검사한다.
	 * 2. 제일 큰 값을 찾아 교환한다.
	 * 3. 인덱스 1증가한다.
	 * 4. [1~3]을 끝까지 반복한다.
	 * 예)
	 * 10, 50, 30, 40, 80, 7
	 * 80, 50, 30, 40, 10, 7
	 * 80, 50, 30, 40, 10, 7
	 * 80, 50, 40, 30, 10, 7
	 */
	public static void main(String[] args) {

		int[] score = {10, 50, 30, 40, 80, 7};
		
		for(int i = 0; i < score.length; i++)
		{
			int maxNum = score[i];
			int maxIdx = i;
			
			for(int k = 0; k < score.length; k++)
			{
				System.out.print(score[k] + " ");
			}
			System.out.println();
			
			for(int j = i; j < score.length; j++)
			{
				if(maxNum < score[j]) 
				{
					maxNum = score[j];
					maxIdx = j;
				}
			}
			
			int temp = score[i];
			score[i] = score[maxIdx];
			score[maxIdx] = temp;
		
		}
		
	}

}
