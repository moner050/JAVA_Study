package conditionalSentence;

import java.util.Random;
import java.util.Scanner;

public class CoinGame {
	/*
	 * # ���� ����
	 * 1. 0 �Ǵ� 1�� ���� ���ڸ� �����Ѵ�.
	 * 2. 0�� ������ �ո�, 1�� ������ �޸��̴�.
	 * 3. ������ �յ޸��� ���ߴ� �����̴�.
	*/
	public static void main(String[] args)
	{
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		int coin = ran.nextInt(2);
		
		System.out.print("������ ���̸� 0, �ڸ� 1�� �Է����ּ��� : ");
		int ipCoin = scan.nextInt();
		
		if(coin == ipCoin) {System.out.println("�����Դϴ�.");}
		else 
		{
			System.out.println("Ʋ�Ƚ��ϴ�.");
			System.out.println("������ " + coin + " �Դϴ�.");
		}
		
		scan.close();
	}
}
