package twoArraySentence;

import java.util.Random;

public class Lotto1Set {
	/*
	 * # 당첨복권 1셋트
	 * 1. 3이 연속으로 3번 등장하면 당첨복권이다.
	 * 2. 랜덤으로 5개의 복권을 생성하되,
	 *    당첨복권은 한 개만 생성되도록 설정한다.
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
		
		System.out.println("===당첨번호===");
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
