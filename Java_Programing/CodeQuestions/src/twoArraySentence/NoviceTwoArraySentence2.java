package twoArraySentence;

import java.util.Scanner;

public class NoviceTwoArraySentence2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[][] arr = new int[3][3];
		
		int k = 1;
		for(int i=0; i<3; i++) 
		{
			for(int j=0; j<3; j++) 
			{
				arr[i][j] = 10 * k;
				k += 1;
			}
		}
		
		// 문제 1) 인덱스 2개를 입력받아 값 출력
		// 예    1) 인덱스1 입력 : 1	인덱스2 입력 : 2
		//		   값 출력 : 60 
		System.out.print("인덱스 1 입력 : ");
		int idx1 = scan.nextInt();
		System.out.print("인덱스 2 입력 : ");
		int idx2 = scan.nextInt();
		System.out.println(arr[idx1][idx2]);
		
		
		// 문제 2) 값을 입력받아 인덱스 2개 출력
		// 예    2) 값 입력 : 60
		//		   인덱스1 출력 : 1	인덱스2 출력 : 2
		int outIdx1 = 0, outIdx2 = 0;
		System.out.print("값 입력 : ");
		int value = scan.nextInt();
		
		for(int i=0; i<3; i++) 
		{
			for(int j=0; j<3; j++) 
			{
				if(value == arr[i][j])
				{
					outIdx1 = i;
					outIdx2 = j;
				}
			}
		}
		
		System.out.printf("인덱스1 출력 : %d\t인덱스2 출력 : %d\n",outIdx1, outIdx2);
		
		
		// 문제 3) 가장 큰 값의 인덱스 2개 출력
		// 정답 3) 2 2
		int maxValue = 0;
		int maxIdx1 = 0, maxIdx2 = 0;
		
		for(int i=0; i<3; i++) 
		{
			for(int j=0; j<3; j++) 
			{
				if(maxValue < arr[i][j])
				{
					maxIdx1 = i;
					maxIdx2 = j;
				}
			}
		}
		System.out.printf("가장 큰 값의 인덱스 %d  %d\n",maxIdx1, maxIdx2);
		
		
		// 문제 4) 값 2개를 입력받아 값 교체
		int changeIdx1 = 0, changeIdx2 = 0;
		int changeIdx11 = 0, changeIdx22 = 0;
		System.out.print("값1 입력 : ");
		int ipValue1 = scan.nextInt();
		System.out.print("값2 입력 : ");
		int ipValue2 = scan.nextInt();

		for(int i=0; i<3; i++) 
		{
			for(int j=0; j<3; j++) 
			{
				if(ipValue1 == arr[i][j])
				{
					changeIdx1 = i;
					changeIdx2 = j;
				}
				if(ipValue2 == arr[i][j])
				{
					changeIdx11 = i;
					changeIdx22 = j;
				}
			}
		}
		int temp = arr[changeIdx1][changeIdx2];
		arr[changeIdx1][changeIdx2] = arr[changeIdx11][changeIdx22];
		arr[changeIdx11][changeIdx22] = temp;
		
		for(int i=0; i<3; i++) 
		{
			for(int j=0; j<3; j++) 
			{
				System.out.print(arr[i][j] + " ");
			}
		}
		System.out.println();
		
		scan.close();
	}

}
