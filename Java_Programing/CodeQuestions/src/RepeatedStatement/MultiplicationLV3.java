package RepeatedStatement;

import java.util.Random;
import java.util.Scanner;

public class MultiplicationLV3 {
	/*
	 * # ������ ����[3�ܰ�]
	 * 1. ������ ������ 5ȸ �ݺ��Ѵ�.
	 * 2. ������ ���߸� 20���̴�.
	 * 3. ���� ���� ��, ������ ����Ѵ�.
	*/
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int score = 0;
		int cnt = 0;
		int i = 1;
		
		while(i <= 5)
		{
			int fNum = ran.nextInt(8) + 2;
			int sNum = ran.nextInt(9) + 1;
			int result = fNum * sNum;
			
			System.out.print(fNum + " X " + sNum + " = ");
			int ipResult = scan.nextInt();
			
			if(ipResult == result) 
			{
				cnt++;
				System.out.println("�����Դϴ�.");
			}
			else
			{
				System.out.println("Ʋ�Ƚ��ϴ�.");
			}
			
			i++;
		}
		score = cnt * 20;
		System.out.println("������ " + score + " ���Դϴ�.");
		
		scan.close();
	}

}
