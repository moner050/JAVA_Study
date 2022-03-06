package ArraySentence;

import java.util.Scanner;

public class CinemaSeats {

/*
 * # 영화관 좌석예매
 * 1. 사용자로부터 좌석번호(index)를 입력받아 예매하는 시스템이다.
 * 2. 예매가 완료되면 해당 좌석 값을 1로 변경한다.
 * 3. 이미 예매가 완료된 좌석은 재구매할 수 없다.
 * 4. 한 좌석당 예매 가격은 12000원이다.
 * 5. 프로그램 종료 후, 해당 영화관의 총 매출액을 출력한다.
 * 예)
 * seat = 0 0 0 0 0 0 0
 * 
 * 좌석선택 : 1
 * seat = 0 1 0 0 0 0 0
 * 
 * 좌석선택 : 3
 * seat = 0 1 0 1 0 0 0
 * 
 * 좌석선택 : 3
 * seat = 0 1 0 1 0 0 0
 * 이미 예매가 완료된 자리입니다.
 * ----------------------
 * 매출액 : 24000원
 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);		
		int[] seat = new int[7];
		int cnt = 0;
		int sales = 0;
		
		boolean run = true;
		
		while(run) 
		{
			for(int i = 0; i < seat.length; i++)
			{
				System.out.print(seat[i] + " ");
			}
			System.out.println("\n= 영화관 =");
			System.out.println("1.좌석예매");
			System.out.println("2.종료");
			
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			
			if(sel == 1) 
			{
				for(int i = 0; i < seat.length; i++)
				{
					System.out.print(seat[i] + " ");
				}
				System.out.print("\n좌석을 선택해주세요[1~7] : ");
				int seatNum = scan.nextInt() - 1;
				
				if(seat[seatNum] == 1) 
				{
					System.out.println("이미 예매가 완료된 자리입니다.");
					continue;
				}
				else
				{
					cnt++;
					seat[seatNum] = 1;
				}
			}
			else if(sel == 2) 
			{
				sales = cnt * 12000;
				run = false;
			}
			System.out.println("매출액 : " + sales);
		}
		scan.close();
		
		
	}

}
