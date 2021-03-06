package StringSentence;

import java.util.Random;
import java.util.Scanner;

public class TypingSentence {

	public static void main(String[] args) {
		/*
		 * # 타자연습 게임[1단계]
		 * 1. 문제를 섞는다.(shuffle)
		 * 2. 순서대로 문제를 출제하고, 문제를 다 맞추면 게임 종료
		 * 예)
		 * 문제 : mysql
		 * 입력 : mydb
		 * 문제 : mysql
		 * 입력 : mysql	<--- 정답을 맞추면, 다음 문제 제시
		 * 문제 : jsp
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
			System.out.println("문제 : " + words[j]);
			System.out.print("입력 : ");
			String ipWord = scan.next();
			
			if(words[j].equals(ipWord)) j++;
		}
		scan.close();
	}

}
