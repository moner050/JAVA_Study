package conditionalSentence;

import java.util.Scanner;

public class ReceiptLV1 {

	/*
	 * # 영수증 출력[1단계]
	 * 1. 메뉴판을 출력한다.
	 * 2. 사용자는 주문하고자 하는 메뉴의 번호를 입력한다.
	 * 3. 현금을 입력받는다.
	 * 4. 입력받은 현금과 메뉴가격을 확인해, 영수증을 출력한다.
	 * 5. 단, 현금이 부족한 경우 "현금이 부족합니다."라는 메세지를 출력한다.
	*/
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int price1 = 8700;
		int price2 = 6200;
		int price3 = 1500;
		
		String menuName = "";
		int menuPrice = 0;
		int change = 0;
		
		System.out.println("=== 롯데리아 ===");
		System.out.println("1.불고기 버거 : " + price1 + "원");
		System.out.println("2.새우    버거 : " + price2 + "원");
		System.out.println("3.콜         라 : " + price3 + "원");
		
		System.out.print("주문할 메뉴의 번호를 입력해주세요 : ");
		int menuNum = scan.nextInt();
		
		if(menuNum == 1) 
		{
			menuPrice = price1;
			menuName = "불고기 버거";
		}
		else if(menuNum == 2) 
		{
			menuPrice = price2;
			menuName = "새우 버거";
		}
		else if(menuNum == 3) 
		{
			menuPrice = price3;
			menuName = "콜라";
		}
		
		System.out.print("현금을 입력해주세요 : ");
		int money = scan.nextInt();
		
		if(money > menuPrice)
		{
			change = money - menuPrice;
			System.out.println("\n받은돈 : " + money + "원");
			System.out.println("선택한 메뉴 : " + menuName);
			System.out.println("거스름돈 : " + change + "원");
		}
		else
		{
			System.out.println("현금이 부족합니다.");
		}
		
		
		scan.close();
		
	}
}
