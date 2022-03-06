package ArraySentence;

public class NoviceArray {

	public static void main(String[] args) {
		int[] arr = new int[5];

		// 문제1) 10부터 50까지 arr 배열에 저장
		// 정답1) 10 20 30 40 50
		for(int i = 1; i <= 5; i++)
		{
			arr[i-1] = i * 10;
			System.out.print(arr[i-1] + " ");
		}

		// 문제2) 전체 합 출력
		// 정답2) 150
		int total = 0;
		for(int i = 0; i < arr.length; i++)
		{
			total += arr[i];
		}
		System.out.println("\n" + total);
		

		// 문제1) 4의 배수만 출력
		// 정답1) 20 40
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i] % 4 == 0) 
			{
				System.out.print(arr[i] + " ");	
			}
		}

		// 문제2) 4의 배수의 합 출력
		// 정답2) 60
		total = 0;
		for(int i = 0; i < 5; i++)
		{
			if(arr[i] % 4 == 0) 
			{
				total += arr[i];
			}
		}
		System.out.println("\n" + total);

		// 문제3) 4의 배수의 개수 출력
		// 정답3) 2
		int cnt = 0;
		for(int i = 0; i < 5; i++)
		{
			if(arr[i] % 4 == 0) 
			{
				cnt++;
			}
		}
		System.out.println(cnt);

		
	}

}
