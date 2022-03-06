package conditionalSentence;

import java.util.Random;
import java.util.Scanner;

public class CoinGame {
	/*
	 * # 코인 게임
	 * 1. 0 또는 1의 랜덤 숫자를 저장한다.
	 * 2. 0은 동전의 앞면, 1은 동전의 뒷면이다.
	 * 3. 동전의 앞뒷면을 맞추는 게임이다.
	*/
	public static void main(String[] args)
	{
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		int coin = ran.nextInt(2);
		
		System.out.print("동전이 앞이면 0, 뒤면 1을 입력해주세요 : ");
		int ipCoin = scan.nextInt();
		
		if(coin == ipCoin) {System.out.println("정답입니다.");}
		else 
		{
			System.out.println("틀렸습니다.");
			System.out.println("정답은 " + coin + " 입니다.");
		}
		
		scan.close();
	}
}
