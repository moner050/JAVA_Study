import java.util.Scanner;
public class MultipleOfThree {
	public static void main(String[] args) {
		// Scanner의 객체 생성
		Scanner scan = new Scanner(System.in);
		
		// scan객체를 이용해 수를 입력 받기
		System.out.print("수를 입력하세요 : ");
		int num = scan.nextInt();
		
		// num이 3으로 나누어 떨어지면
		if (num % 3 == 0)
		{
			System.out.println("3의 배수입니다.");
		}
		else // 아니면
			System.out.println("3의 배수가 아닙니다.");

		// 스캐너 종료
		scan.close();
	}
}
