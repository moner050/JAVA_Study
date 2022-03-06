package arraySentence;

import java.util.Scanner;

public class BaseballGame {
	/*
	 * # ���� �߱� ����
	 * 1. me�� 1~9 ������ ���� 3���� ����
	 *    (��, �ߺ��Ǵ� ���ڴ� ���� �Ұ�)
	 * 2. com�� me�� ���� ������ ���� ������ �ݺ�
	 * 3. ���ڿ� �ڸ��� ������ 		strike += 1
	 *    ���ڸ� ���� �ڸ��� Ʋ���� 	ball += 1
	 * ��)
	 * ���� : 1 7 3
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
				System.out.print("["+(i+1)+"] ���� ���ڸ� �Է����ּ��� (1~9����) : ");
				int ipNum = scan.nextInt();
				
				for(int j = 0; j < me.length; j++)
				{
					if(ipNum == me[j]) chk = -1;
				}
				
				if(chk == -1) i--;
				else me[i] = ipNum;
			}
			System.out.println();
			
			// com�� �迭 ���
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
