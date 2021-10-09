package for_Command;

import java.util.Scanner;

public class ArrayLength {

	public static void main(String[] args) {
		// Scanner의 객체 생성
		Scanner scan = new Scanner(System.in);
		
		int intArray[] = new int[5];								// 배열 선언후 생성.
		int sum = 0;												// 배열에 있는 값을 더할 변수 선언.
		
		System.out.print(intArray.length + "개의 정수를 입력하세요>> ");
		
		for(int i = 0; i < intArray.length; i++)
		{
			intArray[i] = scan.nextInt();							// 배열의 크기만큼 정수 입력받기.
		}
		
		for(int i = 0; i < intArray.length; i++)
		{
			sum += intArray[i];										// 배열의 크기만큼 배열에 입력된 수들을 sum에 더해주기.
		}
		
		System.out.println("평균 : " + (double)sum/intArray.length);	// 평균값 출력.
		
		// 스캐너 종료
		scan.close();
	}
}
