package for_Command;

import java.util.Scanner;

public class ArrayAccess {

	public static void main(String[] args) {
		// Scanner의 객체 생성
		Scanner scan = new Scanner(System.in);
		
		int intArray[] = new int[5];					// 배열 생성
		int max = 0;									// 가장 큰 수를 저장할 변수 선언.
		
		System.out.println("양수 5개를 입력하세요.");
		for(int i = 0; i < 5; i++)
		{
			intArray[i] = scan.nextInt();				// scan 객체를 이용해 정수 입력받아 배열[i]에 넣기
			if(intArray[i] > max)						// 배열에 저장된 값이 max보다 크면
			{
				max = intArray[i];						// max에 배열의 값 저장.
			}
		}
		System.out.println("가장 큰 수는" + max + "입니다.");
		
		// 스캐너 종료.
		scan.close();
	}
}
