package StringSentence;

import java.util.Random;
import java.util.Scanner;

public class TypingSentence {

	public static void main(String[] args) {
		/*
		 * # Ÿ�ڿ��� ����[1�ܰ�]
		 * 1. ������ ���´�.(shuffle)
		 * 2. ������� ������ �����ϰ�, ������ �� ���߸� ���� ����
		 * ��)
		 * ���� : mysql
		 * �Է� : mydb
		 * ���� : mysql
		 * �Է� : mysql	<--- ������ ���߸�, ���� ���� ����
		 * ���� : jsp
		 */
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		String[] words = {"java", "mysql", "jsp", "spring"};
		
		for(int i = 0; i < 1000; i++)
		{
			int r = ran.nextInt(words.length);
			String temp = words[0];
			words[0] = words[r];
			words[r] = temp;
		}
		
		int j = 0;
		while(j < words.length)
		{
			System.out.println("���� : " + words[j]);
			System.out.print("�Է� : ");
			String ipWord = scan.next();
			
			if(words[j].equals(ipWord)) j++;
		}
		scan.close();
	}

}
