package twoArraySentence;

import java.util.Random;

public class Lotto1Set {
	/*
	 * # ��÷���� 1��Ʈ
	 * 1. 3�� �������� 3�� �����ϸ� ��÷�����̴�.
	 * 2. �������� 5���� ������ �����ϵ�,
	 *    ��÷������ �� ���� �����ǵ��� �����Ѵ�.
	 */
	public static void main(String[] args) {

		Random ran = new Random();
		int[][] lottoSet = new int[5][7];
		int prize = 0;
		
		for(int i = 0; i < lottoSet.length; i++)
		{
			for(int j = 0; j < lottoSet[i].length; j++)
			{
				int num = ran.nextInt(2);
				if(num == 0) lottoSet[i][j] = 3;
				else lottoSet[i][j] = 0;
			}
			
			int cnt = 0, chk = 0;
			
			for(int j = 0; j < lottoSet[i].length; j++)
			{
				if(lottoSet[i][j] == 3) cnt++;
				else cnt = 0;
				
				if(cnt == 3) chk = 1;
			}
			
			if(chk == 1 && prize == 0) prize++;
			else if(chk == 1 && prize == 1) i--;
			else if(chk == 0 && prize == 0) i--;
		}
		
		System.out.println("===��÷��ȣ===");
		for(int i = 0; i < lottoSet.length; i++)
		{
			for(int j = 0; j < lottoSet[i].length; j++)
			{
				System.out.print(lottoSet[i][j]);
			}
			System.out.println();
		}
	}

}
