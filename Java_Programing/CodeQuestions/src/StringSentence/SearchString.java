package StringSentence;

import java.util.Scanner;

public class SearchString {

	public static void main(String[] args) {
		/*
		 * # ���ڿ� �� ���ڰ˻�
		 * ��) adklajsiod
		 * 	     ���ڸ� �ִ�.
		 * ��) 123123
		 *    ���ڸ� �ִ�.
		 * ��) dasd12312asd
		 *    ���ڿ� ���ڰ� �����ִ�.
		 */
		Scanner scan = new Scanner(System.in);
		
		System.out.print("�Է� : ");
		String text = scan.next();
		
		char[] charNum = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
		int cnt = 0;
		
		for(int i = 0; i < text.length(); i++)
		{
			for(int j = 0; j < charNum.length; j++)
			{
				if(text.charAt(i) == charNum[j]) cnt++;
			}
		}
		
		if(cnt == 0) System.out.println("���ڸ� �ִ�.");
		else if(cnt == text.length()) System.out.println("���ڸ� �ִ�.");
		else System.out.println("���ڿ� ���ڰ� �����ִ�.");
		
		scan.close();
	}

}
