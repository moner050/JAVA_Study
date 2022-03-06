package arraySentence;

import java.util.Scanner;

public class BaseballGame {
	/*
	 * # 숫자 야구 게임
	 * 1. me에 1~9 사이의 숫자 3개를 저장
	 *    (단, 중복되는 숫자는 저장 불가)
	 * 2. com과 me를 비교해 정답을 맞출 때까지 반복
	 * 3. 숫자와 자리가 같으면 		strike += 1
	 *    숫자만 같고 자리가 틀리면 	ball += 1
	 * 예)
	 * 정답 : 1 7 3
	 * 3 1 5		: 2b
	 * 1 5 6		: 1s
	 * ...
	 */
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] com = {1, 7, 3};
		int[] me = new int[3];		
		
		while(true)
		{
			int strike = 0, ball = 0;
			
			System.out.println();
			
			for(int i = 0; i < 3; i++)
			{
				int chk = 0;
				System.out.print("["+(i+1)+"] 번의 숫자를 입력해주세요 (1~9사이) : ");
				int ipNum = scan.nextInt();
				
				for(int j = 0; j < me.length; j++)
				{
					if(ipNum == me[j]) chk = -1;
				}
				
				if(chk == -1) i--;
				else me[i] = ipNum;
			}
			System.out.println();
			
			// com의 배열 출력
			System.out.print("com [ ");
			for(int i = 0; i < com.length; i++)
			{
				System.out.print(com[i] + " ");
			}
			System.out.println("]");
			
			System.out.print("me [ ");
			for(int i = 0; i < me.length; i++)
			{
				System.out.print(me[i] + " ");
			}
			System.out.print("]\t :");
			
			for(int i = 0; i < 3; i++)
			{
				for(int j = 0; j < 3; j++)
				{
					if(com[i] == me[j])
					{
						if(i == j) strike++;
						else ball++;
					}
				}
			}
			System.out.println(strike + "s\t" + ball +"b");
			if(strike == 3) break;
		}
		
		
	}

}
