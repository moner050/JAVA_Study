package StringSentence;

import java.util.Scanner;

public class WordChainGame {

	public static void main(String[] args) {

		/*
		 * # 끝말잇기 게임
		 * 제시어 : 자전거
		 * 입력 : 거미
		 * 제시어 : 거미
		 * 입력 : 미술
		 * ...
		 */
		Scanner scan = new Scanner(System.in);
		
		String start = "자전거";
		while(true)
		{
			System.out.println("제시어 : " + start);
			System.out.print("입력 : ");
			String ipString = scan.next();
			
			if(start.substring(start.length()-1, start.length()).equals(ipString.substring(0,1)))
			{
				start = ipString;
			}
			
			if(ipString.equals("X")) break;
		}
		scan.close();
	}

}
