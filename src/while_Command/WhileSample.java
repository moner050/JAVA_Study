package while_Command;

import java.util.Scanner;

public class WhileSample {

	public static void main(String[] args) {
		// Scanner의 객체 생성
		Scanner scan = new Scanner(System.in);
		
		int cnt = 0;		// 입력된 정수의 개수 카운트
		int sum = 0;		// 합
		
		// scan 객체를 이용해 메뉴 입력받기.
		System.out.println("정수를 입력하고 마지막에 -1을 입력하세요.");
		
		int n = scan.nextInt();
		
		// n에 -1이 입력되기 전 까지 반복.
		while(n != -1)
		{
			sum += n;
			cnt++;
			n = scan.nextInt();
		}
		// 입력된 정수의 개수가 0개면
		if(cnt == 0) System.out.println("입력된 수가 없습니다.");
		else // 정수의 개수가 0개보다 많으면
		{
			System.out.print("정수의 개수는 " + cnt + "개이며 ");
			System.out.println("평균은 " + (double)sum/cnt + "입니다.");
		}
		
		// 스캐너 종료
		scan.close();
	}

}
