package conditionalSentence;

import java.util.Scanner;
public class RockScissorsPaperLV1 {
	/*
	 * # ����(0)����(1)��(2) ����[1�ܰ�]
	 * 1. com�� ����(1)�� �� �� �ִ�.
	 * 2. me�� 0~2 ������ ���ڸ� �Է¹޴´�.
	 * 3. com�� me�� ����,
	 * 		1) ����.
	 * 		2) ���� �̰��.
	 * 		3) ���� ����.			�� ����Ѵ�.
	*/
	public static void main(String[] args) {

		int com = 1;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("����(0)����(1)��(2)");
		System.out.print("0~2 ������ ���ڸ� �Է����ּ��� : ");
		int me = scan.nextInt();
		
		if(me < com) {System.out.println("���� ����.");}
		else if(me == com) {System.out.println("����.");}
		else if(me > com) {System.out.println("���� �̰��.");}
		
		scan.close();
	}
}
