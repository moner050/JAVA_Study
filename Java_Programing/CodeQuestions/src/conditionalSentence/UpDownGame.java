package conditionalSentence;

import java.util.Scanner;

public class UpDownGame {

	/*
	 * # Up & Down 게임[1단계]
	 * 1. com은 8이다.
	 * 2. me는 숫자를 하나입력받는다.
	 * 3. com 과 me 를 비교해서 다음과 같은 메세지를 출력한다.
	 * 1) me < com	: Up!
	 * 2) me == com : Bingo!
	 * 3) me > com  : Down!
	*/
	
	public static void main(String[] args) {

		int com = 8;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("숫자를 입력해주세요 : ");
		int me = scan.nextInt();
		
		if(me < com) {System.out.println("Up!");}
		else if(me == com) {System.out.println("Bingo!");}
		else if(me > com) {System.out.println("Down!");}
		
		scan.close();
		
		
	}

}
