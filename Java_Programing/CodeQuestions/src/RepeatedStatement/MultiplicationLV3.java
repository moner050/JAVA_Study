package RepeatedStatement;

import java.util.Random;
import java.util.Scanner;

public class MultiplicationLV3 {
	/*
	 * # 구구단 게임[3단계]
	 * 1. 구구단 게임을 5회 반복한다.
	 * 2. 정답을 맞추면 20점이다.
	 * 3. 게임 종료 후, 성적을 출력한다.
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
				System.out.println("정답입니다.");
			}
			else
			{
				System.out.println("틀렸습니다.");
			}
			
			i++;
		}
		score = cnt * 20;
		System.out.println("점수는 " + score + " 점입니다.");
		
		scan.close();
	}

}
