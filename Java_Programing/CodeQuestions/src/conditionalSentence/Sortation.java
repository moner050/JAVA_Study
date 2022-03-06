package conditionalSentence;

public class Sortation {

	public static void main(String[] args) {


		// 문제 1) 양수, 0, 음수 출력
		int num1 = 10;
		
		if(num1 > 0) {System.out.println("양수");}
		else if(num1 == 0) {System.out.println("0");}
		else {System.out.println("음수");}
		
		// 문제 2) 4의 배수 출력
		int num2 = 6;
		if(num2 % 4 == 0) {System.out.println("4의 배수입니다.");}
		else {System.out.println("4의 배수가 아닙니다.");}
				
		// 문제 3) 합격, 불합격 출력
		int score = 70;
		if(score > 70) {System.out.println("합격");}
		else if(score <= 70) {System.out.println("불합격");}
		
	}

}
