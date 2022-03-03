package ConditionalSentence;

import java.util.Scanner;

public class LoginLV1 {
	/*
	 * # 로그인[1단계]
	 * 1. Id와 Pw를 입력받는다.
	 * 2. 입력받은 데이터와 db데이터를 비교해 로그인 처리를 진행한다.
	 * 예) 로그인 성공 or 로그인 실패
	*/

	public static void main(String[] args) {

		int dbId = 1234;
		int dbPw = 1111;

		Scanner scan = new Scanner(System.in);
		
		System.out.print("아이디를 입력해주세요(숫자) : ");
		int ipId = scan.nextInt();
		System.out.print("비밀번호를 입력해주세요(숫자) : ");
		int ipPw = scan.nextInt();
		
		if((dbId == ipId) && (dbPw == ipPw))
		{
			System.out.println("로그인 성공");
		}
		else 
		{
			System.out.println("로그인 실패");
		}
		
		scan.close();
	}

}
