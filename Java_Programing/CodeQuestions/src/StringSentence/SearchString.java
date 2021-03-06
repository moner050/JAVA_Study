package StringSentence;

import java.util.Scanner;

public class SearchString {

	public static void main(String[] args) {
		/*
		 * # 문자열 속 숫자검사
		 * 예) adklajsiod
		 * 	     문자만 있다.
		 * 예) 123123
		 *    숫자만 있다.
		 * 예) dasd12312asd
		 *    문자와 숫자가 섞여있다.
		 */
		Scanner scan = new Scanner(System.in);
		
		System.out.print("입력 : ");
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
		
		if(cnt == 0) System.out.println("문자만 있다.");
		else if(cnt == text.length()) System.out.println("숫자만 있다.");
		else System.out.println("문자와 숫자가 섞여있다.");
		
		scan.close();
	}

}
