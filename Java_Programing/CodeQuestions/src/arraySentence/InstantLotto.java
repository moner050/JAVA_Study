package arraySentence;

import java.util.Scanner;

public class InstantLotto {
	/*
	 * # �Ｎ���� 1. ���� 7�� �������� 3�� �����ϸ�, "��÷" ���.
	 * 
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
//		int[] lotto = { 0, 0, 7, 7, 7, 0, 0, 0 };
		int[] lotto = {7, 0, 7, 7, 0, 7, 0, 7};
		int chk = 0;

		System.out.println("1) ���� ���Ȯ��");
		System.out.print("�޴� ���� : ");
		int sel = scan.nextInt();

		if (sel == 1) 
		{
			for(int i = 0; i < lotto.length - 3; i++)
			{
				if( lotto[i] == 7 && lotto[i+1] == 7 && lotto[i+2] == 7) {chk = 1; break;}
				else { chk = 0; }
			}
			if(chk == 1) {System.out.println("��÷");}
			else {System.out.println("��");}
		}
		
		scan.close();
		
		
	}

}
