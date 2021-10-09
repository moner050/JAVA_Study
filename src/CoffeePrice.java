import java.util.Scanner;
public class CoffeePrice {

	public static void main(String[] args) {
		// Scanner의 객체 생성
		Scanner scan = new Scanner(System.in);
		
		
		// scan 객체를 이용해 메뉴 입력받기.
		System.out.print("무슨 커피 드릴까요? : ");
		String order = scan.next();
		
		int price = 0;
		
		switch (order) 
		{
			case "에스프레소":
			case "카푸치노":
			case "카페라떼":
				price = 3500;
				break;
			case "아메리카노" :
				price = 2000;
				break;
			default:
				System.out.println("메뉴에 없습니다!");
		}
		
		// 만약 price가 0원이 아니라면 메뉴의 가격 출력.
		if(price != 0)
		{
			System.out.print(order + "는 " + price + "원입니다");
		}
		
		// 스캐너 종료
		scan.close();
	}
}
