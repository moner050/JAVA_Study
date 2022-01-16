package ch01;

public class MinMaxProblem {

	public static void main(String[] args) {

		// 배열의 최대값과 최솟값을 찾아 그 위치를 각각 출력하기.
		
		int numbers[] = {10, 55, 23, 2, 79, 101, 16, 82, 30, 45};
		int min = numbers[0], max = numbers[0];
		int minIdx = 0, maxIdx = 0;
		
		for(int i = 1; i < numbers.length; i++)
		{
			if(numbers[i] < min)
			{
				min = numbers[i];
				minIdx = i + 1;
			}
			
			if(numbers[i] > max)
			{
				max = numbers[i];
				maxIdx = i + 1;
			}
		}
		
		System.out.println("가장 큰 값은 " + max + "이고 그 위치는 " + maxIdx + "번째 이다.");
		System.out.println("가장 작은 값은 " + min + "이고 그 위치는 " + minIdx + "번째 이다.");
	}

}
