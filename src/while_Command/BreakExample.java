package while_Command;

import java.util.Scanner;

public class BreakExample {

	public static void main(String[] args) {
		// Scanner의 객체 생성
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("exit 을 입력하면 종료합니다.");
		
		while(true) 
		{
			System.out.print(">> ");
			// scan 객체를 이용해 문자 입력받기.
			String text = scan.nextLine();
			// exit을 입력받으면 while문 종료.
			if(text.equals("exit"))
			{
				break;
			}
			else
			{
				continue;
			}
		}
		System.out.println("종료합니다.");
		
		// 스캐너 종료.
		scan.close();
	}
}
