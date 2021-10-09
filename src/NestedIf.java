import java.util.Scanner;
public class NestedIf {
	public static void main(String[] args) {
		// Scanner의 객체 생성
		Scanner scan = new Scanner(System.in);
		
		// scan객체를 이용해 점수 입력 받기
		System.out.print("점수를 입력하세요(0~100): ");
		int score = scan.nextInt();
		
		// scan객체를 이용해 학년 입력 받기 
		System.out.print("학년을 입력하세요(1~4): ");
		int year = scan.nextInt(); 

		if(score >= 60) 						// 점수가 60점 이상이며
		{
			if(year != 4)						// 4학년이 아닐때
			{
				System.out.println("합격!"); 		// 합격
			}
			else if(score >= 70)				// 4학년인데 70점 이상이면
			{
				System.out.println("합격!"); 		// 합격
			}
			else								// 4학년이 70점 미만이면
				System.out.println("불합격!"); 	// 불합격
		}
		else 									// 60점 미만이면 불합격
			System.out.println("불합격!");

		// 스캐너 종료
		scan.close();
	}
}
