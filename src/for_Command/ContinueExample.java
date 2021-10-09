package for_Command;

import java.util.Scanner;

public class ContinueExample {

	public static void main(String[] args) {
		// Scanner의 객체 생성
		Scanner scan = new Scanner(System.in);
		
		
		// scan 객체를 이용해 정수 입력받기.
		System.out.println("정수를 5개 입력하세요");
		// 정수형 변수 sum = 0 선언
		int sum = 0;
		
		for(int i=0; i<5; i++) 
		{
			int n = scan.nextInt(); // 키보드에서 정수 입력
			
			if(n<=0) 
			{
				continue; // 양수가 아닌 경우 다음 반복으로 진행
			}
			else 
			{
				sum += n; // 양수인 경우 덧셈
			}
		}
		System.out.println("양수의 합은 " + sum);
		
		// 스캐너 종료
		scan.close();
	}
}
