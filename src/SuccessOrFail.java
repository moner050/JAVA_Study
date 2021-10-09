import java.util.Scanner;
public class SuccessOrFail {
	public static void main(String[] args) {
		// Scanner의 객체 생성
		Scanner scan = new Scanner(System.in);
		
		// scan객체를 이용해 점수 입력 받기
		System.out.print("점수를 입력하세요: ");
		int score = scan.nextInt();
		
		// 만약 입력받은 점수가 80점과 동등하거나 그 이상이면
		if(score >= 80)
		{
			System.out.println("축하합니다! 합격입니다.");
		}
		else	// 아니면
		{
			System.out.println("불합격입니다.");
		}
		// 스캐너 종료
		scan.close();
	}
}
