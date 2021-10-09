import java.util.Scanner;
public class GradingSwitch {
	public static void main(String[] args) {
		// Scanner의 객체 생성
		Scanner scan = new Scanner(System.in);
		
		char grade;
		
		// scan 객체를 이용해 점수 입력받기.
		System.out.print("점수를 입력하세요(0~100): ");
		int score = scan.nextInt();
		
		// 입력받은 점수 값을 10으로 나눈뒤
		switch (score/10) 
		{
			case 10: 					// score = 100점이거나
			case 9: 					// score가 90~99점 이면
				grade = 'A';			// 학점은 A
				break;
			case 8: 					// score가 80~89점 이면
				grade = 'B';			// 학점은 B
				break;
			case 7: 					// score가 70~79점 이면
				grade = 'C';			// 학점은 C
				break;
			case 6: 					// score가 60~69점 이면
				grade = 'D';			// 학점은 D
				break;
			default: 					// score가 59점 이하이면
				grade = 'F';			// 학점은 F
		}
		System.out.println("학점은 "+grade+"입니다");
		
		// 스캐너 종료
		scan.close();		
	}
}
