package ArraySentence;

import java.util.Scanner;

public class ChangeResult {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int[] arr = { 10, 20, 30, 40, 50 };

		// 문제 1) 인덱스 2개를 입력받아 값 교체하기
		// 예 1) 인덱스1 입력 : 1  , 인덱스2 입력 : 3
		// {10, 40, 30, 20, 50}
		int temp = 0;
		
		System.out.print("인덱스1 입력 : ");
		int idx1 = scan.nextInt();
		System.out.print("인덱스2 입력 : ");
		int idx2 = scan.nextInt();
		
		temp = arr[idx1];
		arr[idx1] = arr[idx2];
		arr[idx2] = temp;
		
		for(int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
		
		// 문제 2) 값 2개를 입력받아 값 교체하기
		// 예 2) 값1 입력 : 40 , 값2 입력 : 20
		// {10, 20, 30, 40, 50}
		int r1idx = 0, r2idx = 0;
		temp = 0;
		System.out.print("\n값1 입력 : ");
		int result1 = scan.nextInt();
		System.out.print("값2 입력 : ");
		int result2 = scan.nextInt();
		
		for(int i = 0; i < arr.length; i++)
		{
			if(result1 == arr[i]) {r1idx = i;}
			if(result2 == arr[i]) {r2idx = i;}
		}
		temp = arr[r1idx];
		arr[r1idx] = arr[r2idx];
		arr[r2idx] = temp;
		
		for(int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
		
		
		int[] hakbuns = { 1001, 1002, 1003, 1004, 1005 };
		int[] scores = { 87, 11, 45, 98, 23 };

		// 문제 3) 학번 2개를 입력받아 성적 교체하기
		// 예 3) 학번1 입력 : 1002 , 학번2 입력 : 1003
		// {87, 45, 11, 98, 23}
		int s1idx = 0, s2idx = 0;
		temp = 0;
		
		System.out.print("\n학번1 입력 : ");
		int sNum1 = scan.nextInt();
		System.out.print("학번2 입력 : ");
		int sNum2 = scan.nextInt();
		
		for(int i = 0; i < arr.length; i++)
		{
			if(sNum1 == hakbuns[i]) {s1idx = i;}
			if(sNum2 == hakbuns[i]) {s2idx = i;}
		}
		
		temp = scores[s1idx];
		scores[s1idx] = scores[s2idx];
		scores[s2idx] = temp;
		
		
		for(int i = 0; i < scores.length; i++)
		{
			System.out.print(scores[i] + " ");
		}
		
		scan.close();
	}

}
