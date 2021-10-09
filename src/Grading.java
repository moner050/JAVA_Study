import java.util.Scanner;
public class Grading {
	public static void main(String[] args) {
		// Scanner의 객체 생성
		Scanner scan = new Scanner(System.in);
		
		char grade;
		
		// scan객체를 이용해 점수 입력 받기
		System.out.print("점수를 입력하세요(0~100): ");
		int score = scan.nextInt();
		
		if(score >= 90) 		// 입력받은 점수가 90점 이상이면 grade는 A
			grade = 'A';
		else if(score >= 80) 	// 점수가 80 이상 90 미만이면 grade는 B
			grade = 'B';
		else if(score >= 70) 	// 점수가 70 이상 80 미만이면 grade는 C
			grade = 'C';
		else if(score >= 60) 	// 점수가 60 이상 70 미만이면 grade는 D
			grade = 'D';
		else 					// 점수가 60 미만이면 grade는 F
			grade = 'F';
		
		// 학점 출력
		System.out.println("학점은 "+ grade + "입니다.");
		
		// 스캐너 종료
		scan.close();
	
	}
}
