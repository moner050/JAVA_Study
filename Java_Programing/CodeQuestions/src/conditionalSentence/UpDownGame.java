package conditionalSentence;

import java.util.Scanner;

public class UpDownGame {

	/*
	 * # Up & Down ����[1�ܰ�]
	 * 1. com�� 8�̴�.
	 * 2. me�� ���ڸ� �ϳ��Է¹޴´�.
	 * 3. com �� me �� ���ؼ� ������ ���� �޼����� ����Ѵ�.
	 * 1) me < com	: Up!
	 * 2) me == com : Bingo!
	 * 3) me > com  : Down!
	*/
	
	public static void main(String[] args) {

		int com = 8;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("���ڸ� �Է����ּ��� : ");
		int me = scan.nextInt();
		
		if(me < com) {System.out.println("Up!");}
		else if(me == com) {System.out.println("Bingo!");}
		else if(me > com) {System.out.println("Down!");}
		
		scan.close();
		
		
	}

}
