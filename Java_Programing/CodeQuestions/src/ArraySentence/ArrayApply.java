package ArraySentence;

import java.util.Scanner;

public class ArrayApply {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int a[] = { 10, 49, 51, 36, 17 };
		int idx = 0;
		// 문제 1) 다음 리스트를 값을 입력하면   번호 출력 
		// 예) 51 ==> 2
		// 예) 10 ==> 0
		System.out.print("리스트의 값을 입력하세요 : ");
		int ipList = scan.nextInt();
		
		for(int i = 0; i < a.length; i++)
		{
			if(ipList == a[i]) {idx = i;}
		}
		System.out.println("번호 : " + idx + "번");

		// 문제 2) 다음 리스트를 이용해서 a 의 값중 홀수만 b 에 저장(위치는 동일한위치에 저장)
		// 예) b = [0, 49, 51, 0, 17]
		int b[] = { 0,0,0,0,0 };
		for(int i = 0; i < a.length; i++)
		{
			if(a[i] % 2 != 0) {b[i] = a[i];}
			System.out.print(b[i] + " ");
		}

		System.out.println();
		// 문제 3) 다음 리스트를 이용해서 a 의 값중 홀수만 c 에 저장(위치는 앞에서 부터  저장)
	    // 2번문제와 조금 다름
		// 예) c = [49, 51, 17, 0, 0]
		int c[] = { 0,0,0,0,0 };
		int cnt = 0;
		for(int i = 0; i < a.length; i++)
		{
			if(a[i] % 2 != 0) 
			{
				c[cnt] = a[i];
				cnt++;
			}
		}
		for(int i = 0; i < c.length; i++)
		{
			System.out.print(c[i] + " ");
		}
		
		//-------------------------------------------------
		int arr[] = {1001, 20, 1002, 45, 1003, 54};
		// 학번과 점수가 한쌍이다. ==>  1001:20 , 1002:45 , 1003:54
		
		// 문제4) 학번을 입력하면 점수 출력 
		// 예) 1001==>20 , 1003 ==> 54
		idx = 0;
		System.out.print("\n학번을 입력해주세요 : ");
		int ipSNum = scan.nextInt();

		for(int i = 0; i < arr.length; i += 2)
		{
			if(ipSNum == arr[i]) {idx = i;}
		}
		System.out.print("점수 : " + arr[idx+1]);
		
		// 문제5) 점수를 입력하면 학번 출력 
		// 예) 20 ==> 1001 , 45 ==> 1002
		idx = 0;
		System.out.print("\n점수를 입력해주세요 : ");
		int ipScore = scan.nextInt();

		for(int i = 1; i < arr.length; i += 2)
		{
			if(ipScore == arr[i]) {idx = i;}
		}
		System.out.print("학번 : " + arr[idx-1]);
		
		scan.close();
	}

}
