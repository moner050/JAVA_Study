package arraySentence;

import java.util.Scanner;

public class FindMaxArray {
	/*
	 * # 최대값 구하기
	 * 1. 가장 큰 값을 찾아 입력한다.
	 * 2. 정답이면 해당 값을 0으로 변경한다.
	 * 3. arr배열의 모든 값이 0으로 변경되면 프로그램은 종료된다.
	 * 예)
	 * 11, 87, 42, 100, 24
	 * 입력 : 100
	 * 
	 * 11, 87, 42, 0, 24
	 * 입력 : 87
	 * 
	 * 11, 0, 42, 0, 24
	 */
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int[] arr = {11, 87, 42, 100, 24};
		
		while(true)
		{
			int cnt = 0;
			int max = 0;
			int maxIdx = 0;
			// 배열출력 및 최대값 찾기
			for(int i = 0; i < arr.length; i++)
			{
				if(max < arr[i]) 
				{
					max = arr[i];
					maxIdx = i;
				}
				
				if(arr[i] == 0)
				{
					cnt++;
				}
				System.out.print(arr[i] + " ");
			}
			
			if(cnt == 5) break;
			
			System.out.print("\n배열 내의 가장 큰 값을 찾으시오 : ");
			int ipMax = scan.nextInt();
			
			if(max == ipMax) { arr[maxIdx] = 0;}
			else continue;
		}
		
		scan.close();

	}

}
