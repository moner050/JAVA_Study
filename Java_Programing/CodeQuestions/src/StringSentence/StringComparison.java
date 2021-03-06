package StringSentence;

import java.util.Scanner;

public class StringComparison {

	public static void main(String[] args){
		
		/*
		 * # 문자열 비교
		 * . equals() 메서드 사용없이 문자의 일치여부 비교
		 * 예)
		 * 코끼리
		 * 입력 = 티라노사우루스
		 * 출력 = false
		 */
		Scanner scan = new Scanner(System.in);
		int chk = 0;
		String name = "코끼리";
		
		System.out.print("동물 이름을 입력하세요 : ");			// ex) 티라노사우루스
		String myName = scan.next();

		if(name.length() == myName.length())
		{
			chk = 1;
			for(int i = 0; i < name.length(); i++)
			{
				if(name.charAt(i) == myName.charAt(i)) chk = 1;
				else chk = 0;
			}
		}

		if(chk == 0) System.out.println("출력 = false");
		else System.out.println("출력 = true");
		scan.close();
	}
}
