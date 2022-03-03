package ConditionalSentence;

import java.util.Scanner;

public class Validation {
	/*
	 * # 점수 유효성 검사
	 * 1. 점수을 입력받는다.
	 * 2. 점수가  60점 이상이면 합격, 60점 미만이면 불합격이다.
	 * 3. 단, 입력받은 정수가 
	 *    음수이거나 100점을 초과하면, 예외 메세지를 출력한다.
	 *    예) 점수를  잘못 입력했습니다.
	*/
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("점수를 입력해주세요 : ");
		int IpScore = scan.nextInt();
		
		if((IpScore < 0) || (IpScore > 100))
		{
			System.out.println("점수를 잘못 입력하셨습니다.");
		}
		else
		{
			if(IpScore >= 60)
			{
				System.out.println("합격입니다.");
			}
			else
			{
				System.out.println("불합격입니다.");
			}
		}
		
		scan.close();
	}
}
