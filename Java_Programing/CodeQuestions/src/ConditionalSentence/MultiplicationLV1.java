package ConditionalSentence;

import java.util.Scanner;

public class MultiplicationLV1 {
	/*
	 * # 구구단 게임[1단계]
	 * 1. 구구단 문제를 출제하기 위해, 숫자 2개를 입력받는다.
	 * 2. 입력받은 숫자를 토대로 구구단 문제를 출력한다.
	 * 예)	3 x 7 = ?
	 * 3. 문제에 해당하는 정답을 입력받는다.
	 * 4. 정답을 비교 "정답" 또는 "땡"을 출력한다.
	*/
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("첫번째 숫자를 입력해주세요 : ");
		int fNum = scan.nextInt();
		System.out.print("두번째 숫자를 입력해주세요 : ");
		int sNum = scan.nextInt();
		
		int mtp = fNum * sNum;
		
		System.out.println(fNum + " X " + sNum + " = ?");
		int answer = scan.nextInt();
		
		if(mtp == answer) {System.out.println("정답");}
		else {System.out.println("땡");}
	}

}
