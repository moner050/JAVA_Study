package StringSentence;

import java.util.Scanner;

public class WordChainGame {

	public static void main(String[] args) {

		/*
		 * # �����ձ� ����
		 * ���þ� : ������
		 * �Է� : �Ź�
		 * ���þ� : �Ź�
		 * �Է� : �̼�
		 * ...
		 */
		Scanner scan = new Scanner(System.in);
		
		String start = "������";
		while(true)
		{
			System.out.println("���þ� : " + start);
			System.out.print("�Է� : ");
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
